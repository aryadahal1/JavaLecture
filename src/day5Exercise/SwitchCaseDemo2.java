package day5Exercise;

import java.util.Scanner;

public class SwitchCaseDemo2 {
    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);
        System.out.println("Enter your choice");
        int choice = input.next().charAt(0);

        switch (choice) {
            case '+':
                System.out.println("this is addition");
                break;
            case '-':
                System.out.println("this is subtraction");
                break;
            case '*':
                System.out.println("this is multiplication");
                break;
            case '/':
                System.out.println("this is division");
                break;
            default:
                System.out.println("Wrong Choice");
                break;
        }
    }
}

