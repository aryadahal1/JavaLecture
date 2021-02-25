package day4Exercise;

public class TypeCastingDemo1 {

    public static void main(String[] args) {

        byte b1 = 127;
        //operation performed by Java compiler
        int i1 = b1; //implicit typecasting(conversion)
        System.out.println(b1);
        System.out.println(i1);

        int i2 = 127;
        //operation performed by the programmer forcefully
        byte b2 = (byte) i2; //explicit typecasting
        System.out.println(i2);
        System.out.println(b2);

        int i3 = 200;
        byte b3 = (byte)i3;
        System.out.println(i3);
        System.out.println(b3);


    }
}
