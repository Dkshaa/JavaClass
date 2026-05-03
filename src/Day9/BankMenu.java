package Day9;

import java.util.Scanner;

public class BankMenu {
    public static void main(String []args){
        Scanner sc =new Scanner(System.in);


        double balance= 1000;
        System.out.println("1.Check Balance");
        System.out.println("2.Deposit");
        System.out.println("3.Withdraw  Balance");
        System.out.println("4.Exit");
        System.out.println("Enter your Choice ");

        int choice=sc.nextInt();

        switch (choice) {
            case 1:
                System.out.println("Your balance is "+balance);
                break;
            case 2:
                    System.out.println("Enter the amount to deposit :");
                    double amt= sc.nextDouble();
                    System.out.println("Thankyou for depositing");
                    System.out.println("your new balance is "+(amt+balance));
                    break;
            case 3:
                System.out.println("Enter the amount to withdraw");
                int withdraw=sc.nextInt();
                if(withdraw>balance) {
                    System.out.println("You have insufficient amount");
                }else{
                    double newBalance=balance-withdraw;
                    System.out.println("Your new balance is "+newBalance);
                }
                break;
            case 4:
                System.out.println("Thank you !See you again");

        }

    }
}
