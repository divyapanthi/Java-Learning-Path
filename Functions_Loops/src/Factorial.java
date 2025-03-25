import java.util.Scanner;

public class Factorial {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Enter any number");
        int number = input.nextInt();
        int factorial = 1;
        int i = 1;

        while (i<= number) {
            factorial = factorial * i;
            i++;
        }
        System.out.println("The factorial of "+number+" is: "+factorial);
    }
}

// 5! = 1*2*3*4*5
