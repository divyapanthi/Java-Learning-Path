import java.util.Scanner;

public class FahrenheitToCelsius {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.println("Welcome to Temperature Converter");
        System.out.print("Enter the temperature(in Fahrenheit): ");
        float fahrenheitTemp = input.nextFloat();
        float celsiusTemp = (fahrenheitTemp - 32) * 5.0f/9.0f;
        System.out.println("The temperate is "+celsiusTemp +" degree celcius.");

    }
}
