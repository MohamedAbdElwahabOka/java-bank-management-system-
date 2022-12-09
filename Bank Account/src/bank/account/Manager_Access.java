
package bank.account;


import java.util.ArrayList;
import java.util.Scanner;


public class Manager_Access implements Display  {
   
     ArrayList<Employee> list= new ArrayList <>();
    

    public Manager_Access(){
        
        
    }
    public void Add_Employee1( Employee E1){
        list.add(E1);
    }
    public void Add_Employee5( Employee E1,Employee E2,Employee E3,Employee E4,Employee E5 ){
        list.add(E1); list.add(E2);list.add(E3); list.add(E4);list.add(E5);
    }
    public void Remove_Employee(int i){
        list.remove(i);
    }
   
    public  int  Number_Of_Employees(){
        
        return  list.size();
    }
    
    public void Show_All_Employees_Data(){
        for(int i=0;i<list.size();i++){
            if(list.get(i)instanceof Salaried_Emplyee){
             ((Salaried_Emplyee) list.get(i)).Display_All_Details();
                System.out.println();
            }
            if(list.get(i)instanceof Hourly_Employee){
             ((Hourly_Employee) list.get(i)).Display_All_Details();
             System.out.println();
            }
        }
    }
     public static void Manger_Access_Menu(){
         System.out.println("╔════════════════════╗");
         System.out.println("║                                  ║");
         System.out.println("║ 1-ADD Emplyee                    ║");
         System.out.println("║ 2-Remove Employee                ║");
         System.out.println("║ 3-Show the number of employees   ║");
         System.out.println("║ 4-Show all employee data         ║");
         System.out.println("║ 5-Back                           ║");
         System.out.println("║                                  ║");
         System.out.println("╚════════════════════╝");
        
         
     }
      public static void Types_Of_Employees(){
         System.out.println("╔══════════════════╗");
         System.out.println("║                               ║");
         System.out.println("║ 1-Salaried Emplyee            ║");
         System.out.println("║ 2-Hourly Employee             ║");
         System.out.println("║                               ║");
         System.out.println("╚══════════════════╝");
     }
    
    /************************************************* Start Manager_Access_and_Storag_Employees Method *****************************/
    public static void Manager_Access_and_Storag_Employees(Scanner input){
         /* Start Employee Storag*/
         /*(double Number_Of_Hour, double Hour_Rate, String Name, String Address, int Social_Security_Number, String gender)*/
         Manager_Access M=new Manager_Access();
         Hourly_Employee HE1=new Hourly_Employee(12,505,"Ahmed","33-AhmedOraby-Street",523,"Male");
         Hourly_Employee HE2=new Hourly_Employee(10,210,"Reem","63-Granrnd-Street",562,"Female");
         Hourly_Employee HE3=new Hourly_Employee(13,500,"Ail","Aswan",563,"Male");
         Hourly_Employee HE4=new Hourly_Employee(10,213,"Asmaa","Tanta",107,"Female");
         Hourly_Employee HE5=new Hourly_Employee(14,162,"Ahmed","Aswan",148,"Mail");      
         M.Add_Employee5(HE1,HE2,HE3,HE4,HE5);
         
  //(double Salary, double Bonus, double Deductions, String Name, String Address, int Social_Security_Number, String gender)
         Salaried_Emplyee SE1=new Salaried_Emplyee(5000,316,12,"Ahmed","33-AhmedOraby-Street",523,"Male");
         Salaried_Emplyee SE2=new Salaried_Emplyee(7000,102,23,"Ahmed","Alex",562,"Mail");
         Salaried_Emplyee SE3=new Salaried_Emplyee(8000,125,123,"Ahmed","33-Street",152,"Mail");
         Salaried_Emplyee SE4=new Salaried_Emplyee(10000,56,125,"Ahmed","33-Street",652,"Mail");
         Salaried_Emplyee SE5=new Salaried_Emplyee(13000,12,325,"Ahmed","33-Street",456,"Mail");
         M.Add_Employee5(SE1,SE2,SE3,SE4,SE5);
         /* End Employee Storag*/
         
         /* Start Manger Access */ 
         int choice;
         do{
             
         
         Manger_Access_Menu(); 
             System.out.print("Enter your choice: ");
         choice= input.nextInt();
   switch (choice){
      case 1:
                  
                
               Types_Of_Employees();
               System.out.print("Choice type of Employee: ");
               int Type =input.nextInt();
           switch (Type){
                case 1:
                      String S=input.nextLine();
                      System.out.print("Enter Social Security Number ( SSN ):"); 
                      int SSN = Integer.parseInt(input.nextLine());
                      System.out.print("Enter name Of Employee: ");        
                      String name =input.nextLine();
                      System.out.print("Enter Gender: ");
                      String gander=input.nextLine();
                      System.out.print("Enter Address: ");
                      String address=input.nextLine();
                      System.out.print("Enter Salary: ");
                      int salary= Integer.parseInt(input.nextLine());
                      System.out.print("Enter Bonus: ");
                      int Bonus = Integer.parseInt(input.nextLine());
                      System.out.print("Enter Deductions: ");
                      double Deductions=input.nextDouble();
                      Salaried_Emplyee E1=new Salaried_Emplyee(salary,Bonus,Deductions,name,address,SSN,gander);
                      M.Add_Employee1(E1);

                            break;

                case 2:   
                       String f=input.nextLine();
                       System.out.print("Enter Social Security Number ( SSN ): "); 
                       int ssn=input.nextInt();
                       System.out.print("Enter name Of Employee: ");        
                       String Name =input.nextLine();
                       System.out.print("Enter Gender: ");
                       String Gander=input.nextLine();
                       String y=input.nextLine();
                       System.out.print("Enter Address: "); 
                       String Address=input.nextLine();
                       System.out.print("Enter Number Of Hours: ");
                       double NumberOfHours=input.nextDouble();
                       System.out.print("Enter Hour Rate: ");
                       double Hour_rate=input.nextDouble();
                       Hourly_Employee H1=new Hourly_Employee(NumberOfHours,Hour_rate,Name,Address,ssn,Gander);
                       M.Add_Employee1(H1);
                      
                             break;}
                
     
        case 3:
            System.out.println("the number of Employees now= "+M.Number_Of_Employees());
            break;
        case 2:
             System.out.print("Enter indx for Employee that want to remove : ");
             int inx=input.nextInt();
             int newinx=inx-1;
             M.Remove_Employee(newinx);
             break;
        case 4:
            M.Show_All_Employees_Data();
            System.out.println("The number of Employees now = "+M.Number_Of_Employees());
             break;
        default:
            System.out.println("Thanks Mr.Mohamed have a nice day ");
          }
        
     
        /* END Manger Access */ 
        
     }while(choice!=5);
         }
/************************************* End Manager Access and Storag Employees Method *******************************/
    @Override
    public void Display_All_Details() {
        throw new UnsupportedOperationException("Not supported yet."); 
    }

    @Override
    public void Display_Earnings() {
        throw new UnsupportedOperationException("Not supported yet."); 
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


