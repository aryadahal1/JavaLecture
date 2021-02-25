package day5Exercise;

public class NestedIfDemo {
    public static void main(String[] args) {
        int a = 5;
        int b = 4;
        int c = 3;

        if (a > b) {
            if (a > c) {
                System.out.println(" a is the largest");
            } else {
                System.out.println(" c is the greatest");
            }
        } else {
            System.out.println(" a is greater than b but c may be greater or smaller than a");
        }
        if (b > a) {
            System.out.println("b is greater than a");
        } else {
            System.out.println("=======");
        }
    }
}
