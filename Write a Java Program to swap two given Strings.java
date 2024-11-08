// Write a Java Program to swap two given Strings

// This is the example with using third variable
public class StringSwap {
    public static void main(String[] args) {
        String str1 = "Sumit";
        String str2 = "Bhatt";
        
        System.out.println("Before Swap:");
        System.out.println("str1 = " + str1);
        System.out.println("str2 = " + str2);
        
        String temp = str1;
        str1 = str2;
        str2 = temp;
        
        System.out.println("\nAfter Swap:");
        System.out.println("str1 = " + str1);
        System.out.println("str2 = " + str2);
    }
}


//This is example of swapping without using third variable
public class StringSwap {
    public static void main(String[] args) {
        String str1 = "Sumit";
        String str2 = "Bhatt";
        
        System.out.println("Before Swap:");
        System.out.println("str1 = " + str1);
        System.out.println("str2 = " + str2);
        
        str1 = str1 + str2; 
        str2 = str1.substring(0, str1.length() - str2.length());
        str1 = str1.substring(str2.length());

        // Output after swapping
        System.out.println("\nAfter Swap:");
        System.out.println("str1 = " + str1);
        System.out.println("str2 = " + str2);
    }
}
