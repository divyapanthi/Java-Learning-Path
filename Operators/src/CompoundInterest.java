import java.util.Scanner;

public class CompoundInterest {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        // WAP to calculate the simple interest
        System.out.println("Welcome to Compound Interest Calculator: ");
        System.out.print("Please enter your principal amount(in Rs): ");
        int principal = input.nextInt();
        System.out.print("Now, Tell me your the rate of interest(in percentage): ");
        float rate = input.nextFloat();
        System.out.print("Now, tell me for how many years are you borrowing this money ");
        float time = input.nextInt();

        // WAP to calculate the compound interest
        double compoundInterest = principal * Math.pow (1 + (rate/100), time);
        System.out.println("The compound interest is: "+compoundInterest);
    }
}
