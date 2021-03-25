package day13Polymorphism;

public class AdditionDemo {

    //overloading of methods

    public void sum(int a, int b){
        int r = a + b;
        System.out.println("1. Sum is: " + r);
    }
    public void sum(int a, int b, int c){
        int r = a + b + c;
        System.out.println("2. Sum is: " + r);
    }
    public void sum(double a, double b){
        double r = a + b;
        System.out.println("3. Sum is: " + r);
    }

    public static void main(String[] args) {

        //compile time [polymorphism(static binding)]
        //can be obtained by overloading of methods
        AdditionDemo obj = new AdditionDemo();
        obj.sum(5, 4, 6);
        obj.sum(4.4, 3.6);
        obj.sum(2, 6);

    }
}
