// Program to check if a number is Prime or not.

import java.util.Scanner;

public class PrimeNumberChecker {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter a number: ");
        int number = scanner.nextInt();

        if (isPrime(number)) {
            System.out.println(number + " is a prime number.");
        } else {
            System.out.println(number + " is not a prime number.");
        }

        scanner.close();
    }

    // Method to check if a number is prime
    public static boolean isPrime(int num) {
        // Validate that the number is neither less than 1 nor equal to 1.
        // It should return false as it cannot be a prime number
        if (num <= 1) {
            return false;
        }

        // Logic to check if a number is prime or not. If its Prime, returns true else return false
        for (int i = 2; i * i <= num; i++) {
            if (num % i == 0) {
                return false;
            }
        }
        
        return true;
    }
}
