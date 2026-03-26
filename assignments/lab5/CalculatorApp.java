//STARTER CODE
import javafx.application.Application;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.control.TextField;
import javafx.scene.layout.HBox;
import javafx.scene.layout.VBox;
import javafx.stage.Stage;
 
public class CalculatorApp extends Application {
 
    @Override
    public void start(Stage primaryStage) {
 
        // Step 1: Create TextFields for input
        TextField input1 = new TextField();
        TextField input2 = new TextField();
 
        // Step 2: Create Buttons for operations
        Button addBtn = new Button("+");
        Button subBtn = new Button("-");
        Button mulBtn = new Button("*");
        Button divBtn = new Button("/");
 
        // Step 3: Create Label for result
        Label resultLabel = new Label("Results:");
       
        // Step 4: HBox for buttons
        HBox buttonBox = new HBox(10);
        buttonBox.getChildren().addAll(addBtn, subBtn, mulBtn, divBtn);
       
        // Step 5: VBox main layout
        VBox mainLayout = new VBox(10);
        mainLayout.getChildren().addAll(input1, input2 buttonBox, resultLabel);

        // Step 6: Event handling for buttons
        addBtn.setOnAction(e -> {
            resultLabel.setText("Results: " + (Double.parseDouble(input1.getText()) + Double.parseDouble(input2.getText())));
        });
        subBtn.setOnAction(e -> {
            resultLabel.setText("Results: " + (Double.parseDouble(input1.getText()) - Double.parseDouble(input2.getText())));
        });
        mulBtn.setOnAction(e -> {
            resultLabel.setText("Results: " + (Double.parseDouble(input1.getText()) * Double.parseDouble(input2.getText())));
        });
        divBtn.setOnAction(e -> {
            double num2 = Double.parseDouble(input2.getText());
            if (num2 == 0) {
                resultLabel.setText("Results: Cannot divide by zero");
            } else {
                resultLabel.setText("Results: " + (Double.parseDouble(input1.getText()) / num2));
            }
        });

        // Step 7: Create scene and show stage
        Scene scene = new Scene(mainLayout, 350, 250);
        primaryStage.setScene(scene);
        primaryStage.show();
    }
 
    public static void main(String[] args) {
        launch(args);
    }
}
 
//TASKS TO COMPLETE(SUBMIT SCREENSHOTS FOR ALL TASKS)
 
//TODO:Enter numbers in the two TextFields.
 
//TODO:Click any operation button to see the result in the Label.
 
//TODO:Test for division by zero. 
 
//TODO:Try entering invalid input (letters) and observe program behavior (optional: you can handle exceptions for invalid input).
