package assignments.lab4;
import java.util.*;
import java.util.regex.*;
 
public class StudentValidatorLab {
 
 
    public static void main(String[] args) {
 
 
        Scanner scanner = new Scanner(System.in);
 
 
        // =====================================================
        // PART 1 — NAME VALIDATION (String + Regex)
        // =====================================================
 
 
        // STEP 1:
        // Ask user to enter full name
        System.out.print("Enter full name: ");
        String fullName = scanner.nextLine();
 
 
 
        // STEP 2:
        // Validate name
        // Only letters and spaces allowed
        // Use regex with matches()
        if (fullName.matches("[a-zA-Z ]+")) {
            System.out.println("Nice name.");
        } else {
            System.out.println("Invalid name. Only letters and spaces.");
        }
 
 
 
        // =====================================================
        // PART 2 — STUDENT ID VALIDATION
        // Format: S-1234
        // =====================================================
        
 
        // STEP 3:
        // Ask user to enter student ID
        System.out.print("Enter student ID (S-xxxx): ");
        String studentID = scanner.nextLine();
 
 
 
        // STEP 4:
        // Validate format using regex
        if (studentID.matches("S-\\d{4}")) {
            System.out.println("Welcome to the student portal.");
        } else {
            System.out.println("Invalid ID. Format should be S-xxxx.");
        }
 
 
 
        // =====================================================
        // PART 3 — EMAIL VALIDATION
        // =====================================================
 
 
        // STEP 5:
        // Ask user to enter email
        System.out.print("Enter email: ");
        String email = scanner.nextLine();
 
 
 
        // STEP 6:
        // Validate email format
        if (email.matches("^[A-Za-z0-9+_.-]+@(.+)$")) {
            System.out.println("Valid email.");
        } else {
            System.out.println("Invalid email.");
        }
 
 
 
        // =====================================================
        // PART 4 — SENTENCE PROCESSING
        // =====================================================
 
 
        // STEP 7:
        // Ask user to enter a sentence
        System.out.print("Enter a sentence: ");
        String sentence = scanner.nextLine();
 
 
 
        // STEP 8:
        // Count vowels using Character class
        int vowelCount = 0;
        for (char ch : sentence.toCharArray()) {
            if ("AEIOUaeiou".indexOf(ch) != -1) {
                vowelCount++;
            }
        }
        System.out.println("Number of vowels: " + vowelCount);
 
 
        // STEP 9:
        // Reverse sentence using StringBuilder
        StringBuilder sb = new StringBuilder(sentence);
        String reversed = sb.reverse().toString();
        System.out.println("Reversed sentence: " + reversed);
 
 
        // STEP 10:
        // Replace all digits in sentence with '*'
        String replaced = sentence.replaceAll("\\d", "*");
        System.out.println("Sentence with digits replaced: " + replaced);
 
 
 
        // =====================================================
        // PART 5 — TOKENIZING
        // =====================================================
 
 
        // STEP 11:
        // Create string: "Math,Science,Java,English"
        // Split using comma
        // Print each course
        String courses = "Math,Science,Java,English";
        String[] courseArray = courses.split(",");
        System.out.println("Courses:");
        for (String course : courseArray) {
                System.out.println(course);
        }
 
 
 
        // =====================================================
        // PART 6 — PATTERN & MATCHER
        // =====================================================
 
 
        // STEP 12:
        // Create string: "Invoice number is 4567 and total is 890"
        // Use Pattern and Matcher to extract all numbers
        String invoice = "Invoice number is 4567 and total is 890";
        Pattern pattern = Pattern.compile("\\d+");
        Matcher matcher = pattern.matcher(invoice);
        System.out.println("Extracted numbers:");
        while (matcher.find()) {
            System.out.println(matcher.group());
        }
 
 
 
        scanner.close();
    }
}
 