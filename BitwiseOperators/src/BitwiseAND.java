import java.util.Scanner;

public class BitwiseAND {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Showcasing Bitwise Operators\n");
        System.out.println("Enter two numbers:");
        int first = input.nextInt();
        int second = input.nextInt();

        int bitwiseANDResult = first & second;
        int bitwiseOrResult = first | second;
        int bitwiseXOr= first ^ second;

        System.out.println("Bitwise AND: "+bitwiseANDResult);
        System.out.println("Bitwise OR: "+bitwiseOrResult);
        System.out.println("Bitwise XOR: "+bitwiseXOr);

    }
}

/*
* 0 - 0000
* 1 - 0001
* 2 - 0010
* 3 - 0011
* 4 - 0100
* 5 - 0101
* 6 - 0110
* 7 - 0111
* 8 - 1000
* 9 - 1001
* 10 - 1010
* 11 - 1011
* 12 - 1100
* 13 - 1101
* 14 - 1110
* 15 - 1111
* */

/*
* 12 - 1100
* 5 - 0101
* 12 & 5 - 0100 = 4
* */