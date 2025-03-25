import java.util.Scanner;

public class ComplementLeftRightShift {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Enter any number");
        int num = input.nextInt();
        int bitwiseComplement = ~ num;
        int leftShift = num << 1;
        int rightShift = num >> 1;

        System.out.println("Bitwise Complement: "+bitwiseComplement);
        System.out.println("Bitwise Left Shift: "+leftShift);
        System.out.println("Bitwise Right Shift: "+rightShift);
    }
}
