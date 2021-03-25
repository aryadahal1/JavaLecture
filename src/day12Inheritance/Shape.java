package day12Inheritance;

public abstract class Shape { //abstract class

    public abstract void draw();

    public void paint(){
        System.out.println("shape is painted....");
    }

    public Shape(){
        System.out.println("Shape's default constructor");
    }
}
