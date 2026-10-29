
public class BankAccount {

    public String name;
    public Double balance;

    public BankAccount(String nm, double amnt) {
        name = nm;
        balance = amnt;
    }

    public double getBalance(){
        return balance;
    }

    public String getName(){
        return name;
    }


    public void deposit(double dp) {
        balance = balance + dp;
    }

    public void withdraw(double wd) {
        balance = balance - wd;
    }

}
