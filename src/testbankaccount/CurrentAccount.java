
package testbankaccount;

public class CurrentAccount extends BankAccount {
    
    CurrentAccount(){
        
    }
     public String checkBalance(){
     
         return super.checkBalance();
     }
    public String deposit_Money(double amDeposit){
        
        return super.deposit_Money(amDeposit);
    }
    public String With_draw(double withdraw){
    
        if((Total_balance - with_drawl )>= 1000)
        {
            return super.With_draw(withdraw);
            
        }
        else return "balance is:"+Total_balance;
    }
}
