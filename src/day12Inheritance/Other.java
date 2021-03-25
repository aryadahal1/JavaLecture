package day12Inheritance;

import day13Polymorphism.AccessModifierDemo;

public class Other {
    public static void main(String[] args) {
        AccessModifierDemo ob = new AccessModifierDemo();

        ob.publicMethod();

        //ob.defaultMethod();
        //ob.protectedMethod();
        //ob.privateMethod();

        //AccessModifierDemoChildd obb = new AccessModifierDemoChildd();
        //obb.protectedMethod();

    }
}
