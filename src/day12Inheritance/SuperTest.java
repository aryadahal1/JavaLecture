package day12Inheritance;

public class SuperTest {

    public static void main(String[] args) {
       //implicit type-casting
        Super obj = new Sub();
        obj.sayHello();

        //explicit type-casting
        Super ob = new Super();
        Sub sub = (Sub) ob;
    }
}
