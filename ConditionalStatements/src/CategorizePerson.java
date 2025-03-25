import java.util.Scanner;

/*
* 20. WAP that categorize a person into different age groups.
* child - below 13
* teen - below 20
* adult - below 60
* senior - above 60
* */
public class CategorizePerson {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.println("Welcome to Person Categorize Calculator");
        System.out.println("Enter your age");
        int age = input.nextInt();

        if (age <= 13) {
            System.out.println("You are a child");
        } else if (age <20) {
            System.out.println("You are a teen");
        } else if (age<60) {
            System.out.println("You are an adult");
        } else {
            System.out.println("You are a senior");
        }
    }
}
