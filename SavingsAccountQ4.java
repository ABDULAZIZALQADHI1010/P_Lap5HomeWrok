public class SavingsAccountQ4 {
    private int ACcountNo=0;
    private double balance=0;
    private double interest=0;
    @Override
    public String toString() {
        return "SavingsAccount{" +
                "ACcountNo=" + ACcountNo +
                ", balance=" + balance +
                ", interest=" + interest +
                '}';
    }
    public void addinterest(double interest){
        this.balance+=((interest/100)*balance);
        this.interest+=interest;
    }
    public void deposit(int amount){
        this.balance+=amount;
    }
    public void withdraw(int amount){
        this.balance-=amount;
    }
    public SavingsAccountQ4(double balance) {
        this.ACcountNo++;
        this.balance = balance;
    }
    public double getBalance() {
        return balance;
    }
    public static void main(String[] args) {

    }
}
