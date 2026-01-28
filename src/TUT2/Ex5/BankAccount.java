package src.TUT2.Ex5;

public class BankAccount {
    // balance  la so du
    double balance;
    int transactions;
    public double interestRate;
    String holderName;
    public BankAccount (double initial,double interestRate, String holderName){
        this.balance=initial;
        this.transactions = 1;
        this.interestRate=interestRate;
        this.holderName=holderName;
    }
    public void annualInterest (){
        balance+= balance*interestRate;
    }
    public void deposit (double amount){
        balance +=amount;
        transactions++;
    }
    public void withdraw (double amount){
        balance -= amount;
        transactions++;
    }
    public void monthlyFee(){
        this.withdraw(10);
    }
    public double getBalance (){
        return balance;
    }
    public void transfer (double amount, BankAccount targetAccount){
        double fee =0.5;
        if(amount<0){
            System.out.println("Transfer money must be a positive number");
        }
        if (balance < (amount+fee)){
            System.out.println("You do not have anough money to transfer and pay the fee");
        }
        balance -=(amount+fee);
        transactions++;

        targetAccount.balance +=amount;
        targetAccount.transactions++;
        System.out.println("Transfer successful: $" + amount +
                " sent to " + targetAccount.holderName);

    }
    public String toString (){
        if (balance<0){
            return holderName + ", -$" + String.format("%.2f",Math.abs(balance));
        }
        else {
            return (holderName + ", $" + String.format("%.2f",Math.abs(balance)));
        }
    }
}
