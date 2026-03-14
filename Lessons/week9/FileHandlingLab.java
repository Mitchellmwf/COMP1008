/*Students practice:
 
File writing
File reading
File append operations
JSON serialization
JSON deserialization
Directory operations
Object-oriented programming 
Exception handling
 
*/
import java.io.File;
import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Paths;
import java.nio.file.StandardOpenOption;
import java.util.ArrayList;
import java.util.List;
 
 
import com.fasterxml.jackson.databind.ObjectMapper;
import com.fasterxml.jackson.databind.SerializationFeature;
 
 
public class FileHandlingLab {
 
 
    // -------------------------------------
    // Student Class
    // -------------------------------------
    static class Student {
 
 
        public int id;
        public String name;
        public String course;
 
 
        // TODO 1:
        // Create a default constructor
        public Student(){

        }
 
        // TODO 2:
        // Create a parameterized constructor that initializes
        // id, name, and course
        public Student(int id, String name, String course){
            this.id = id;
            this.name = name;
            this.course = course;
        }
 
 
 
        // TODO 3:
        // Override toString() to display student info
        // Format example: 101: John - Java
        @Override
        public String toString(){
            return id + ": " + name + " - " + course;
        }
 
    }
 
 
    public static void main(String[] args) {
 
 
        try {
 
 
            // -------------------------------------
            // 1. TEXT FILE WRITING
            // -------------------------------------
 
 
            String textFile = "students.txt";
 
 
            // TODO 4:
            // Write the header "Student List" to the file
            Files.write(Paths.get(textFile), "student List\n".getBytes());
 
            // TODO 5:
            // Append two student records
            // Example:
            // 101 - John - Java
            // 102 - Alice - Python
            Files.write(Paths.get(textFile), "101: Batman - Python".getBytes(), StandardOpenOption.APPEND);
            Files.write(Paths.get(textFile), "102: Robin - Java".getBytes(), StandardOpenOption.APPEND);
            
 
 
            // -------------------------------------
            // 2. READ TEXT FILE
            // -------------------------------------
 
 
            // TODO 6:
            // Read the entire file content into a String
            String content = new String(Files.readAllBytes(Paths.get(textFile)));
 
            // TODO 7:
            // Print the content to the console
            System.out.println("Text file content: " + content);
 
 
 
            // -------------------------------------
            // 3. CREATE STUDENT OBJECTS
            // -------------------------------------
 
 
            List<Student> students = new ArrayList<>();
 
            // TODO 8:
            // Add two Student objects to the list
            students.add(new Student(103, "John", "CSS"));
            students.add(new Student(104, "Ryan", "PHP"));
 
 
 
            // -------------------------------------
            // 4. JSON SERIALIZATION
            // -------------------------------------
 
 
            // TODO 9:
            // Create ObjectMapper object
            ObjectMapper mapper = new ObjectMapper();
 
            // TODO 10:
            // Enable pretty printing (INDENT_OUTPUT)
            mapper.enable(SerializationFeature.INDENT_OUTPUT);
 
            String jsonFile = "students.json";
 
 
            // TODO 11:
            // Convert the students list into JSON
            // and save it into the json file
            mapper.writeValue(new File(jsonFile), students);
            System.out.println("JSON file created: " + students); 
 
 
            // -------------------------------------
            // 5. JSON DESERIALIZATION
            // -------------------------------------
 
 
            // TODO 12:
            // Read the JSON file back into a List
            List loadedStudents = mapper.readValue(new File(jsonFile), List.class);
 
            // TODO 13:
            // Print the loaded students
            System.out.println("\nLoaded students from JSON");
 
 
 
            // -------------------------------------
            // 6. DIRECTORY CREATION
            // -------------------------------------
 
 
            File directory = new File("DataFolder");
 
 
            // TODO 14:
            // If directory does not exist, create it
            if(!directory.exists()){
                directory.mkdir();
            }
 
            // TODO 15:
            // Print whether directory exists
            System.out.println("\nDirectory exists: " + directory.exists() );
 
 
 
            // -------------------------------------
            // 7. LIST FILES IN DIRECTORY
            // -------------------------------------
 
 
            File currentDirectory = new File(".");
            System.out.println("\nFiles in the current directory: ");
 
 
            // TODO 16:
            // Loop through files and print file names
            for (File file: currentDirectory.listFiles()){
                System.out.println(file.getName());
            }
 
 
 
        }
        catch (IOException e) {
 
 
            System.out.println("Error: " + e.getMessage());
 
 
        }
    }
}