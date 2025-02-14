import java.util.Scanner;

// Base class
class Account {
    private String accountNumber;
    private int balance;

    public Account(String accountNumber, int balance) {
        this.accountNumber = accountNumber;
        this.balance = balance;
    }

    public String getAccountNumber() {
        return accountNumber;
    }

    public void setAccountNumber(String accountNumber) {
        this.accountNumber = accountNumber;
    }

    public int getBalance() {
        return balance;
    }

    public void setBalance(int balance) {
        this.balance = balance;
    }

    public String getDetails() {
        return "Account Number: " + accountNumber + ", Balance: " + balance;
    }
}

// SavingsAccount class inheriting from Account
class SavingsAccount extends Account {
    private float interestRate;

    public SavingsAccount(String accountNumber, int balance, float interestRate) {
        super(accountNumber, balance);
        this.interestRate = interestRate;
    }

    public float getInterestRate() {
        return interestRate;
    }

    public void setInterestRate(float interestRate) {
        this.interestRate = interestRate;
    }

    @Override
    public String getDetails() {
        return super.getDetails() + ", Interest Rate: " + interestRate + "%";
    }
}

// CurrentAccount class inheriting from Account
class CurrentAccount extends Account {
    private int overdraftLimit;

    public CurrentAccount(String accountNumber, int balance, int overdraftLimit) {
        super(accountNumber, balance);
        this.overdraftLimit = overdraftLimit;
    }

    public int getOverdraftLimit() {
        return overdraftLimit;
    }

    public void setOverdraftLimit(int overdraftLimit) {
        this.overdraftLimit = overdraftLimit;
    }

    @Override
    public String getDetails() {
        return super.getDetails() + ", Overdraft Limit: " + overdraftLimit;
    }
}

// Main class
public class Main3 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Enter account type (SavingsAccount/CurrentAccount):");
        String accountType = scanner.nextLine().trim();

        System.out.println("Enter details (Format: AccountNumber,Balance,InterestRate/OverdraftLimit):");
        String details = scanner.nextLine().trim();
        String[] detailParts = details.split(",");

        String accountNumber = detailParts[0].trim();
        int balance = Integer.parseInt(detailParts[1].trim());

        if (accountType.equalsIgnoreCase("SavingsAccount")) {
            float interestRate = Float.parseFloat(detailParts[2].trim());
            SavingsAccount savingsAccount = new SavingsAccount(accountNumber, balance, interestRate);
            System.out.println("Account Details: " + savingsAccount.getDetails());
        } else if (accountType.equalsIgnoreCase("CurrentAccount")) {
            int overdraftLimit = Integer.parseInt(detailParts[2].trim());
            CurrentAccount currentAccount = new CurrentAccount(accountNumber, balance, overdraftLimit);
            System.out.println("Account Details: " + currentAccount.getDetails());
        } else {
            System.out.println("Invalid account type");
        }

        scanner.close();
    }
}
 
