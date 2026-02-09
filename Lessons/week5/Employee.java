package lessons.week5;
 
/*
    Module 5 Activity: Inheritance with CommissionEmployee
    Build an Employee superclass and extend it with CommissionEmployee
    and BasePlusCommissionEmployee.
*/
 
 
// STEP 1: Define the Employee superclass
public abstract class Employee {
    private String firstname;
    private String lastname;
    private String socialSecurityNumber;
 
 
    // Constructor
    public Employee(String first, String last, String ssn) {
        // TODO: initialize fields
        this.firstname = first;
        this.lastname = last;
        this.socialSecurityNumber = ssn;
    }
 
 
    // Getters
    // TODO: add getFirstName(), getLastName(), getSocialSecurityNumber()
    public String getFirstName() {
        return firstname;
    }
    public String getLastName() {
        return lastname;
    }
    public String getSocialSecurityNumber() {
        return socialSecurityNumber;
}
 
    // earnings method placeholder
    public abstract double earnings();
 
 
    @Override
    public String toString() {
        // TODO: return formatted "first last\nssn: ###"
        return String.format("%s %s%nssn: %s", getFirstName(), getLastName(), getSocialSecurityNumber());
    }
}
 
 
 
 
