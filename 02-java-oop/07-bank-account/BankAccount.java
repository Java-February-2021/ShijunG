import java.util.Random;

public class BankAccount{

// create attributes 
    private String accountNumber; 
    private double checkingBalance; 
    private double savingsBalance; 
    private static int numberOfAccounts;
    private static double totalAmount;

// create constructor 
public BankAccount(){
    generateAccountNumber();
}

public String getAccountNumber(){
    return accountNumber;
}

private String generateAccountNumber(){
    String subst = "";
    Random rand = new Random();
    for(int i = 0; i < 10; i++) {
        subst += rand.nextInt(10);
    }
    accountNumber= subst;
    return subst;
}

// create setters and getters

public double getCheckingBalance(){
    System.out.println("The checking balance : $" + this.checkingBalance);
    return this.checkingBalance;
}

public double getSavingsBalance(){
    System.out.println("The savings balance : $" + this.savingsBalance);
    return this.savingsBalance;
}

public void setCheckingBalance(double checkingBalance){
    this.checkingBalance = checkingBalance;
}

public void setSavingsBalance(double savingsBalance){
    this.savingsBalance = savingsBalance;
}

//create methods
public void depositChecking(double checkingBalance){
    this.setCheckingBalance(checkingBalance);
    totalAmount += checkingBalance;
}

public void depositSavings(double savingsBalance){
    this.setSavingsBalance(savingsBalance);
    totalAmount += savingsBalance;
}

public double total(){
    totalAmount = savingsBalance + checkingBalance;
    return totalAmount;
}

public void withdrawalChecking(int amount){
    if (getCheckingBalance() < Double.valueOf(amount)){
        System.out.println("not enough money.");
    } 
    else{
        setCheckingBalance(getCheckingBalance() - Double.valueOf(amount));
    }
}

public void withdrawalSavings(int amount){
    if (getSavingsBalance() < Double.valueOf(amount)){
        System.out.println("not enough money.");
    } 
    else{
        this.setSavingsBalance(this.getSavingsBalance() - Double.valueOf(amount));
    }

}
}