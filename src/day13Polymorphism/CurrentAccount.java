package day13Polymorphism;

public class CurrentAccount implements Account{
    @Override
    public void openAccount() {
        System.out.println("current account opened");
    }
}
