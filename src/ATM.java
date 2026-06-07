import java.util.ArrayList;

public class ATM {
    private String userName;
    private int pin;
    private double balance;
    private String accountNumber;
    private ArrayList<String>transactions; // Mini Statement

    public ATM(String userName, int pin, double balance, String accountNumber){
     this.userName = userName;
     this.pin = pin;
     this.balance = balance;
     this.accountNumber = accountNumber;
     this.transactions = new ArrayList<>();
    }

    // Show Account details
    public void showAccountDetails(){
        System.out.println("\n=== ACCOUNT DETAILS ===");
        System.out.println("Account Holder: "+ userName);
        System.out.println("Account Number: "+ accountNumber);
        System.out.println("Account Type: savings");
        System.out.println("Balance : ₹"+ balance);
    }

    // Add to Mini Statement
    private void addTransaction(String tx){
        if(transactions.size() == 5){
            transactions.remove(0);//Remove old
        }
        transactions.add(tx);
    }

    // Show Mini Statement
    public void showMiniStatement(){
        System.out.println("\n ==== MINI STATEMENT(Last 5 Transaction) ===");
        if (transactions.isEmpty()){
            System.out.println("No transaction available.");
        }
        else{
            for (String tx : transactions){
                System.out.println(tx);
            }
        }
    }


    //PIN Validation
    public boolean validatePin(int enteredPin){
        return this.pin == enteredPin;
    }

    //Check Balance
    public double getBalance(){
        return balance;
    }

    // Deposit money
    public void deposit(double amount){
        if(amount > 0){
            balance += amount;
            System.out.println("Amount Deposited Successfully!");
        }
        else{
            System.out.println("Invalid amount!");
        }
    }

    // Withdraw money
    public void withdraw(double amount){
        if (amount <=0){
            System.out.println("Invalid Amount!");
        }
        else if (amount > balance){
            System.out.println("Insufficient Balance!");
        }
        else{
            balance -=amount;
            System.out.println("Amount withdraw Successfully!");
        }
    }

    // Change PIN (with old Pin Check)
    public void changePin(int oldPin, int newPin){
        if (oldPin != this.pin){
            System.out.println("Incorrect old PIN!");
            return;
        }

        this.pin = newPin;
        System.out.println("PIN Changed Successfully!");
    }

}