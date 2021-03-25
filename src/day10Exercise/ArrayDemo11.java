package day10Exercise;

public class ArrayDemo11 {

    public static void main(String[] args) {
        String[][] names = new String [][]{{"keefe", "Diddy", "sean"}, {"Rihanna", "Cardi", "Taylor"},
                {"Brittany", "Kacie", "Becki"}};
        //double dimension bata single ma change gareko
        for (String [] name : names) {
            // single variable ma lyayeko
           for (String n : name){
               System.out.println(n + " ");
            }
            System.out.println();
        }
    }
}
