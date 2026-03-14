public class ArrayDemo {
    public static void main(String[] args) {
 
        // STEP 1: Declare and initialize an integer array
        int[] numbers = {10, 20, 30, 40, 50};
 
        // STEP 2: Access and print each element
       for (int i=0; i < numbers.length; i++) {
            System.out.println("Element at index " + i + ": " + numbers[i]);
        }
 
        // STEP 3: Modify an element
        numbers[2] = 35; // Change 30 to 35
        System.out.println("Modified element at index 2: " + numbers[2]);
 
        // STEP 4: Find the sum of all elements
        int sum = 0;
        for (int num : numbers) {
            sum += num;
        }
        System.out.println("Sum of all elements: " + sum);
        
    }