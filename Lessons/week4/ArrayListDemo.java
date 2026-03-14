// LESSON 4 - PART 2
 
public class ArrayListDemo {
    public static void main(String[] args) {
 
        // STEP 1: Create an ArrayList of Strings
        ArrayList<String> fruits = new ArrayList<>();
 
        // STEP 2: Add elements to the ArrayList
        fruits.add("Apple");
        fruits.add("Banana");
        fruits.add("Cherry");
        fruits.add("Date");
        fruits.add("Elderberry");
 
        // STEP 3: Print all elements
       for (String fruit : fruits) {
            System.out.println(fruit);
        }
 
        // STEP 4: Remove an element
        fruits.remove("Cherry");
        System.out.println("\nAfter removing Cherry:");
        for (String fruit : fruits) {
            System.out.println(fruit);
        }
 
        // STEP 5: Access element by index
        System.out.println("\nElement at index 1: " + fruits.get(1));
 
        // STEP 6: Check if a fruit exists
        System.out.println("\nDoes the list contain 'Date'? " + fruits.contains("Date"));
        System.out.println("Does the list contain 'Cherry'? " + fruits.contains("Cherry"));
        
} 
}