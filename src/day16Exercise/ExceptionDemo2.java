package day16Exercise;

public class ExceptionDemo2 {
    public static void main(String[] args) {
        //try => {} block
        //catch => block
        //finally => block
        //throw => statement
        //throws => clause
        Scanenr input =  new Scanner(System.in);
        System.out.println("enter num1: ");
        int a = input.nextInt();
        System.out.println("Enter num2: ");
        int b = input.nextInt();

        try{
            int div = divide(a,b);
            System.out.println("division of a and b is: " + div);
            System.out.println("try end");

        }
    }
    public static int divide(int a, int b) {
        return a/b;
    }
}
