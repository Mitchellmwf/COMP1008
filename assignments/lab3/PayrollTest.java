package assignments.lab3;
public class PayrollTest {
 
    public static void main(String[] args) {
 
        // TODO 9: Create a CommissionEmployee object
        CommissionEmployee ce = new CommissionEmployee("Steve", "Jobs", "123-45-6789", 10000, .05);
 
        // TODO 10: Display employee details
        System.out.println(ce);
        
        // TODO 11: Display earnings
        System.out.print("\n" + ce.earnings());
    }
}
 