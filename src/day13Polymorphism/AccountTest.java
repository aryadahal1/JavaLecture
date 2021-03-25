package day13Polymorphism;

import java.util.Scanner;

public class AccountTest {

    // An example of run-time polymorphism(dynamically binding)
    //can be obtained by overriding of methods

    public static void main(String[] args) {
        Account account = null;
        System.out.println("enter your choice");
        String choice = new Scanner(System.in).next();

        switch (choice){
            case"saving":
                account = new SavingAccount();
                break;
            case"current":
                account = new CurrentAccount();
                break;
            default:
                System.out.println("wrong choice!!!");

        }
        if (account!= null){
            account.openAccount();
        }
    }
}
