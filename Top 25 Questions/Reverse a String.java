//Write a java program to reverse a String

//This is the bruteforce method
public class FirstQuestion
{
	public static void main(String[] args) {
        // Sample input string
        String input = "Hello, World!";
    
        String reversed = reverseString(input);
        
        System.out.println("Original String: " + input);
        System.out.println("Reversed String: " + reversed);
    }
    
    public static String reverseString(String str) {
        String reversed = "";
        for (int i = str.length() - 1; i >= 0; i--) {
            reversed += str.charAt(i);  // Append each character to the reversed string
        }
        
        return reversed;
    }
}


//This is second method using String builder method
public class StringReversal {
    public static void main(String[] args) {
        // Sample input string
        String input = "Hello, World!";
        
        String reversed = reverseString(input);
        
        System.out.println("Original String: " + input);
        System.out.println("Reversed String: " + reversed);
    }

    public static String reverseString(String str) {
        StringBuilder reversedString = new StringBuilder(str);
        return reversedString.reverse().toString();
    }
}
