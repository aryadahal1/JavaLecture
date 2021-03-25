package day10Exercise;
import java.util.Scanner;

public class ArrayDemo3 {

    public static void main(String[] args) {

        int [] arr = new int [3];
        Scanner input = new Scanner(System.in);
        for (int i = 0; i < arr.length; i++  ){
            System.out.println("Enter elements of an array: " );
            arr[i] = input.nextInt();
        }
        int sum = 0;
        for (int i = 0; i < arr.length; i++ ) {
            sum = sum + arr[i];
        }
        System.out.println("sum of the array elements is: " + sum);
    }
}
