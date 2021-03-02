package day7Exercise;

public class ObjectDemo3 {

    public static void main(String[] args) {
        System.out.println(new ObjectDemo3().hashCode());
        ObjectDemo3 ob;
        ob= new ObjectDemo3();
        System.out.println(ob.hashCode());
        ObjectDemo3 obj = new ObjectDemo3();
        System.out.println(obj.hashCode()); //hashcode dincha
        System.out.println(obj); //ObjectId dincha
        System.out.println("day7.ObjectDemo3@" + Integer.toHexString(obj.hashCode())); //objectId dincha
    }
}
