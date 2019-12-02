import java.util.Scanner;
class Task1 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        double balance = 0;
        int input_Counter = 1;
        int deposit_counter=0;
        int withdraw_counter =0;
        while (input_Counter <= 10) {
            System.out.print("Enter a deposit or withdraw (>0 = deposit , <0 = withdraw) =");
            double a = input.nextDouble();
            if (a<0)
            {System.out.println("(Withdraw)");
                withdraw_counter= withdraw_counter +1;}
            else
            {System.out.println("(Deposit)");
                deposit_counter=deposit_counter +1;}
            balance = balance + a;
            input_Counter = input_Counter + 1;

        }
        System.out.println("Deposits:" + deposit_counter);
        System.out.println("Withdraws:"+ withdraw_counter);
        System.out.println("Your balance is:"+ balance);
    }

}
