package assignments.lab3;
public class CommissionEmployee extends Employee {
 
    private double grossSales;
    private double commissionRate;
 
    // TODO 5: Create constructor using super()
    public CommissionEmployee(String firstName, String lastName, String socialSecurityNumber, double grossSales, double commissionRate) {
        super(firstName, lastName, socialSecurityNumber);
        this.grossSales = grossSales;
        this.commissionRate = commissionRate;
    }
 
    // TODO 6: Create getters and setters with validation
    public double getGrossSales() {
        return grossSales;
    }

    public double getCommissionRate() {
        return commissionRate;
    }

    public void setGrossSales(double grossSales) {
        if (grossSales < 0.0) {
            throw new IllegalArgumentException("Gross sales must be >= 0.0");
        }
        this.grossSales = grossSales;
    }

    public void setCommissionRate(double commissionRate) {
        if (commissionRate <= 0.0 || commissionRate >= 1.0) {
            throw new IllegalArgumentException("Commission rate must be > 0.0 and < 1.0");
        }
        this.commissionRate = commissionRate;
    }
 
    // TODO 7: Override earnings()
    @Override
    public double earnings() {
        return getGrossSales() * getCommissionRate();
    }
 
    // TODO 8: Override toString()
    @Override
    public String toString() {
        return String.format("%s%n%s: $%.2f; %s: %.2f",
                "CommissionEmployee: " + super.toString(),
                "gross sales", getGrossSales(),
                "commission rate", getCommissionRate());
    }
}