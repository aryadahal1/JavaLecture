package day10Exercise;
import java.util.Scanner;

public class ArrayDemo6 {

    public static void main(String[] args) {

        final int ROWS = 3;
        final int COLUMNS = 3;

        int [] [] arr = new int [ROWS] [COLUMNS];
        arr[0][0] = 10;
        arr[0][1] = 10;
        arr[0][2] = 10;

        arr[1][0] = 10;
        arr[1][1] = 10;
        arr[1][2] = 10;

        arr[2][0] = 10;
        arr[2][1] = 10;
        arr[2][2] = 10;

        Scanner input = new Scanner (System.in);
        for(int i = 0; i < ROWS; i++){
            for(int j = 0; j< COLUMNS; j++){
                System.out.print(arr[i][j] + " ");
            }
            System.out.println();
        }
    }
}
