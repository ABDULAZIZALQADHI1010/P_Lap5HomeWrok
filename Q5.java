//Class to constructs two Bank accounts then take amount from the first account to the second account
public class Q5 {
    public static void main(String[] args) {
        BankAccount b1=new BankAccount(1000);
        BankAccount b2=new BankAccount(1000);
        b1.mystery(b2,500);
    }
}
