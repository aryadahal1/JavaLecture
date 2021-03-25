package day12Inheritance;

public class Derived extends Base{

    public Derived(){
        super(8); //forcefully
        System.out.println("child default constructor");
    }

    public Derived(int a){
        super(); //by default
        System.out.println("child argumented constructor");
    }
}
