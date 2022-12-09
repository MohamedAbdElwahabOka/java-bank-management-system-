

package bank.account;

public abstract class Account {
    
    private int Account_Number;
    protected double Balance;

    public Account() {
    }
    
    public Account(int Account_Number) {
        this.Account_Number = Account_Number;
        Balance = 0;
    }

    public int getAccount_Number() {
        return Account_Number;
    }

   /* public void setAccount_Number(){ 
    does not have a Set  method Because Account_Number Does not change}*/

    public double getBalance() {
        return Balance;
    }
   /* public void setBalance(double Balance) {
        does not have a Set  method Because Balance Does not change}*/
    public abstract  void deposit(double Deposit_Value );// abstract Method, own body in CheckingAccount Class
    public abstract void withdraw(double Withdraw_Value);//abstract Method, own body in CheckingAccount Class

}
