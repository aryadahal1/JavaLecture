package day8Exercise;
//constructor overloading
// no of argument, type of argument, sequence of argument
public class User {
    String name;
    int age;

    public User(){
        System.out.println("default(no-arg) constructor");
    }

    public User(String n, int a) {
        name = n;
        age = a;
        System.out.println("argumented (parameterized) constructor");
    }

    public static void main(String[] args) {
        User user1 = new User();
        System.out.println("========");
        User user2 = new User("rick" ,23);
        System.out.println("========");
    }
}