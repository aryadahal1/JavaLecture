package day8Exercise;

 /*
        CONSTRUCTOR: is a special function which have following features:
        1. Its name is similar to a class name
        2. Tt has no return type
        3. we cannot use 'void' keyword too
        4. It can have any access modifier
        5. It runs only once for each object
        6. It is mainly used to initialize the member data

        CLASS: is a specification/template/model/prototype
        OBJECT: is an instance of a class which has property and behavior
         */

public class Student {
    //non-static variable, instance variable, member's data, properties/attributes, field
    String name;
    int roll;

    // public void assignInfo(String n, int r) {
    //     name = n;
    //     roll = r;
    // }

    public Student(String n, int r) {
        name = n;
        roll = r;
        System.out.println("constructor called");
    }

    public void displayInfo() {
            System.out.println("Student Name is:" + name);
            System.out.println("Student roll is:" + roll);
    }

    public static void main(String[]args) {

            Student student1 = new Student("Brian", 33);
            student1.displayInfo();
            System.out.println("===========");

            Student student2 = new Student("Ryan", 7);
            student2.displayInfo();
            System.out.println("===========");
    }

}
 /* Alternative method
        Student student1 = new Student();
        student1.name = "Brian Vol";
        student1.roll = 12;
        System.out.println(student1.name);
        System.out.println(student1.roll);
        System.out.println("===========");
        Student student2 = new Student();
        student1.name = "Brian Vol";
        student2.roll = 3;
        System.out.println(student2.name);
        System.out.println(student2.roll);
        System.out.println("===========");
        */