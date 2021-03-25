package day12Inheritance;

import day13Polymorphism.AccessModifierDemo;

public class AccessModifierDemoChildd extends AccessModifierDemo {
    public static void main(String[] args) {
        AccessModifierDemo ob = new AccessModifierDemo();
        //ob.defaultMethod();
        //ob.protectedMethod();
        //ob.privateMethod();
        ob.publicMethod();

        AccessModifierDemoChildd obb = new AccessModifierDemoChildd();
        obb.protectedMethod();

    }
}
