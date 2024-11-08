// Write a Java Program to print the Fibonacci Series.

//This is the simple method to print fibonacci series

import java.util.Scanner;
public class FibonacciSeries {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter the number of terms for Fibonacci series: ");
        int n = scanner.nextInt();

        System.out.println("Fibonacci Series up to " + n + " terms:");

        // First two terms are fixed
        int firstTerm = 0, secondTerm = 1;

        for (int i = 1; i <= n; ++i) {
            System.out.print(firstTerm + " ");

            int nextTerm = firstTerm + secondTerm;
            firstTerm = secondTerm;
            secondTerm = nextTerm;
        }
    }
}

// Fiboncci using recursion

import java.util.Scanner;
public class FibonacciSeriesRecursion {

    public static int fibonacci(int n) {
        if (n <= 1) {
            return n; 
        } else {
            return fibonacci(n - 1) + fibonacci(n - 2);
        }
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter the number of terms for Fibonacci series: ");
        int n = scanner.nextInt();

        System.out.println("Fibonacci Series up to " + n + " terms:");

        for (int i = 0; i < n; i++) {
            System.out.print(fibonacci(i) + " ");
        }
    }
}
