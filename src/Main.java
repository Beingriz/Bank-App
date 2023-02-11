import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
       Scanner sc  = new Scanner(System.in);
        System.out.println("Welcome to SBI Bank");
        System.out.println("Enter the Name");
        String name = sc.nextLine();
        System.out.println("Enter Password");
        String password = sc.next();
        System.out.println("Enter the Initial Deposit");
        int amount = sc.nextInt();
        SBIBank mdRizwan = new SBIBank(name,amount,password);
        System.out.println("Available Balance");
        System.out.println(mdRizwan.getBalance());

//        Deposit Functionality
        System.out.println("------------------- Deposit ---------------------");
        System.out.println("Enter the amount you want to  Deposit!");
        int deposit = sc.nextInt();
        System.out.println(mdRizwan.deposit(deposit));


        // Withdaw Functionality
        System.out.println("------------------ Withdraw --------------------");
        System.out.println("Enter the amount you want to withdraw");
        int withdraw = sc.nextInt();
        System.out.println("Enter Password");
        String pass = sc.next();
        System.out.println(mdRizwan.withdraw(withdraw, pass));

        // Rate of Interest
        System.out.println("---------------Rate of Interest!-------------------------");

        System.out.println("Enter the Time Period");
        int time   = sc.nextInt();
        System.out.println(mdRizwan.rateOfInterest(mdRizwan.getBalance(), time));
        System.out.println("------------Thank you ! -----------------");
    }
}