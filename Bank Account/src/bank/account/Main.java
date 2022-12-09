
package bank.account;
import java.util.Scanner;

public class Main {
   
    public static void main(String[] args) {
         Scanner input = new Scanner (System.in);
         
         Welcome();
         int m;
         do{
             
         
         front_list();
         System.out.print("Please enter your choice:");
         m= input.nextInt();
         
      switch(m){
          case 1:
                 Manger(input);
             
                  break;
             
          case 2:
              
            Employee(input);
            
                  break;
           
          case 3:
                 

                        Account Accounts [] = new Account[10];
                        int Number_Of_Accounts = 0;
                        int choice;

                        do {
                            choice = Show_Menu(input);


                               switch (choice) {
                                   case 1:
                                       Accounts[Number_Of_Accounts++] = Create_Account(input);

                                       break;
                                   case 2:
                                       Apply_Deposit(Accounts, Number_Of_Accounts, input);
                                       break;
                                   case 3:
                                        Apply_Withdraw(Accounts, Number_Of_Accounts, input);
                                       break;
                                   case 4:
                                       Apply_Interest(Accounts, Number_Of_Accounts, input);
                                       break;
                                   default:
                                       System.out.println("Good bye! I hope you have a good day");
                                       break;
                               }

                        } while(choice != 5);
                              break;
           default:
               Display d =new Manager_Access();
               System.out.println();
               System.out.println();
               System.out.println("Good bye! I hope you have a good day");
               System.out.println("With best wishes from "+d.getBank_Name()+" Bank" );
               System.out.println("Contact us to inquire via: "+d.getTel_Bank());
               System.out.println();
               System.out.println();
              
              break;
                       
         }
      }while(m!=4);
       
      
         
    }
    /***************************** Start Menus *******************************************/
    
      public static void Welcome(){
         System.out.println("╔══════════════════╗");
         System.out.println("║                               ║");
         System.out.println("║                               ║");
         System.out.println("║     Welcome to our Bank       ║");
         System.out.println("║                               ║");
         System.out.println("║                               ║");
         System.out.println("╚══════════════════╝");
    }
    /***************************************************************************************************************************/
     public static void front_list(){
         
         System.out.println("╔══════════════════╗");
         System.out.println("║                               ║");
         System.out.println("║ 1-Manger                      ║");
         System.out.println("║ 2-Employee                    ║");
         System.out.println("║ 3-Customer                    ║");
         System.out.println("║ 4-Exit                        ║");
         System.out.println("║                               ║");
         System.out.println("╚══════════════════╝");
          
     } 
     /*******************************************************************************************************************************************/
    
     /*******************************************************************************************************************************************/
     
      public static void Bank_Account_Menu(){
        System.out.println("╔════════════════════════════╗");
        System.out.println("║               Bank Account Menu                ║");              
        System.out.println("╠════════════════════════════╣");
        System.out.println("║                                                ║");
        System.out.println("║  1-Create New Account                          ║");
        System.out.println("║  2-Deposit                                     ║");
        System.out.println("║  3-Withdraw                                    ║");
        System.out.println("║  4-Apply Interest                              ║");
        System.out.println("║  5-logout                                      ║");
        System.out.println("║                                                ║");
        System.out.println("╚════════════════════════════╝");
      }
     public static void  Hallo_Mr_Mohamed(){
         System.out.println("╔═════════════╗");
         System.out.println("║  Hallo Mr Mohamed    ║");  
         System.out.println("╚═════════════╝");
     }
     public static void Accounts_Types(){
        System.out.println("╔═════════════════╗");
        System.out.println("║    Select Account Type      ║ ");
        System.out.println("╠═════════════════╣");
        System.out.println("║    1. Checking Account      ║");
        System.out.println("║                             ║");
        System.out.println("║    2. Savings Account       ║");
        System.out.println("║                             ║");
        System.out.println("╚═════════════════╝");
     }
     
    /******************************************************* End Menus ****************************************************/

