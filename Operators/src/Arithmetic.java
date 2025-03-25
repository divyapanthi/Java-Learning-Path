import java.util.Scanner;

public class Arithmetic {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.println("--Welcome to Arithmetic Calculator--");
        // WAP that takes two numbers and shows result of all arithmetic operators (+-*/%)
        System.out.print("Enter first number: ");
        int a = input.nextInt();
        System.out.print("Enter second number: ");
        int b = input.nextInt();

        int add  = a + b;
        int sub = a - b;
        int mul = a * b;
        int divide = a / b;
        int modDiv = a % b;

        System.out.println("Addition: "+add);
        System.out.println("Substraction: "+sub);
        System.out.println("Multiplicatio: "+mul);
        System.out.println("Division: "+divide);
        System.out.println("Modular Division: "+modDiv);

    }
}
