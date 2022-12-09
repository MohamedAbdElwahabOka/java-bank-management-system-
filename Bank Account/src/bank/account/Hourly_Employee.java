
package bank.account;

public class Hourly_Employee extends Employee implements Display {
     private double Number_Of_Hour;
     private double Hour_Rate;

    public Hourly_Employee() {
    }

    public Hourly_Employee(double Number_Of_Hour, double Hour_Rate, String Name, String Address, int Social_Security_Number, String gender) {
        super(Name, Address, Social_Security_Number, gender);
        this.Number_Of_Hour = Number_Of_Hour;
        this.Hour_Rate = Hour_Rate;
    }
    

    public double getNumber_Of_Hour() {
        return Number_Of_Hour;
    }

    public void setNumber_Of_Hour(double Number_Of_Hour) {
        this.Number_Of_Hour = Number_Of_Hour;
    }

    public double getHour_Rate() {
        return Hour_Rate;
    }

    public void setHour_Rate(double Hour_Rate) {
        this.Hour_Rate = Hour_Rate;
    }

    @Override
    public double Earnings() {
        return Number_Of_Hour * Hour_Rate;
    }

     @Override
    public String toString() {
        return "Hourly_Employee{" + "Number_Of_Hour=" + Number_Of_Hour + ", Hour_Rate=" + Hour_Rate + '}';
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
