// Program to print numbers 1 to 100 without using any loop(for/while/do-while).

public class PrintNumbers {

    public static void printNumbers(int n) {
        if (n <= 100) {
            System.out.println(n);
            printNumbers(n + 1);  // Recursive call with n + 1
        }
    }

    public static void main(String[] args) {
        printNumbers(1);
    }
}
