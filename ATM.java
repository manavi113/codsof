import java.util.*;
 public class ATM{
    double balance;
    // Scanner sci = new Scanner(System.in);
    public void checkbalance(){
        System.out.println("Current balance is: " + balance);        //to check current balance in user's account
    }
    public void Withdraw(double amount){
        if(amount >0 && amount < balance){
            balance -= amount;
        System.out.println("Transaction is successful!!!.....Current balance is: " + balance);    //for withdrawl of money

    } else {
        System.out.println("Withdraw cannot be done...Invalid amount.");
    }
    }
    
    public void deposit(double amount){
        if(amount >0){
            balance += amount;
            System.out.println("After deposit your balance is: " + balance);    //to deposit money
        } else {
          System.out.println("Amount you entered is Invalid");
        }
    }
}
 class Bankaccount{
    Scanner sci = new Scanner(System.in);
    public ATM account;                  // to connect both the classes
    public Bankaccount( double startingbalance){       //for initializing our starting balance in account
    account = new ATM();
        account.balance = startingbalance;
}
    public void deposit(){
        System.out.println("Enter the cash you want to deposit");
        double depositcash = sci.nextDouble();
        account.deposit(depositcash);
    }
   public void withdraw(){
    System.out.println("Enter the cash to be withdrawn");
    double Withdrawcash = sci.nextDouble();
    account.Withdraw(Withdrawcash);
   }
   public void checkbalance(){
    System.out.println("Current Balance in your account is: " + account.balance);
   }

    public static void main(String[] args) {
        Bankaccount user_account = new Bankaccount(1000);   //initial amount is 1000 in user's account
      
         System.out.println("Welcome To ATM!!");
        System.out.println("Enter:-");
        System.out.println("1-To Withdraw Cash");
        System.out.println("2-To Deposit Cash");
        System.out.println("3-To check Balance");
        Scanner sc = new Scanner(System.in);
              int n = sc.nextInt(); 
             switch(n){             // providing choice to user what they want to do
                case 1:
                user_account.withdraw();
                 break;
                 case 2:
                 user_account.deposit();
                 break;
                 case 3:
                 user_account.checkbalance();
                 break;
        
             }
            
    }
}