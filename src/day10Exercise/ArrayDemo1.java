package day10Exercise;

//array : is a group of elements of same data type
//arranged in a sequential manner
public class ArrayDemo1 {

    public static void main(String[] args) {
        //Syntax of an array: <data type> [] <array name> = new <data type> [size of array]
        //index: 0 to size (of index)-1. always stars from 0
        int [] arr = new int [3];
        System.out.println(arr);
        System.out.println(arr.length);
        System.out.println(arr[0]);
        System.out.println(arr[1]);
        System.out.println(arr[2]);


    }
}
