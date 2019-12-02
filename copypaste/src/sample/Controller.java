* RobotRace.c
        *
        *
        *
        *  Group Name: Group 6
        *  Group members:
                         Alabed,Malek
        *                 Fu Yuanqing
        *                 Li Xiaoye
        *                 Jin Lai
        *
        */

        #include <avr/io.h>
        #define F_CPU 16000000UL
        #include <stdio.h>
//#define BAUD 9600
//#define MYUBRR F_CPU/16/BAUD-1
        #include <util/delay.h>
        #include <avr/interrupt.h>
        #include "uart.h"

        #define kp 3  // 3  constant of proportionality #######????
        #define kd 0
        // ( Note: kp 0.9 and kd 0.2)  constant of derivative #######(??:kp 0.9?kd 0.2)?????####### ####### #####
        #define ki 0
        // constant of integral

// defining the base and max speed of both motors
        #define rightMax 250
        // max speed of the robot
        #define leftMax 250
// max speed of the robot
        #define rightBase50
//  is perfectly on the line
        #define leftBase 50
        // --- 50 --
        #define Threshold  100
//100 ---

        float integral =0;
// initializing the integral
        float derivative =0;
// initializing the derivative

        uint8_t count =0;
        //initializing the counter
        uint8_t n_lap=5;
        // run number

        uint8_t  LM_speed =0;
        //initializing the left motor speed to control the PWM of left motor
        uint8_t RM_speed =0;
        //initializing the right motor speed to control the PWM of right motor

        uint8_t adc_reading[] ={0,0,0,0,0,0,0,0};
        // initializing an array for storing the sensor reading
        int lastError = 0;
        // initializing the error



//portable function declaration
        void Move_forward(float Lspeed,float Rspeed);
        void  Turn_left(int speed);
        void  Turn_right(int speed);
        void selectADCchannel(uint8_t channel);
//uint8_t sensor_read(uint8_t sensor);
        void followTrack(int T_position);
        void Avoid_Obstacle();
        void M_stop();
        void pwm_init();
        void init_ADC();
        void startConvertion();
        void init_Timer0();
        void blutooth();

//
        float ratio =0;
        // the ratio of threshold vs current sensor reading
        float LSpeed = 0;
//left motor speed
        float RSpeed = 0 ;
// right motor speed
        int controlFlag;
        char RX = '0';

        int main(void)
        {

        //DDRD = (1<<PORTD6)|(1<<PORTD7)|(1<<PORTD0)|(1<<PORTD5); //setting it for outpute.
        DDRD =0xff;
        DDRC =0x00;
        DDRB |=(1<<0);

        //ADC initialization
        init_ADC();
        //Timer0 initialization
        init_Timer0();
        //blutooth();
        initUART0();
        sei();
        //Start ADC conversion
        startConvertion();

        // variables to hold the detection start/stop line
        int b_flag =0;
        int w_flag =0;

        while (1)
        {

        //Start move forward and follow track
        // a variable which hold the bluetooth command
        if (controlFlag==1)
        {
        followTrack(Threshold);
        if (adc_reading[0]>=800) b_flag ++;
        _delay_ms(5);
        if (adc_reading[0]<=60) w_flag ++;
        if (b_flag ==2 && w_flag ==2)
        {
        count++;
        b_flag=0;
        w_flag=0;
        }
        if (count ==n_lap)
        {
        M_stop();
        Turn_right(100);
        Move_forward(50,50);
        M_stop();
        }
        if (adc_reading[4]>205||adc_reading[5]>205||adc_reading[6]>205)
        {
        Avoid_Obstacle();
        }

        }
        // Stop for 5 seconds and go
        if (controlFlag==2)
        {
        Move_forward(0,0);
        _delay_ms(5000);
        controlFlag=1;
        }
        // Stop
        if (controlFlag==3)
        {
        Move_forward(0,0);
        }

        }

        }
        // blutooth

        ISR(USART_RX_vect){
        // Assigning the received data  to a variable Rx.
        RX= UDR0;
        switch (RX)
        {
        case 'A':   //start command received
        controlFlag =1;
        break;

        case 'B': //stop for 5 seconds and go command received
        controlFlag =2;
        break;

        case 'C': // stop command received
        controlFlag =3;
        break;

default:
        break;
        }

        }
        //ADC interrupt service routine
        ISR(ADC_vect){
        //get current channel ??
        uint8_t currentChannel = ADMUX & 0x47;
        //set output compare registers for current channel ??????
        switch(currentChannel){
        case 0x40: adc_reading[0] = ADC;  //IR sensor for detecting start stop line???????
        break;
        case 0x41: adc_reading[1] = ADC;  //IR sensor for tracking the track ???????
        break;
        case 0x42: adc_reading[2] = ADC;
        break;
        case 0x43: adc_reading[3] = ADC;
        break;
        case 0x44: adc_reading[4] = ADC; //proximity sensor right
        break;
        case 0x45: adc_reading[5] = ADC; //proximity sensor front
        break;
        case 0x46: adc_reading[6] = ADC; //proximity sensor left
        break;
        case 0x47: adc_reading[7] = ADC;
        break;
        }

        //loop through channels from 0 to 8
        if(currentChannel == 7)
        selectADCchannel(0x00);
        else
        selectADCchannel(currentChannel+1);

        //ADCSRA |= 1<<ADSC;
        startConvertion();
        }

