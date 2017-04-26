
package testbankaccount;

import java.util.Scanner;

public class TestBankAccount {

    public static void main(String[] args) {
        
        int option,user_Value;
        Scanner Input=new Scanner(System.in);
        BankAccount bank=new BankAccount();
        CurrentAccount c1=new CurrentAccount();
        SavingAccount s1=new SavingAccount();
               
        System.out.println("This is my so-Called ATM Machine");
        System.out.println("-------------------------------------------------------");
        System.out.println("Select the Menu of your Choice:");
        System.out.println("1:Press 1 for Current Account.");
        System.out.println("2:Press 2 for Saving Account.");
        System.out.println();
        System.out.println("# : Press zero to Quit.");
        System.out.println("-------------------------------------------------------");
        option=Input.nextInt();
while(option!=0){
        switch(option){
            case 1:
                
                System.out.println("Select the option from the menu below.");
                System.out.println("1: Press 1 to Check your balance .");
                System.out.println("2: Press 2 to Deposit balance .");
                System.out.println("3: Press 3 to With-Draw balance .");
                System.out.println("Pres 0 to quit");
                
                user_Value=Input.nextInt();
                while(user_Value!=0){
                if(user_Value==1){
                   
                    System.out.println(c1.checkBalance());
                    System.out.println();
                }
                else if (user_Value==2){
                    
                    System.out.println("Enter the amount you want to deposit");
                    double amDeposit=Input.nextDouble();
                    System.out.println(c1.deposit_Money(amDeposit));
                    System.out.println();
                }
                else if(user_Value==3){
                    System.out.println("Enter the amount you want to with-draw");
                    double withdraw=Input.nextDouble();
                    
                    System.out.println(c1.With_draw(withdraw));
                    System.out.println();
                }
                else
                {
                    System.out.println("You have entered wrong Input ");
                }
                System.out.println("Select the option from the menu below.");
                System.out.println("1: Press 1 to Check your balance .");
                System.out.println("2: Press 2 to Deposit balance .");
                System.out.println("3: Press 3 to With-Draw balance .");
                System.out.println("Pres 0 to quit");
                user_Value=Input.nextInt();
                }
            break;
            case 2:
                System.out.println("Select the option from the menu below.");
                System.out.println("1: Press 1 to Check your balance .");
                System.out.println("2: Press 2 to Deposit balance .");
                System.out.println("3: Press 3 to With-Draw balance .");
                System.out.println("4: Press 4 to Check the Profit-per-MOnth.");
                user_Value=Input.nextInt();
                while(user_Value!=0){
                if(user_Value==1){
                    System.out.println(s1.checkBalance());
                }
                else if(user_Value==2){
                    
                System.out.println("Enter the amount you want to deposit");
                double ammDeposit=Input.nextDouble();
                System.out.println(s1.deposit_Money(ammDeposit));
                }
                else if(user_Value==3){
                    
                System.out.println("Enter the amount you want to with-draw");
                double withdraw=Input.nextDouble();
                System.out.println(s1.With_draw(withdraw));
                
                }
                else if(user_Value==4){
                    System.out.println(s1.Profit_per_Month());
                }
                else{
                    System.out.println("You have entered wrong Input ");}
                
                System.out.println("Select the option from the menu below.");
                System.out.println("1: Press 1 to Check your balance .");
                System.out.println("2: Press 2 to Deposit balance .");
                System.out.println("3: Press 3 to With-Draw balance .");
                System.out.println("4: Press 4 to Check the Profit-per-MOnth.");
                user_Value=Input.nextInt();
                }
                break;
            default:
            {   
                System.out.println("You entered a wrong input");
                break;
            }
        }
        System.out.println("This is my so-Called ATM Machine");
        System.out.println("-------------------------------------------------------");
        System.out.println("Select the Menu of your Choice:");
        System.out.println("1:Press 1 for Current Account.");
        System.out.println("2:Press 2 for Saving Account.");
        System.out.println();
        System.out.println("# : Press zero to Quit.");
        System.out.println("-------------------------------------------------------");
        option=Input.nextInt();
        System.out.println();
}
    }
    
}