  /********************************************************Start Employee Method**************************************************/
     public static void Employee (Scanner input){
         System.out.println("Hi If you want show your Earnings press 1 if you want to back press 2  ");
         int C;
        C=input.nextInt();
        switch(C){
            case 1:
              
                break;
                
                
            
        }
        
                } 
     /********************************************************End Employee Method**************************************************/
     /********************************************************Start Manger Method**************************************************/
     
     
     public static void Manger (Scanner input){
         int ID;
         int PassWord;
         do{
                     System.out.print("Enter Your ID: ");
                     ID = input.nextInt();
                 if(ID==1216){
                     do{
                     System.out.print("Enter Your PassWord:");
                     PassWord=input.nextInt();
                 if(PassWord==123){
                       System.out.println();
                       Hallo_Mr_Mohamed();       
                       Manager_Access M1=new Manager_Access();
                       M1.Manager_Access_and_Storag_Employees(input);
                         
                   }else{
                       System.out.println("PsssWord is Worng ");
                   }
                         
                     }
                 while(PassWord != 123);
                     
                  
                 }else{
                      System.out.println("Id "+ID+" is not found");
                     
                 }
                 
                     
                 }while(ID != 1216);
        }
    /********************************************************End Manger Method**************************************************/
      
 
 /********************************************************************************************************************************************/
     public static int Show_Menu(Scanner input){
       
         Bank_Account_Menu();  
        int C;
        do {
            System.out.print("Enter choice: ");
            C = input.nextInt();
            if(C < 1 || C > 5){
                System.out.println("Please enter a number from 1 to 5"); 
            } 
             
        } while(C < 1 || C > 5);
        return C;
     }  
     
     
     /***********************************************************************************************************************/
     
     
      public static Account Create_Account(Scanner input) {

        Account account = null; 
        int choice = Accounts_Types(input);
        
        int Number_Account;
        System.out.print("Enter Account Number: ");
        Number_Account = input.nextInt();

        if(choice == 1)  { // chekcing account 
            System.out.print("Enter Transaction Fee: ");
            double fee = input.nextDouble();
            account = new CheckingAccount(Number_Account, fee);
        } else { // Savings account
            
            System.out.print("Please enter Interest Rate: ");
            double interest_Rate = input.nextDouble();
            account = new SavingAccount(interest_Rate,Number_Account);
        }
        return account;
    }
      
    
    /************************************************************************************************************************/
      
     
   
    
    public static int Accounts_Types(Scanner input) {
       
          Accounts_Types();
        int C;
        do {
            System.out.print("Enter choice: ");
            C = input.nextInt();
            if(C < 1 || C > 2){
                System.out.println("Please choose 1 or 2"); 
            } 
        }while(C < 1 || C > 2);
        
        return C;
    } 

    
   /*************************************************************************************************************************/
  
     
     
     
     public static void Apply_Deposit(Account Accounts [], int count,Scanner input){
         System.out.print("Please enter account number: ");
     
         int Number_Account = input.nextInt();

        // search for account
        int index = search_For_Account(Accounts, count, Number_Account);

        if(index >= 0) {
            // Amount
            System.out.print("Please enter Deposit Amount: ");
            double amount = input.nextDouble();
            Accounts[index].deposit(amount);
        } else {
            System.out.println("No account exist with AccountNumber: " + Number_Account);
        }
         
     }
     
    
    
     /*******************************************************************************************************************/
     
     
     public static void Apply_Withdraw(Account Accounts [], int count,Scanner input){
          System.out.println("Please enter account number: ");
     
         int Number_Account = input.nextInt();

        // search for account
        int index = search_For_Account(Accounts, count, Number_Account);

        if(index >= 0) {
            // Amount
            System.out.print("Please enter withdraw Amount: ");
            double amount = input.nextDouble();

            Accounts[index].withdraw(amount);
        } else {
            System.out.println("No account exist with AccountNumber: " + Number_Account);
        }
     }
     
     
     /**********************************************************************************************************************/
     
     
     
     public static void Apply_Interest(Account Accounts [], int count, Scanner input) {
        // Get the account number
        System.out.print("\nPlease enter account number: ");
        //Num_Account
        int Number_Account = input.nextInt();

        // search for account
        int index = search_For_Account(Accounts, count, Number_Account);

        if(index >= 0) {
            
            // must be instance of savings account
            if (Accounts[index] instanceof SavingAccount) {
                ((SavingAccount)Accounts[index]).applyInterest();
            }
        } else {
            System.out.println("No account exist with AccountNumber: " + Number_Account);
        }}
     
     
     
   
    
  /*************************************************************************************************************************/
     
     
     
     public static int search_For_Account(Account Accounts [],int count, int Number_Account){
         for(int i=0; i<count; i++) {
            if(Accounts[i].getAccount_Number() == Number_Account) {
                return i;
            }
        }

        return -1; 
         
     }
     
     /*************************************************************************************************************************/
     
     
     
    
     
    
    
    
   
}



