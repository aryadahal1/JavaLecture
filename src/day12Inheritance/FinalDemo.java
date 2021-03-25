package day12Inheritance;

public /*final*/ class FinalDemo {

    final int a; //final variable is always constant

    public /*final*/ void sayHello(){
        System.out.println("hello from parent.....");
    }

    public /*final*/ FinalDemo(int a ){ //constructor ma final use garna mildaina
        this.a = a;
    }
}
