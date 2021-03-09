package day8Exercise;

public class Student {

    String name;
    int roll;

    public void assignInfo(String n, int r) {
        name = n;
        roll = r;
    }

    public void displayInfo(){
        System.out.println("Student Name is:" + name);
        System.out.println("Student roll is:" + roll);
    }

    public static void main(String[] args) {

        Student student1 = new Student();
        student1.assignInfo("Brian" , 33);
        student1.displayInfo();
        System.out.println("===========");
        Student student2 = new Student();
        student2.assignInfo("Ryan" , 7);
        student2.displayInfo();
        System.out.println("===========");


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



    }
}
