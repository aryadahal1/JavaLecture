package day9Exercise;

//shadowing: is the process of hiding instance variable by local variable inside inside non-static method
// and constructor of a class.
//this: this is a keyword and is an implicit reference variable. It is available inside non-static method
// and constructor of a class
// we can change the value of 'this'.
public class ThisDemo1 {

    //instance variable
    int a = 5;

    public void print (){
        System.out.println("this is: " + this);
        System.out.println(a); //this.a => shadowing ko case ma this.a lekhnu parcha

        //local variable
        int a= 6;
        System.out.println(a);
        int sum = this.a + a;
        System.out.println("sum is: " + sum);
    }


    public static void main(String[] args) {
        ThisDemo1 ob1 = new ThisDemo1();
        System.out.println("ob1 is: " + ob1);
        ob1.print();

        System.out.println("=================");

        ThisDemo1 ob2 = new ThisDemo1();
        System.out.println("ob2 is: " + ob2);
        ob2.print();
    }


}
