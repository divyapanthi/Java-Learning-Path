import java.util.Scanner;

public class GradeCalculator {
    //19. WAP that calculates grades based on marks.
    // A -> above 90, B - above 75 , C - above 60, D - above 30, F - below 30
    public static void main(String[] args) {
        System.out.println("Welcome to Grade Calculator");
        Scanner input = new Scanner(System.in);

        System.out.println("Please enter your percentage %");
        double marks = input.nextDouble();

        if(marks >= 90) {
            System.out.println("You got A");
        } else if (marks >= 75) {
            System.out.println("You got B");
        } else if (marks >= 60) {
            System.out.println("You got C");
        } else if (marks >= 30) {
            System.out.println("You got D");
        } else {
            System.out.println("You got F");
        }
    }
}
