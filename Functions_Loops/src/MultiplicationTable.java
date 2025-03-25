import java.util.Scanner;

public class MultiplicationTable {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Welcome to Multiplication Table\n");
        System.out.println("Enter the number you want multiplication table of: ");
        int number = input.nextInt();
        printMultiplicationTable(number);


    }

    public static void printMultiplicationTable(int num) {
        int i = 1;
        while(i<=10) {
            int multiple = num * i;
            System.out.println(num+" * "+ i+" = "+ multiple);
            i++;
        }
    }
}
