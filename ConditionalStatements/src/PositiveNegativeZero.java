import java.util.Scanner;

public class PositiveNegativeZero {
    public static void main(String[] args) {
        //15. WAP that determines if a number is positive, negative or zero.
        System.out.println("Welcome to Number Checker");
        Scanner input = new Scanner(System.in);

        System.out.println("Please enter your number");
        int number = input.nextInt();

        if (number > 0) System.out.println("The number is positive number");
        else if (number == 0) System.out.println("The number is zero");
        else System.out.println("The number is negative number");
    }
}
