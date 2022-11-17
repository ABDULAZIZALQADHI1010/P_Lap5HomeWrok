public class Q7 {
    public static void main(String[] args) {
        BankAccountQ7 b1=new BankAccountQ7(1000,10);
        b1.getBalance();
        System.out.println("balance without interest :"+b1.getBalance());
        b1.addInterestToBalance();
        System.out.println("balance with interest :"+b1.getBalance());
        b1.withdraw();
        System.out.println("balance after withdrawal :"+b1.getBalance());
    }
}
