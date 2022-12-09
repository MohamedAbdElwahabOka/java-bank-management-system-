
package bank.account;


public abstract class Employee  {
     private String Name;
     private String Address;
     private int Social_Security_Number;
     private String gender;

    public  Employee() {
    }

    public Employee(String Name, String Address, int Social_Security_Number, String gender) {
        this.Name = Name;
        this.Address = Address;
        this.Social_Security_Number = Social_Security_Number;
        this.gender = gender;
    }

    public String getName() {
        return Name;
    }

    public void setName(String Name) {
        this.Name = Name;
    }

    public String getAddress() {
        return Address;
    }

    public void setAddress(String address) {
        this.Address = address;
    }

    public int getSocial_Security_Number() {
        return Social_Security_Number;
    }

    public void setSocial_Security_Number(int Social_Security_Number) {
        this.Social_Security_Number = Social_Security_Number;
    }

    public String getGender() {
        return gender;
    }

    public void setGender(String gender) {
        this.gender = gender;
    }
    public abstract double Earnings();

    @Override
    public String toString() {
        return "Employee{" + "Name=" + Name + ", Address=" + Address + ", Social_Security_Number=" + Social_Security_Number + ", gender=" + gender + '}';
    }
    
    
}
