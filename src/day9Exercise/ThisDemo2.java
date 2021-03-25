package day9Exercise;

public class ThisDemo2 {

    String name;
    int age;

    public ThisDemo2(String name, int age){
        this.name = name;
        this.age = age;

    }
    public void displayInfo(){

        System.out.println("Name is: " + name);
        System.out.println("Age is: " + age);
    }

    public static void main(String[] args) {
        ThisDemo2 ob1 = new ThisDemo2("Diddy", 37);
        ob1.displayInfo();

    }

    /* Without 'this'
    public ThisDemo2(String n, int a){
        name = n;
        age = a;

    }
    public void displayInfo(){

        System.out.println("Name is: " + name);
        System.out.println("Age is: " + age);
    }

    public static void main(String[] args) {
        ThisDemo2 ob1 = new ThisDemo2("Diddy", 37);
        ob1.displayInfo();

    }*/
}
