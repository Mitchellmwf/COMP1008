import java.util.*;
import java.util.regex.*;
 
 
public class StringAndRegexLab {
 
 
    public static void main(String[] args) {
 
 
        // =====================================================
        // ================= PART 1 ============================
        // Strings, StringBuilder, Character, Tokenizing
        // =====================================================
 
 
        // STEP 1: Create a String called message
        // Assign value: "Java Programming Language"
        string message = "Java Programming Language";
 
        // STEP 2: Print length of message
        System.out.println("Length of message: " + message.length());
 
        // STEP 3: Print character at index 5
        System.out.println("Character at index 5: " + message.charAt(5));

        // STEP 4: Extract substring "Programming"
        String substring = message.substring(5, 16);
        System.out.println("Extracted substring: " + substring);

        // STEP 5: Compare two strings using equals()
        String str1 = "Hello";
        String str2 = "Hello";
        System.out.println("str1 equals str2: " + str1.equals(str2));
 
        // STEP 6: Convert message to uppercase
        System.out.println("Uppercase message: " + message.toUpperCase());

        // STEP 7: Use StringBuilder
        // Create StringBuilder with "Hello"
        // Append " Java"
        // Insert "Awesome " at beginning
        // Reverse it
        // Print result
        StringBuilder sb = new StringBuilder("Hello");
        sb.append(" Java");
        sb.insert(0, "Awesome ");
        sb.reverse();
        System.out.println("StringBuilder result: " + sb.toString());


        // STEP 8: Use Character class
        // Create char variable
        // Check isDigit, isLetter, isUpperCase
        char ch = 'A';
        System.out.println("Is '" + ch + "' a digit? " + Character.isDigit(ch));
        System.out.println("Is '" + ch + "' a letter? " + Character.isLetter(ch));
        System.out.println("Is '" + ch + "' uppercase? " + Character.isUpperCase(ch));

        // STEP 9: Tokenize this string:
        // "Apple,Banana,Mango"
        // Split by comma and print each fruit
        String fruits = "Apple,Banana,Mango";
        String[] fruitArray = fruits.split(",");
        System.out.println("Fruits:");
        for (String fruit : fruitArray) {
            System.out.println("Fruit: " + fruit);
        }
 
 
 
 
 
        // =====================================================
        // ================= PART 2 ============================
        // Regular Expressions (Pattern & Matcher)
        // =====================================================
 
 
        // STEP 10: Validate Email using regex
        // Create a String email = "student@email.com"
        // Write regex to validate simple email format
        // Print if valid or not
        String email = "student@mail.com";
        String emailRegex = "^[A-Za-z0-9+_.-]+@(.+)$";
        if (email.matches(emailRegex)) {
            System.out.println("Valid email: " + email);
        } else {
            System.out.println("Invalid email: " + email);
        }
 
        // STEP 11: Replace digits in a string
        // Example: "Java123"
        // Replace all digits with "*"
        String input = "Java123";
        String replaced = input.replaceAll("\\d", "*");

        // STEP 12: Extract all numbers from string
        // Example: "Order number is 4567"
        // Use Pattern and Matcher
        // Print matched number
        String order = "Order number is 4567";
        Pattern pattern = Pattern.compile("\\d+");
        Matcher matcher = pattern.matcher(order);
        if (matcher.find()) {
            System.out.println("Extracted number: " + matcher.group());
        }
 
        // STEP 13: Check if string contains only letters
        // Example: "JavaOnly"
        // Print true/false
        String alphaString = "JavaOnly";
        System.out.println("Does '" + alphaString + "' contain only letters? " + alphaString.matches("[A-Za-z]+"));

        // STEP 14: Split sentence using regex
        // Sentence: "Java   is   powerful"
        // Split by multiple spaces
        // Print each word
        String sentence = "Java   is   powerful";
        String[] words = sentence.split("\\s+");
        System.out.println("Words in sentence:");
        for (String word : words) {
            System.out.println("Word: " + word);
        }   

    }
}