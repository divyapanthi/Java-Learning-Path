import java.util.Scanner;

public class LeapYear {
    // WAP that determines if a given year is a leap year (considering
    // conditions like divisible by 4 but not 100, unless divisible by 400.)
    public static void main(String[] args) {
        System.out.println("Welcome to Leap Year Calculator");
        Scanner input = new Scanner(System.in);

        System.out.println("Enter any year");
        int year = input.nextInt();

        if ((year % 4 == 0 && year % 100 !=0) || year%400 == 0) {
            System.out.println("Its leap year");
        } else {
            System.out.println("Not leap year");
        }
    }
}
