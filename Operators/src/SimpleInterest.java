import java.util.Scanner;

public class SimpleInterest {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        // WAP to calculate the simple interest
        System.out.println("Welcome to Simple Interest Calculator: ");
        System.out.println("Please enter your principal amount(in Rs): ");
        int principal = input.nextInt();
        System.out.println("Now, Tell me your the rate of interest(in percentage): ");
        float rate = input.nextFloat();
        System.out.println("Now, tell me for how many years are you borrowing this money ");
        float time = input.nextInt();

        float simpleInterest = (principal*time*rate)/100;
        System.out.println("The simple interest is: "+simpleInterest);

    }
}
