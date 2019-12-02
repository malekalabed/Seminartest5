import java.util.Scanner;

public class me {
    public static void main(String[] args) {
        me myapp = new me();
      int positive =   myapp.positivenumb();
        System.out.println("the positive number you entered is " + positive);

    }
    public int positivenumb(){
        int number;
        Scanner input = new Scanner(System.in);
        do {
            System.out.println("Please enter a positive number");
            number = input.nextInt();
        } while (number < 0);
        return number;


    }
}
