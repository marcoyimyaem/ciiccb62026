package Tester.schoolsys;

public class Cashier extends Person {
    private float balance;
    public Cashier(String name) {
        super(name);
        //TODO Auto-generated constructor stub
    }

    @Override
    public String getRole() {
       return "Cashier";
    }
    private void setBalance(float balance) {
        this.balance = balance;
    }
    static void minusBalance(float balance) {
        new Cashier(null).setBalance(balance);
         
    }
    public float getBalance() {
        return balance;
    }

}
