import java.util.ArrayList;
import java.util.Arrays;
 
public class Lab4 {
    public static void main(String[] args) {
 
        // Lab 4 – COMP1008 Programming Fundamentals
        // Topic: Arrays & ArrayLists
 
        // ================================================
        // STEP 1: Create an array of grocery items (String)
        // Add at least 6 items to the array
        // Example: {"Milk", "Eggs", "Bread", ... }
        // ================================================
        String[] groceries = {
            // TODO: Fill in your grocery items
            "Milk", "Bread", "Cheese", "Chicken", "Onions", "Eggs", "Flour", "Butter"
        };
 
 
        // ================================================
        // STEP 2: Print the array using Arrays.toString()
        // ================================================
       System.out.println(Arrays.toString(groceries));
 
 
        // ================================================
        // STEP 3: Transfer all array items into an ArrayList
        // Use a loop to add each item
        // ================================================
        ArrayList<String> groceryList = new ArrayList<>();
 
        // TODO: Loop through the array and add items to groceryList
        for (String item : groceries) {
            groceryList.add(item);
        }
    
 
 
        // ================================================
        // STEP 4: Modify the ArrayList
        // Add two new items
        // Remove one item by name or index
        // Print the updated ArrayList
        // ================================================
        groceryList.add("Orange Juice");
        groceryList.add("Cauliflower");
        groceryList.remove("Onions");
        System.out.println(groceryList);
 
 
 
        // ================================================
        // STEP 5: Count how many items start with a vowel
        // Hint: vowels = a, e, i, o, u
        // Use .toLowerCase(). startsWith()
        // ============================================ ====
        int vowelCount = 0;
        for (String item : groceryList) {
            item = item.toLowerCase();
            if (item.startsWith("a") || item.startsWith("e") || item.startsWith("i") || item.startsWith("o") || item.startsWith("u")) {
                System.out.println(item + " starts with a vowel.");
                vowelCount++;
            }
        }
 
        // ================================================
        // STEP 6: Print the final results
        // ================================================
        
    }
}
 