//************** channel selection function ****************
        void selectADCchannel(uint8_t channel){
        //0xE0 is 1110 0000
        ADMUX = (ADMUX & 0xE0) | (channel & 0x47);
        }

//************** Start conversion **************************
        void startConvertion(){
        ADCSRA |= 1<<ADSC;
        }

//initializing ADC
        void init_ADC(){
        ADMUX =0b01000000;
        ADCSRA=0b10001111;
        }

//initialization of timer0
        void init_Timer0(){
        TCCR0A = 0b10100011;
        //TCCR0A = (1<<COM0A1)|(1<<WGM00)|(1<<WGM01);
        TCCR0B = (1<<CS00);
        TIMSK0 =(1<<TOIE0);
        }

//Timer 0 overflow vector
        ISR(TIMER0_OVF_vect){
        OCR0A = LM_speed; // right motor
        OCR0B =RM_speed;  //left motor
        }


//function for forward movement
        void Move_forward(float Lspeed,float Rspeed){

        //PORTD |=(1<<PORTD2)|(1<<PORTD7)|!(1<<PORTD4);
        PORTD =0b0000100;
        //pd7 -->1 and pb0 --0  cw rotation  for right motor
        PORTB |=0x01;
        //pd7--> 0 and pb0 -->1  ccw rotation for right motor.
        //pd2-->0 and pd4--1    cw rotation for left motor.
        LM_speed =Lspeed;
        RM_speed =Rspeed;

        }

//function for turning Right.
        void Turn_right(int speed){
        PORTD =0b00010000;
        //Binary is speed is
        PORTB =0b00000001;
        LM_speed =speed;
        RM_speed =speed;
        }

//function for turning left.
        void Turn_left(int speed){
        PORTD =0b10000100;
        PORTB =0b00000000;
        LM_speed =speed;
        RM_speed =speed;
        }

// Function for stopping the motor.
        void M_stop(){
        LM_speed =0;
        RM_speed =0;
        }

        uint8_t sensor_read(uint8_t sensor){
        _delay_ms(100);
        return adc_reading[sensor];
        }
        //pwm initialization
        void pwm_init(){
        //TIMER0 (8 bit timer)
        //set pins 5D(OC0B) and 6D(OC0A) as output
        DDRD |= 1<<DDD5 | 1<<DDD6;
        //set fast-pwm mode
        TCCR0A |= 1<<WGM00;
        //set non-inverting mode for both pins
        TCCR0A |= 1<<COM0A1 | 1<<COM0B1;
        //set prescaler to 256
        TCCR0B |= 1<<CS02;

        }


// Function for avoiding the obstacle .
        void Avoid_Obstacle(){
        //front proximity  5, right proximity 4, left proximity 6.

        if ((adc_reading[5] >205)) //205  front sensor
        {
        // check free side
        if (adc_reading[4]<200)
        {
        while (adc_reading[4]<200)
        {
        Move_forward(100,0);

        }

        //Turn_left(80);
        }
        if (adc_reading[6]<100)
        {
        while (adc_reading[4]<200)
        {
        Move_forward(100,0);

        }
        }

        }
        if (adc_reading[4]>205)
        {
        while (adc_reading[4]>204)
        {
        Move_forward(0,100);

        }
        }
        if (adc_reading[6]>205)
        {
        while (adc_reading[6]>204)
        {
        //Move_forward(100,0);
        RSpeed=0;
        LSpeed=90;
        }
        }

        }
        // Pid function for following the track.
        void followTrack(int T_position){

        int C_position = adc_reading[1];
        ratio = (C_position / T_position);

        int error =T_position - C_position ;
        integral = integral + C_position;
        derivative = error - lastError;
        lastError = error;
        LSpeed = ((leftBase * ratio)* kp  - ((integral * kd) - (derivative * kd))) ;
        //kp 0.9 and kd 0.2
        RSpeed = ((leftBase /ratio)* kp  + ((integral * kd) + (derivative * kd))) ;

        if (LSpeed>rightMax) LSpeed = rightMax;
        // prevent the motor from going beyond max speed
        if (RSpeed> leftMax ) RSpeed = leftMax;
        // prevent the motor from going beyond max speed
        if (LSpeed < 0) LSpeed = 0;
        // keep the motor speed positive
        if (RSpeed< 0) RSpeed = 0;
        // keep the motor speed positive

        Move_forward(RSpeed,LSpeed);

        }