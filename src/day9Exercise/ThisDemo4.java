package day9Exercise;
//as a method return type

public class ThisDemo4 {

    public ThisDemo4 getObject(){
        //ThisDemo4 ob = new ThisDemo4();
        //return ob;
        // or return new ThisDemo4();
        return this;
    }
    public void greet(){
        System.out.println("Hola, como estas");

    }

    public static void main(String[] args) {
        ThisDemo4 ob = new ThisDemo4();
        ThisDemo4 obj = ob.getObject();
        obj.getObject();
    }

}
