public class BankAccountQ4 {
    private int ACcountNo=0;
    private double balance=0;
    public void addInterset(double rate){
        balance+=((rate/100)*balance);
    }
    public void deposit(int amount){
        balance+=amount;
    }
    public void withdraw(int amount){
        balance-=amount;
    }
    public BankAccountQ4(int Amount) {
        this.ACcountNo++;
        this.balance=Amount;
    }
    public double getBalance() {
        return balance;
    }
    public static void main(String[] args) {

    }
}