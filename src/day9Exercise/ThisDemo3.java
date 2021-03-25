package day9Exercise;
//As a method argument
public class ThisDemo3 {

    public void display(){
        System.out.println("I am learning 'this' concept");
    }

    public void print(ThisDemo3 ob){
        ob.display();
    }

    public void show(){
        print (this); //yo this le ThisDemo3 vanne object ko value hold garcha
        //or it can also be called by- ThisDemo3 ob = new ThisDemo3();
        //print(ob);
    }

    public static void main(String[] args) {
        ThisDemo3 ob = new ThisDemo3();
        ob.show();

    }
}
