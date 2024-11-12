// Write a Java Program to reverse an array.



public class ReverseArray {
    public static void main(String[] args) {
        int[] numbers = {1, 2, 3, 4, 5};

        System.out.println("Original Array:");
        printArray(numbers);

        reverseArray(numbers);

        System.out.println("Reversed Array:");
        printArray(numbers);
    }

    public static void printArray(int[] array) {
        for (int num : array) {
            System.out.print(num + " ");
        }
        System.out.println();
    }

  //First method
    public static void reverseArray(int[] array) {
        int left = 0;
        int right = array.length - 1;

        while (left < right) {
            int temp = array[left];
            array[left] = array[right];
            array[right] = temp;

            left++;
            right--;
        }
    }

  // Second method 
    public static void reverseArray(int[] array) {
        int[] num = {1, 2, 3, 4, 5};
        int size = num.length - 1;
        for (int i = 0; i <= size/2; i++){
            int temp = num[i];
            num[i] = num[size-i];
            num[size-i] = temp;
        }
    }
}
