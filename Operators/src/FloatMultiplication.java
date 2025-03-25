import java.util.Scanner;

public class FloatMultiplication {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        // WAP to calculate product of two floating point numbers.
        System.out.println("\nEnter two floating point numbers");
        float myFloat1 =  input.nextFloat();
        float myFloat2 = input.nextFloat();
        System.out.println("The product of "+myFloat1+" and "+myFloat2+" is "+myFloat1*myFloat2);
    }
}
