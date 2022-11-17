public class BankAccountQ7 {
    private double Balance=0;
    private double Interest=0;

    public BankAccountQ7(double balance, double interest) {
        Balance = balance;
        Interest = interest;
    }
    public void addInterestToBalance() {
        this.Balance+=((this.getInterest()/100)*this.Balance);
    }
    public double getInterest() {
        return Interest;
    }
    public void withdraw(){
        Balance=0;
    }
    public double getBalance() {
        return Balance;
    }

    public void setInterest(double interest) {
        Interest = interest;
    }

}