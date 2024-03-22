/* Problem: You are building a banking application where you have different types of accounts 
such as Savings Account, Current Account, and Fixed Deposit Account. 
  
=> Implement an abstract class BankAccount with abstract methods deposit, withdraw, and 
  a concrete method getBalance. Each type of account will inherit from this abstract class 
  and implement its own logic for deposit and withdrawal.  
------------------------------------------------------------------------------------------------

abstract class BankAccount {
    protected double balance;

    public BankAccount(double balance) {
        this.balance = balance;
    }

    public abstract void deposit(double amount);

    public abstract void withdraw(double amount);

    public double getBalance() {
        return balance;
    }
}

class SavingsAccount extends BankAccount {
    public SavingsAccount(double balance) {
        super(balance);
    }

    @Override
    public void deposit(double amount) {
        balance += amount;
    }

    @Override
    public void withdraw(double amount) {
        if (amount <= balance) {
            balance -= amount;
        } else {
            System.out.println("Insufficient funds");
        }
    }
}
