import java.util.Scanner;

public class GreatestOfThree {
    public static void main(String[] args) {
        System.out.println("Welcome to the World of Three\n");
        Scanner input = new Scanner(System.in);

        System.out.println("Please enter three numbers");
        int a = input.nextInt();
        int b = input.nextInt();
        int c = input.nextInt();

        if (a>=b && a>=c) {
            System.out.println("The number "+a +" is greatest");
        } else if (b>=c) {
            System.out.println("The number "+b+" is greatest");
        } else System.out.println("The number "+c+" is greatest");
    }
}
