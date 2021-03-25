package day10Exercise;

public class ArrayDemo9 {

    public static void main(String[] args) {
        String[][] names = new String [][]{ {"keefe", "Diddy", "sean"}, {"Rihanna", "Cardi", "Taylor"},
                {"Brittany", "Kacie", "Becki"}};
        for (int i = 0; i < names.length; i++){
            for (int j = 0; j < names.length; j++){
                System.out.print(names[i][j] + " ");
            }
            System.out.println();
        }
    }
}
