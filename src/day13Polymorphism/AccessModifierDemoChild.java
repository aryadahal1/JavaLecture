package day13Polymorphism;

public class AccessModifierDemoChild extends AccessModifierDemo{

    public static void main(String[] args) {
        AccessModifierDemo ob = new AccessModifierDemo(4);
        ob.defaultMethod();
        ob.protectedMethod();
        //ob.privateMethod();
        ob.publicMethod();

    }
}
