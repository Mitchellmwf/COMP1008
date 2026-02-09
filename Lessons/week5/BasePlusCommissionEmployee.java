package lessons.week5;
// STEP 3: Define BasePlusCommissionEmployee subclass
public class BasePlusCommissionEmployee extends CommissionEmployee {
    private double baseSalary;  // additional weekly salary
 
 
    public BasePlusCommissionEmployee(String first, String last, String ssn,
                                      double sales, double rate, double salary) {
        super(first, last, ssn, sales, rate);
        // TODO: validate and set baseSalary
        setBaseSalary(salary);
    }
 
 
    // TODO: getter and setter for baseSalary
    public void setBaseSalary(double salary) {
        if (salary < 0.0) {
            throw new IllegalArgumentException("Base salary must be >= 0.0");
        }
        baseSalary = salary;
    }

    public double getBaseSalary() {
        return baseSalary;
    }
 
    @Override
    public double earnings() {
        // TODO: return baseSalary + super.earnings()
        return getBaseSalary() + super.earnings();
    }
 
 
    @Override
    public String toString() {
        // TODO: include "Base salary" and call super.toString()
        return String.format("base-salaried %s%n%s: $%.2f",
                super.toString(), "base salary", getBaseSalary());
    }
}
 
 

 