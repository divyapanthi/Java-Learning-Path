import java.util.Scanner;

public class OddEven {
    // 16. WAP that determines if a number is odd or even
    public static void main(String[] args) {
        System.out.println("Welcome to Odd Even Calculator");

        Scanner input = new Scanner(System.in);
        System.out.print("Please enter the number: ");
        int number = input.nextInt();

        if (number % 2 == 0) System.out.println("It is even number");
        else System.out.println("It is odd number");
    }
}
