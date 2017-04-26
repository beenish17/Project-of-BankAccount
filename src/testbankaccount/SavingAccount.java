
package testbankaccount;

public class SavingAccount extends BankAccount{
   final double  profit=0.15;
    SavingAccount(){
    
    }
    public String deposit_Money(double amDeposit) {

        if (amDeposit >= 5000 && (amDeposit % 5 == 0)) {
            return super.deposit_Money(amDeposit);
        } else 
            return "Your money is not valid to add";
        }
    public String checkBalance(){
        
        return super.checkBalance();
    }
    public String With_draw(double withdraw){
        
        System.out.println("Enter the month for how long you have submitted money.");
        int month=Input.nextInt();
        if(month >=3 && Total_balance>=5000 ){
            return super.With_draw(withdraw);
        }else 
            return "u cant withdraw.";
    }
     public String Profit_per_Month(){
        System.out.println("Enter the month for how long you have submitted money.");
        int month=Input.nextInt();
        double profit=Total_balance*((double)15/100);
        double Total= month*profit;
        return "Profit is;  " + Total;
    }
     
    
}
