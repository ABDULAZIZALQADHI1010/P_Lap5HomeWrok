public class BankAccount {
    private int ACcountNo=0;
    private double balance=0;
    //this method provided for Q5{
    public void mystery(BankAccount that, double amount) {
        this.balance = this.balance - amount;
        that.balance = that.balance + amount;
    }
    //}
    public void deposit(int amount){
        balance+=amount;
    }
    public void withdraw(int amount){
        balance-=amount;
    }
    public BankAccount(int Amount) {
        this.ACcountNo++;
        this.balance=Amount;
    }
    public double getBalance() {
        return balance;
    }
    public static void main(String[] args) {

    }
}