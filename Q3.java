import java.util.Scanner;

public class Q3 {
    public static void main(String[] args) {
        BankAccount b1 = new BankAccount(0);
        b1.deposit(1000);
        b1.withdraw(500);
        b1.withdraw(400);
        System.out.println("expected balance :100"+"\nactual balance ="+b1.getBalance());
    }
}

