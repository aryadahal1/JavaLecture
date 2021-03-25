package day12Inheritance;

public class Triangle extends Shape{

    @Override
    public void draw() {
        System.out.println("triangle is drawn");
    }

    public Triangle(){
        System.out.println("Triangle's default constructor");
    }
}
