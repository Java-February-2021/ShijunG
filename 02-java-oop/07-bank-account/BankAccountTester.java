  
public class BankAccountTester{
    public static void main(String[] args){

        BankAccount account = new BankAccount();
        
        System.out.println("Account number: " + account.getAccountNumber());
        account.getCheckingBalance();
        account.getSavingsBalance();
        account.depositChecking(500);
        account.depositSavings(5000);
        account.withdrawalChecking(200);
        System.out.println(account.getCheckingBalance());
        account.withdrawalSavings(500);
        System.out.println(account.getSavingsBalance());
        account.total();
        System.out.println("The total balance: $" + account.total());
        
   }
}