package day7Exercise;

import java.sql.SQLOutput;

public class StaticNonStaticType {
        //local variable
        String nonStaticVar = "this is non-static";
        static String staticVar = "this is static var";

    public void nonStaticMethod(){
        System.out.println("This is non-static method");

    }

    public static void staticMethod(){
        System.out.println("this is static method");

    }

    public static void main(String[] args) {
        /*local variables
        int a = 5;
        String name = "Brody"; */

        //Static call garna class name bata, non-static call garna object bata

        StaticNonStaticType ob = new StaticNonStaticType(); // non-static object bata matra call huncha
        System.out.println(ob.nonStaticVar); //non-static ma variable esari call garne
        ob.nonStaticMethod();

        System.out.println(staticVar); //Static sidhai call garna paucha
        staticMethod();

        //best way to call static
        System.out.println(StaticNonStaticType.staticVar);
        StaticNonStaticType.staticMethod();
    }
} //block vaneko => curly brackets{}
