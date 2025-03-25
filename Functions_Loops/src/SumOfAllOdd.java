import java.util.Scanner;

public class SumOfAllOdd {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Enter any number");
        int num = input.nextInt();
        int oddSum = printSumOfAllOdd(num);
        System.out.println("The odd sum till "+num+" is "+oddSum);
    }

    public  static int printSumOfAllOdd(int number) {
        int i = 1;
        int sum = 0;
        while(i <= number) {
            sum += i;
            i += 2;
        }
        return sum;
    }
}
