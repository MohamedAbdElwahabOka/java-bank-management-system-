package bank.account;

public class SavingAccount extends Account  {

    private double Interest_Rate;

    public SavingAccount() {
    }

    public SavingAccount(double Interest_Rate, int Account_Number) {
        super(Account_Number);
        this.Interest_Rate = Interest_Rate;     
    }
    public double getInterest_Rate() {
        return Interest_Rate;
    }

    public void setInterest_Rate(double Interest_Rate) {
        this.Interest_Rate = Interest_Rate;
    }
    public double calcInterest() {
        return Balance * Interest_Rate;
    }
    public void applyInterest() {
        double Interest_Value = calcInterest();
        System.out.println("The amount of interest added to the balance is= "+Math.round(Interest_Value*100)/100.0);
        deposit(Interest_Value);
        
    }

    
     @Override
    public void deposit(double Deposit_Value) {
        if(Deposit_Value>0){
            
            Balance=Balance+Deposit_Value;
            
            System.out.println("Value that deposited= "+Math.round(Deposit_Value*100)/100.0);
            System.out.println("Current Balance is:"+Math.round(Balance*100)/100.0);
            
        }else{
          System.out.println("You cannot Deposit a value less than zero ");
        }
       
    }

    @Override
    public void withdraw(double Withdraw_Value) {
        if(Withdraw_Value>0){
             if((Withdraw_Value) <= Balance) {
                System.out.println("");
                System.out.println("Amount withdrawn from the account"+Math.round(Withdraw_Value*100)/100.0);
                Balance = Balance - Withdraw_Value;
                System.out.println("Current Balance is: "+Math.round(Balance*100)/100.0);
                
            }
            
        }else{
             System.out.println("You cannot Withdraw a value less than zero ");
        }
        
    }

    
    
    
    
    
}
