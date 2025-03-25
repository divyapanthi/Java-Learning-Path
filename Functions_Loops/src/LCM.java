import java.util.Scanner;

// Least Common Multiple
// WAP to find the LCM of two numbers.
// For eg , Numbers are 15,20. So the LCM is 60
// 2,3 - 6
public class LCM {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Enter any two numbers you want LCM of: ");
        int num1 = input.nextInt();
        int num2 = input.nextInt();
        int lcm = findLcm(num1,num2);
        System.out.println("The LCM of these two numbers is: "+lcm);
    }

    public static int findLcm(int firstNum, int secondNum) {
        int i = 1;
        while (true) {
            int factor = firstNum * i;
            if (factor % secondNum == 0) {
                return  factor;
            }
            i++;
        }
    }
}

