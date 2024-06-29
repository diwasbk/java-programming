class BankAccount{
    // Private instance variables
    private int accountNumber;
    private String accountHolder;
    private double accountBalance;

    // Constructor to initialize account attributes
    BankAccount(int accountNumber, String accountHolder, double initialBalance){
        this.accountNumber = accountNumber;
        this.accountHolder = accountHolder;
        this.accountBalance = initialBalance;
    }

    // Method to deposit amount
    public void depositAmount(double amount){
        if(amount > 0){
            this.accountBalance += amount;
            System.out.println(amount + " has been deposited successfully.");
        } else {
            System.out.println("Deposit amount must be positive.\n");
        }
    }

    // Method to withdraw amount
    public void withdrawAmount(double withdraw){
        if(withdraw > accountBalance || withdraw <= 0){
            System.out.println("Insufficient funds or invalid withdraw amount.\n");
        } else {
            this.accountBalance -= withdraw;
            System.out.println(withdraw + " has been withdrawn successfully.");
        }
    }

    // Method to print account information
    public void printInfo(){
        System.out.println("Account Number: " + this.accountNumber);
        System.out.println("Account Holder: " + this.accountHolder);
        System.out.println("Account Balance: " + this.accountBalance);
    }
}

public class OOPbankingSystem {
    public static void main(String[] args) {
        // Create a new BankAccount object
        BankAccount b1 = new BankAccount(230185, "Diwas Bishwokarma", 500);
        
        // Test depositing an amount
        b1.depositAmount(300);
        
        // Test withdrawing an amount
        b1.withdrawAmount(100);
        
        // Print account information
        b1.printInfo();
    }
}