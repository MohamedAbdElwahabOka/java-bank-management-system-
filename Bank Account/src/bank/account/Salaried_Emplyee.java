
package bank.account;


public class Salaried_Emplyee extends Employee implements Display  {
    
    private double Salary;
    private double Bonus;
    private double Deductions;

    public Salaried_Emplyee(){
    }

    public Salaried_Emplyee(double Salary, double Bonus, double Deductions, String Name, String Address, int Social_Security_Number, String gender) {
        super(Name, Address, Social_Security_Number, gender);
        this.Salary = Salary;
        this.Bonus = Bonus;
        this.Deductions = Deductions;
    }
 
    public double getSalary() {
        return Salary;
    }

    public void setSalary(double Salary) {
        this.Salary = Salary;
    }

    public double getBonus() {
        return Bonus;
    }

    public void setBonus(double Bonus) {
        this.Bonus = Bonus;
    }

    public double getDeductions() {
        return Deductions;
    }

    public void setDeductions(double Deductions) {
        this.Deductions = Deductions;
    }

    @Override
    public double Earnings() {
       return (Salary+Bonus)-Deductions;
    }
      @Override
    public String toString() {
       
                     return (" Salaried Emplyee : " + "Salary=" + Salary + ", Bonus=" + Bonus + ", Deductions=" + Deductions );
                     
    }

    @Override
    public void Display_All_Details() {
       System.out.println("╔═══════════════════════════════════════════════════════╗");
       System.out.println("║ "+(super.toString())); 
       System.out.println("║  "+toString());
       System.out.println("╚═══════════════════════════════════════════════════════╝");
    }

    @Override
    public void Display_Earnings() {
        System.out.println(Earnings());
    }

   @Override
    public String getBank_Name() {
         return Bank_Name;
    }

    @Override
    public String getTel_Bank() {
        return Tel_Bank;
    }
    
    
    
           
}
