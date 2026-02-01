import java.util.Scanner;
 
 
/*
    Week 3 Comprehensive Program: Methods, Logical Operators & Enums
    Covers:
    - Static and instance methods
    - Methods with multiple parameters
    - Method overloading
    - Logical operators (&&, ||, !)
    - Method call stack and activation records
    - Using return values
    - Enum types
*/
 
 
public class main {
 
    // STEP 0: Enum for Days (or Game Choices)
    enum Choice {
        ROCK, PAPER, SCISSORS
    }
    
    // STEP 1: Create a method to greet the user
    // public static void greetUser() { ... }
    public static void greetUser() {
        System.out.println("Hello, welcome to the program!");
    }
    
    // STEP 2: Create a method to add two numbers and return the sum
    // public static int addNumbers(int a, int b) { ... }
    public static int addNumbers(int a, int b) {
        return a + b;
    }

    // STEP 3: Create a method to multiply two numbers and return the product
    // public static int multiplyNumbers(int x, int y) { ... }
    public static int multiplyNumbers(int x, int y) {
        return x * y;
    }

    // STEP 4: Create a method to check if number is positive and even using logical operators
    // public static boolean isPositiveAndEven(int n) { ... }
    public static boolean isPositiveAndEven(int n) {
        return n > 0 && n % 2 == 0;
    }

    // STEP 5: Create overloaded methods to display info
    // public static void displayInfo() { ... }
    // public static void displayInfo(String name) { ... }
    // public static void displayInfo(String name, int age) { ... }
    public static void displayInfo() {
        System.out.println("No information provided.");
    }
    public static void displayInfo(String name) {
        System.out.println("Name: " + name);
    }
    public static void displayInfo(String name, int age) {
        System.out.println("Name: " + name + ", Age: " + age);
    }

    // STEP 6: Method that uses enum (simulate game choice)
    // public static void showChoice(Choice choice) { ... }
    public static void showChoice(String player, Choice choice) {
        System.out.println(player + " selected: " + choice);
    }
 
    // STEP 7: Create a method that calls other methods (for method call stack demo)
    // public static int sumAndMultiply(int a, int b) { ... }
    public static int sumAndMultiply(int a, int b) {
        int sum = addNumbers(a, b);
        int product = multiplyNumbers(a, b);
        return sum + product;
    }
 
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
 
 
        System.out.println("==== Week 3: Methods, Logical Operators & Enums Demo ====");


        // STEP 1: Call the greetUser method
        greetUser();

        // STEP 2: Call a method that adds two numbers and returns the sum
        // Example: addNumbers(?, ?);
        int sumResult = addNumbers(5, 10);
        System.out.println("Sum of 5 and 10 is: " + sumResult);

        // STEP 3: Call a method that multiplies two numbers and returns the product
        // Example: multiplyNumbers(?, ?);
        int productResult = multiplyNumbers(4, 6);
        System.out.println("Product of 4 and 6 is: " + productResult);

        // STEP 4: Call a method that checks if a number is positive and even using logical operators
        // Example: isPositiveAndEven(?);
        int testNumber = 8;
        boolean isPosEven = isPositiveAndEven(testNumber);
        System.out.println("Is " + testNumber + " positive and even? " + isPosEven);

        // STEP 5: Call overloaded methods (same name, different parameters)
        // Example: displayInfo();
        // Example: displayInfo("John");
        // Example: displayInfo("John", 25);
        displayInfo();
        displayInfo("John");
        displayInfo("John", 25);

        // STEP 6: Enum usage demo
        // Example: Choice userChoice = Choice.ROCK;
        // Example: Choice computerChoice = Choice.SCISSORS;
        choice userChoice = Choice.ROCK;
        Choice computerChoice = Choice.SCISSORS;
        showChoice("User", userChoice);
        showChoice("Computer", computerChoice);
 
 
        // STEP 7: Method call stack demo by calling other methods
        // Example: sumAndMultiply(?, ?);
        int finalResult = sumAndMultiply(3, 7);
        System.out.println("Final result of sum and multiply (3,7): " + finalResult);
 
 
        scanner.close();
    }
 

}