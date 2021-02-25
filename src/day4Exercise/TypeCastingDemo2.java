package day4Exercise;

public class TypeCastingDemo2 {

    public static void main(String[] args) {
        //implicit
        char c1 = 65;
        byte b1 = 97;
        System.out.println(c1);
        System.out.println(b1);

        //implicit
        char c2 = 'a';
        byte b2 = 'a';
        System.out.println(c2);
        System.out.println(b2);

        //explicit
        char c3 = 77;
        byte b3 = (byte) c3;
        //explicit
        byte b4 = 88;
        char c4 = (char) b4;

    }
}
