package day12Inheritance;

public class Parent {

    //hidden variable
    String name = "parent's name";

    public void sayHello(){ //public lai private me change garyo vane inherit hudaina
        System.out.println("hello from parent.......");
    }
}
//can't be inherited:
//private members
//hidden variables
//overridden method