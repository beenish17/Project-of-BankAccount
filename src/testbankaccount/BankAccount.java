
package testbankaccount;

import java.util.Scanner;

public class BankAccount {
    private double check_Balance;
    protected double Total_balance;
    private double amountDeposit;
    protected double with_drawl;
    Scanner Input=new Scanner(System.in);
   
    BankAccount(){
    
    }
    public String checkBalance(){
      
        check_Balance=0;
        check_Balance+=Total_balance=0;
        String result="your current balance is: "+ check_Balance;
        return result;
    }
    public String deposit_Money(double amDeposit){
       
        amountDeposit=amDeposit;
        Total_balance   += amountDeposit;
        String result= "You have successfully deposited the amount,your current balance is: "+ Total_balance;
        return result;
    }
    public String With_draw(double withdraw){
        
        with_drawl = withdraw;
       if (Total_balance == 0) {

            System.out.println("Paise hii nahi hein account ma GAREEB");
            String result = "Your remaining balance is: " + Total_balance;
            return result;
        }
        if (Total_balance > 0) {
            Total_balance = Total_balance - with_drawl;
        }
        String result = "Your remaining balance is: " + Total_balance;
        return result;

    }
   
    
}
