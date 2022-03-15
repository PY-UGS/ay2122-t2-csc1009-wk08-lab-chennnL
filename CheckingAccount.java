public class CheckingAccount {
    private int number;
    private double balance;

    public void deposit(double amount) throws IllegalArgumentException {
        if (amount <= 0) {
            throw new IllegalArgumentException("Deposit amount cannot be negative or 0");
        } else {
            balance += amount;
        }
    }

    public void withdraw(double amount) throws InsufficientFundsException {
        if (balance - amount <= 0){
            throw new InsufficientFundsException(-(balance - amount));
        }
        else {
            System.out.println("The balance after withdraw is: $" + (balance - amount));
        }

    }

    public int getNumber() {
        return number;
    }

    public void setNumber(int number) {
        this.number = number;
    }

    public double getBalance() {
        return balance;
    }

    public void setBalance(double balance) {
        this.balance = balance;
    }
}
