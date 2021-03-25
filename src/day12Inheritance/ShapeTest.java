package day12Inheritance;

public class ShapeTest {

    public static void main(String[] args) {

       // Shape shape = new Shape(); //abstract class ko object banauna mildaina
        Shape shape = new Triangle(); //exlicit typecasting
        shape.draw();
    }
}
