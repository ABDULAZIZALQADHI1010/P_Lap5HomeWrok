public class Q6 {
    public static void main(String[] args) {
        SavingsAccountQ6 sonsSaving=new SavingsAccountQ6(1000,10);
        sonsSaving.addinterest(10);
        System.out.println(sonsSaving.getBalance());
    }
}
