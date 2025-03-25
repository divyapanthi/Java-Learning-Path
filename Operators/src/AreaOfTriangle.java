import java.util.Scanner;

public class AreaOfTriangle {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        // WAP to calculate the area of triangle.  A(Triangle) = 1/2*B*H

        System.out.println("Welcome to Area Calculator");

        System.out.println("Enter the base of the triangle");
        double base = input.nextInt();
        System.out.println("Enter the height of the triangle");
        double height = input.nextInt();

        double area = (base * height)/2;
        System.out.println("The area of triangle is "+area + "cms2");
    }
}
