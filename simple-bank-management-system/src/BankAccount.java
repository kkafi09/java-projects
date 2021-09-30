import java.util.Scanner;

public class BankAccount {

    String name;
    String id;
    int balance;
    int previousTransaction;

    BankAccount(String name, String id){
        this.name = name;
        this.id = id;
    }

    void deposit(int amount){
        if (amount != 0){
            balance += amount;
            previousTransaction = amount;
        }
    }

    void withdraw(int amount){
        if (amount > 0 && amount <= balance){
            balance -= amount;
            previousTransaction = -amount;
        } else {
            System.out.println("Your withdraw to big");
        }
    }

    void getPreviousTransaction(){
        if(previousTransaction > 0){
            System.out.println("Deposited = " + previousTransaction);
        } else if (previousTransaction < 0){
            System.out.println("Withdrawn = " + Math.abs(previousTransaction));
        } else{
            System.out.println("No Transaction occured");
        }
    }

    void showMenu(){
        char option ='\n';
        Scanner sc = new Scanner(System.in);

        System.out.println("Welcome " + name);
        System.out.println("Your ID " + id);
        System.out.println("=======================");
        System.out.println("What do you want to do?");
        System.out.println("=======================");
        System.out.println("A. Check balance");
        System.out.println("B. Deposit");
        System.out.println("C. Withdraw");
        System.out.println("D. Previous Transaction");
        System.out.println("E. Exit");

        do{
            System.out.println("========================");
            System.out.print("Enter an Option : ");
            option = sc.next().toUpperCase().charAt(0);

            switch (option) {
                case 'A' -> {
                    System.out.println("============================");
                    System.out.println("Your Balance " + balance);
                }
                case 'B' -> {
                    System.out.println("============================");
                    System.out.println("Enter amount to deposit ");
                    System.out.print("amount = ");
                    int amount = sc.nextInt();
                    deposit(amount);
                }
                case 'C' -> {
                    System.out.println("============================");
                    System.out.println("Enter amount to Withdraw ");
                    System.out.print("withdraw = ");
                    int amount2 = sc.nextInt();
                    withdraw(amount2);
                }
                case 'D' -> {
                    System.out.println("============================");
                    System.out.println("Your previous transaction = ");
                    getPreviousTransaction();
                }
                case 'E' -> System.out.println("============================");
                default -> System.err.println("wrong option");
            }
        }while(option != 'E');

        System.out.println("THANK YOU FOR USING OUR SERVICES");
    }
}
