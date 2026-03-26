import javafx.application.Application;
import javafx.scene.Scene;
import javafx.scene.control.*;
import javafx.scene.layout.*;
import javafx.stage.Stage;
 
 
public class JavaFXLearningActivity extends Application {
 
 
    @Override
    public void start(Stage stage) {
 
 
        // ===================================================== 
        // ================= PART 1 ============================
        // GUI vs CLI (Concept to Code) 
        // =====================================================
        //javac JavaFXLearningActivity.java --module-path "C:/Java/javafx-sdk-26/lib" --add-modules javafx.controls
        //java --module-path "C:/Java/javafx-sdk-26/lib" --add-modules javafx.controls JavaFXLearningActivity.java
 
        // STEP 1:
        // Create a Label with text:
        // "This is a GUI Application"
        Label title = new Label("This is a GUI Application");
 
 
        // STEP 2:
        // Create a Scene with the label
        // Set width = 300, height = 200
        Scene scene = new Scene(title, 300, 200);
 
        // STEP 3:
        // Set the scene to stage
        // Set title: "GUI vs CLI Demo"
        // Show the stage
        stage.setScene(scene);
        stage.setTitle("GUI vs CLI Demo");
        //stage.show();
 
        // =====================================================
        // ================= PART 2 ============================
        // JavaFX Controls
        // =====================================================
 
 
        // STEP 4:
        // Create the following controls:
        // Label: "Enter Name:"
        // TextField for name input
        // Button: "Submit"
        // Label for output
        Label nameLabel = new Label("Enter Name:");
        TextField nameInput = new TextField();
        Button submitButton = new Button("Submit");
        Label outputLabel = new Label();
 
        // STEP 5:
        // Set button action:
        // When clicked, display:
        // "Hello <name>" in output label
        submitButton.setOnAction(e -> {
            String name = nameInput.getText();
            if (name.isEmpty()) {
                outputLabel.setText("Name cannot be empty");
            } else {
                outputLabel.setText("Hello " + name);
            }
        });

        // =====================================================
        // ================= PART 3 ============================
        // Layouts (Containers)
        // =====================================================
 
        // STEP 7:
        // Create an HBox for buttons (if needed)
        // Add button inside HBox
        HBox hbox = new HBox(10);
        hbox.getChildren().add(submitButton);
        
        // STEP 8:
        // Create a GridPane for form:
        // Add "Enter Name" label and TextField
        GridPane gridPane = new GridPane();
        gridPane.setHgap(10);
        gridPane.setVgap(10);
        gridPane.add(nameLabel, 0, 0);
        gridPane.add(nameInput, 1, 0);
 
        // STEP 6:
        // Create a VBox layout with spacing 10
        // Add all controls into VBox
        VBox vbox = new VBox(10);
        vbox.getChildren().addAll(title, gridPane, hbox, outputLabel);
 
 
 
        // =====================================================
        // ================= PART 4 ============================
        // Event Handling
        // =====================================================
 
 
        // STEP 9:
        // Modify button click:
        // If input is empty → show "Name cannot be empty"
        // Else → show greeting message
 
 
 
 
 
 
 
 
 
 
        // =====================================================
        // ================= PART 5 ============================
        // MVC Concept (Understanding)
        // =====================================================
 
 
        // STEP 10:
        // Identify:
        // View → (Write which components)
        // Controller → (Which part handles click)
        // Model → (Where data is stored)
        
        
 
 
 
 
 
 
 
 
        // =====================================================
        // ================= PART 6 ============================
        // Scene Setup
        // =====================================================
 
 
        // STEP 11:
        // Create a Scene using VBox layout
        // Set size 350 x 250
        Scene mainScene = new Scene(vbox, 350, 250);
 
 
 
 
 
 
 
 
 
        // STEP 12:
        // Set Scene to Stage and display it
        stage.setScene(mainScene);
 
 
 
 
 
 
 
 
 
    }
 
 
    public static void main(String[] args) {
        launch(args);
    }
}
 