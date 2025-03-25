import java.util.Scanner;

public class SumOfDigitsInInteger {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Enter any two digits number");
        int number = input.nextInt();
        System.out.println(sumOfDigits(number));
    }

    public static int sumOfDigits(int number) {
        int sum = 0;
        while (number>0) {
            sum = sum + number % 10;
            number = number / 10;
        }
        return  sum;
    }
}


