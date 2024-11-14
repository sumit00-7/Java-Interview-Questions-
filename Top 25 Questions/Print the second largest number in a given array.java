// Write a Java Program to print the second largest number in a given array.

import java.util.Arrays;

public class SecondLargestNumber 
{
	public static void main(String[] args) {
		
		int[] arr = {1, 6, 3, 4, 5, 2};

        System.out.println("Original Array:");
        printArray(arr);
        
        int firstLargest = Integer.MIN_VALUE;
        int secondLargest = Integer.MIN_VALUE;
        
        int n = arr.length-1;
        
        for (int i = 0; i < n; i++) {
            if (arr[i] > firstLargest) {
                secondLargest = firstLargest;
                firstLargest = arr[i];
            } else if (arr[i] > secondLargest && arr[i] != firstLargest) {
                secondLargest = arr[i];
            }
        }
        
        if (secondLargest == Integer.MIN_VALUE) {
            System.out.println("There is no second largest number.");
        } else {
            System.out.println("The second largest number is: " + secondLargest);
        }
	}
	
	public static void printArray(int[] array) {
        for (int num : array) {
            System.out.print(num + " ");
        }
        System.out.println();
    }
}
