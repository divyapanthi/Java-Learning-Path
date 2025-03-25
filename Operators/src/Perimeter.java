import java.util.Scanner;

public class Perimeter {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        // WAP to calculate the perimeter of rectangle.  P(ABCD) = A+B+C+D
        System.out.println("Welcome to Perimeter Calculator\n");
        System.out.print("Enter all the four sides of rectangle: ");
        double a = input.nextDouble();
        double b = input.nextDouble();
        double c = input.nextDouble();
        double d = input.nextDouble();

        double perimeterOfRectangle = a + b + c + d;
        System.out.println("The perimeter of rectangle is: "+perimeterOfRectangle);

    }
}
