import java.util.Scanner;

public class BankDemoTest {
    public static void main(String [] args) throws InsufficientFundsException {
        CheckingAccount ben = new CheckingAccount();
        Scanner sc = new Scanner(System.in);

        try {
            System.out.println("Enter the amount to deposit:");
            double depositAmount = sc.nextDouble();
            ben.deposit(depositAmount);
            System.out.println("Enter the amount to withdraw:");
            double withdrawAmount = sc.nextDouble();
            ben.withdraw(withdrawAmount);
        } catch (InsufficientFundsException e) {
            System.out.println("Sorry, but your account is short by: $" + e.getAmount());
        }
        catch (IllegalArgumentException e) {
            System.out.println(e.getMessage());
        }

    }
}
