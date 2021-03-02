package day7Exercise;

public class DefaultValueDemo {

    static byte b; //static and non-static, jub assign gareni huncha variable lai
    short s;
    int i;
    long l;
    float f;
    double d;
    static boolean bb;
    String ss;

    DefaultValueDemo ob;

    public static void main(String[] args) {
        DefaultValueDemo obj = new DefaultValueDemo();
        System.out.println(b); //static call garne way
        System.out.println(obj.s); // non-static call garne way
        System.out.println(obj.i);
        System.out.println(obj.l);
        System.out.println(obj.f);
        System.out.println(obj.d);
        System.out.println(bb);
        System.out.println(obj.ss);
        System.out.println(obj.ob);

        /*local variables has no default value
        int a;
        System.out.println(a); */
    }
}

