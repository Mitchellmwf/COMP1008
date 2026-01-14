import java.util.Scanner;
 
 
/*
    Week 2: Module 2 Learning Activity - Practice Shell
    Concepts to Practice:
    - Variables & Constants
    - if / if…else / nested if
    - switch statements
    - while and for loops
    - Increment (++) / Decrement (--) / Compound Assignment (+=, -=)
    - Typecasting
*/
 
 
class Student {
    // STEP 1: Declare instance variables
    String name;
    int id;
    String program;
    int gradeLevel;
    double gpa;
 
    // STEP 2: Declare a constant (final)
    final double MIN_GPA = 0;
 
    // STEP 3: Method to display student info
    void displayInfo() {
        // TODO: Print all fields
        System.out.println("Student Information:");
        System.out.println("Name: " + name);
        System.out.println("ID: " + id);
        System.out.println("Program: " + program);
        System.out.println("Grade Level: " + gradeLevel);
        System.out.println("GPA: " + gpa);
    }
 
 
    // STEP 4: Conditional statements (if…else)
    void checkGPA() {
        // TODO: Use if…else to check GPA ranges
        if (gpa >= 3.5){
            System.out.println("Honor Student");
        }
        if (gpa >= 2.0){
            System.out.println("You passed");
        }
        else {
            System.out.println("Damn you suck at this LMFAO");
        }
    }
 
 
    // STEP 5: Nested if example
    void checkProgram() {
        // TODO: Nested if for program and GPA
        if (program.equalsIgnoreCase("Computer Science")){
            if (gpa >= 3.5){
                System.out.println("Scholarship awarded for Computer Science");
            }
            else {
                System.out.println("No scholarship for you dumbass Haiya");
            }
        }
    }
 
 
    // STEP 6: Switch statement example
    void gradeDescription() {
        // TODO: Use switch to print school type based on 
        switch(gradeLevel){
            case 1: case 2: case 3:
                System.out.println(name + " is in elementary");
                break;
            case 4: case 5: case 6:
                System.out.println(name + " is in middle school");
                break;
            case 7: case 8: case 9:
                System.out.println(name + " is in Junior High");
                break;
            case 10: case 11: case 12:
                System.out.println(name + " is in High School");
                break;
            default:
                System.out.println("Dropout");
        }
    }
 
 
    // STEP 7: While loop example
    void printNumbersUpToGPA() {
        // TODO: Use while loop, typecast GPA to int
        int count = 1;
        gpa = 4.2;
        while (count <= (int)gpa){
            System.out.println(count + " ");
            count++;
        }
    }
    //Step 7.1 Do-While loop example
    void enterGPAs(){
        Scanner input = new Scanner(System.in);
        double gpaInput;
        do { 
            System.out.println("Enter a GPA (negative to quit): ");
            gpaInput = input.nextDouble();

            if (gpaInput >= 0){
                System.out.println("You entered: " + gpaInput);
            }
            else {
                System.out.println("Exiting...");
            }
        } while (gpaInput >= 0);
        System.out.println("You have exited the GPA entry.");
        
    }
 
    // STEP 8: For loop example
    void printMultiplesOfID() {
        // TODO: Use for loop to print multiples of ID
        for (int i=1; i <=5; i++){
            System.out.println(id * i);
        }
    }

    // Step 8.5 Enhance For loop: used to loop through arrays and objections easily
    //Also called a "For Each" loop

    //for (dataType item : arrayName) {}
    void printSemesterGPA(){
        double[] semesterGPAs = {3.5, 3.7, 3.8, 4.0};
        System.out.println("Printing Semester GPAs:");
        for (double semesterGPA : semesterGPAs){
            System.out.println("Semester GPA: " + semesterGPA);
        }
    }
 
 
    // STEP 9: Increment / Decrement / Compound assignment example
    void updateGPA() {
        // TODO: Demonstrate ++, --, +=, -= with GPA
        System.out.println("Original GPA: " + gpa);
        gpa++; // Increment GPA by 1
        System.out.println("After increment: " + gpa);
        gpa--; // Decrement GPA by 1
        System.out.println("After decrement: " + gpa);
        gpa += 0.2; // Increase GPA by 0.2
        System.out.println("After adding 0.2: " + gpa);
    }
}
 
 
 
// MAIN CLASS
 
public class Main {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
 
 
        System.out.println("==== Week 2: Module 2 Learning Activity ====");
 
 
        // STEP 1: Create a Student object
        Student s1 = new Student();
 
 
        // STEP 2: Assign values to fields (or use Scanner input)
        s1.name = "John Doe";
        s1.id = 12345;
        s1.program = "Computer Science";
        s1.gradeLevel = 11;
        s1.gpa = 3.8;
 
        // STEP 3: Call methods to practice all concepts
        s1.displayInfo();
        s1.checkGPA();
        s1.checkProgram();
        s1.gradeDescription();
        s1.printNumbersUpToGPA();
        s1.printMultiplesOfID();
        s1.printSemesterGPA();
        s1.enterGPAs();
        s1.updateGPA();
    }
}