package lessons.week5;
// STEP 2: Define CommissionEmployee as a subclass
public class CommissionEmployee extends Employee {
    private double grossSales;        // weekly sales
    private double commissionRate;    // percentage
 
 
    public CommissionEmployee(String first, String last, String ssn,
                              double sales, double rate) {
        super(first, last, ssn);
        // TODO: set grossSales and commissionRate with validation
        setGrossSales(sales);
        setCommissionRate(rate);
    }

    public void setGrossSales(double sales) {
        if (sales < 0.0) {
            throw new IllegalArgumentException("Gross sales must be >= 0.0");
        }
        this.grossSales = sales;
    }

    public void setCommissionRate(double rate) {
        if (rate <= 0.0 || rate >= 1.0) {
            throw new IllegalArgumentException("Commission rate must be > 0.0 and < 1.0");
        }
        commissionRate = rate;
    }
 
 
    // TODO: getters and setters for grossSales and commissionRate
    public double getGrossSales() {
        return grossSales;
    }
    public double getCommissionRate() {
        return commissionRate;
    }
 
    @Override
    public double earnings() {
        // TODO: return grossSales * commissionRate
        return getGrossSales() * getCommissionRate();
    }
 
 
    @Override
    public String toString() {
        // TODO: include the super.toString() plus grossSales and commissionRate
        return String.format("%s%n%s: $%.2f; %s: %.2f",
                "CommissionEmployee: " + super.toString(),
                "gross sales", getGrossSales(),
                "commission rate", getCommissionRate());
    }
}