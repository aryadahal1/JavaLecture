package day7Exercise;

public class StaticNonStaticTest {

    public static void main(String[] args) {

        StaticNonStaticType ob = new StaticNonStaticType();
        System.out.println(ob.nonStaticVar);
        ob.nonStaticMethod();

        System.out.println(StaticNonStaticType.staticVar);
        StaticNonStaticType.staticMethod();

    }

}
