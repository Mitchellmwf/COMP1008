package lessons.week5;
import java.util.Scanner;

// STEP 4: Main driver class
public class InheritanceDemo {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
 
 
        // TODO: Create objects of CommissionEmployee and BasePlusCommissionEmployee
        CommissionEmployee ce = new CommissionEmployee(
            "Sue", "Jones", "333-33-3333", 10000, .06);
        BasePlusCommissionEmployee bpce = new BasePlusCommissionEmployee(
            "Bob", "Lewis", "444-44-4444", 5000, .04, 300);
 
        // TODO: Print their earnings individually
        System.out.printf("%s%nearned: $%.2f%n%n",
            ce.toString(), ce.earnings());
        System.out.printf("%s%nearned: $%.2f%n%n",
            bpce.toString(), bpce.earnings());

        scanner.close();
    }
}