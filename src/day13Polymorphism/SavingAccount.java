package day13Polymorphism;

public class SavingAccount implements Account{
    @Override
    public void openAccount() {
        System.out.println("saving account is opened");
    }
}
