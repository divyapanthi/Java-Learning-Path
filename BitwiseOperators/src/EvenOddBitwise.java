import java.util.Scanner;

public class EvenOddBitwise {

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Enter any number");
        int num = input.nextInt();

        // 0000 0111 - Right most bit is 0 - > even, Rightmost bit 1 - odd
        // How to take 1 bit from the number?
        // num & 1 = 0 -> even, 1 - odd
        if ((num & 1) == 1) System.out.println("odd");
        else System.out.println("even");


    }
}


