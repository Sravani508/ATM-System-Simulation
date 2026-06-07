import java.util.Scanner;

public class ATMMain{
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter UserName: ");
        String name = sc.nextLine();

        ATM user = UserData.loadUser(name);

        if (user == null){
            System.out.println("Usr Not Found!");
            return;
        }


        System.out.println("=== Welcome to ATM Machine ===");

        // Step 1: PIN Login
        int attempts = 0;
        boolean loggedIn = false;

        while(attempts < 3){
            System.out.print("Enter PIN: ");
            int enteredPin = sc.nextInt();

            if(user.validatePin(enteredPin)){
                loggedIn = true;
                break;
            }
            else{
                System.out.println("Incorrect PIN!");
                attempts++;
            }
        }
        if (!loggedIn){
            System.out.println("Account Locked! Try again later.");
            return;
        }
        // Main Menu
        while (true){

            System.out.println("\n === ATM MENU===");
            System.out.println("1. Check Balance");
            System.out.println("2. Deposit Money");
            System.out.println("3. Withdraw Money");
            System.out.println("4. Change PIN");
            System.out.println("5. Mini Statement");
            System.out.println("6. Show Account Details");
            System.out.println("7. Exit");
            System.out.println("Choose Option: ");

            int choice = sc.nextInt();

            switch (choice){
                case 1:
                    System.out.println("Your Balance: ₹"+ user.getBalance());
                    break;

                case 2:
                    System.out.println("Enter deposit amount: ");
                    double dep = sc.nextDouble();
                    user.deposit(dep);
                    break;

                case 3:
                    System.out.println("Enter withdrawal amount: ");
                    double wd = sc.nextDouble();
                    user.deposit(wd);
                    break;

                case 4:
                    System.out.print("Enter Old PIN: ");
                    int oldPin = sc.nextInt();
                    System.out.print("Enter New PIN: ");
                    int newPin = sc.nextInt();

                    user.changePin(oldPin, newPin);
                    break;

                case 5:
                    user.showMiniStatement();
                    break;

                case 6:
                    user.showAccountDetails();
                    break;

                case 7:
                    System.out.println("Thank You! Vist again.");
                    return;

                default:
                    System.out.println("Invalid Option!");

            }
        }
    }
}