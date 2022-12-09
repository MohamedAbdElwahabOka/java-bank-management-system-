
package bank.account;

public class CheckingAccount extends Account {
     private static  double Payment_Fee;

    public CheckingAccount(){
    super();
    }
    public CheckingAccount(int Account_Number,double Payment_Fee){
    super(Account_Number);
    this.Payment_Fee=Payment_Fee;
    }
   
     
    @Override
    public void deposit(double Deposit_Value) {
        if(Deposit_Value>0){
            
            Balance=Balance+Deposit_Value;
            System.out.println("The Amount you deposited is"+(Math.round(Deposit_Value*100)/100.0));
            Balance=Balance-Payment_Fee;
          
             System.out.println("Discounted expenses is: "+(Math.round(Payment_Fee*100)/100.0));
             System.out.println("Current Balance is:"+Math.round(Balance*100)/100.0);
             
            
            
        }else{
            
            System.out.println("You cannot Deposit a value less than zero ");
        }
       
    }

    @Override
    public void withdraw(double Withdraw_Value) {
        if(Withdraw_Value>0){
             if((Withdraw_Value+Payment_Fee) <= Balance) {


                System.out.println("Amount of withdrawal from the balance is: "+Math.round(Withdraw_Value*100)/100.0);
                Balance = Balance - Withdraw_Value;
                Balance = Balance - Payment_Fee;
                System.out.println("Applicable Fee is: "+Math.round(Payment_Fee*100)/100.0);
                System.out.println("Current Balance is:"+Math.rint(Balance*100)/100.0);
            }
            
        }else{
              System.out.println("You cannot Withdraw a value less than zero ");
        }
        
    }
    
}
