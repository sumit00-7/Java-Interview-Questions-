/* 
Write a Java Program to check if a number is Armstrong number or not.

An Armstrong number (also known as a Narcissistic number) is a number that is equal to the sum of its own digits each raised to the power of the number of digits.

For example:
153 is an Armstrong number because: 1^3 + 5^3 + 3^3 = 153

370 is an Armstrong number because: 3^3 + 7^3 + 0^3 = 370

*/

import java.util.Scanner;

public class ArmstrongNumber {

    public static boolean isArmstrong(int number) {
        int temp = number;
        int digits = 0;
        while (temp != 0) {
            digits++;
            temp /= 10;
        }

        temp = number;
        int sum = 0;
        while (temp != 0) {
            int digit = temp % 10;
            sum += Math.pow(digit, digits);
            temp /= 10;
        }

        return sum == number;
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter a number: ");
        int number = scanner.nextInt();

        if (isArmstrong(number)) {
            System.out.println(number + " is an Armstrong number.");
        } else {
            System.out.println(number + " is not an Armstrong number.");
        }

        scanner.close();
    }
}
