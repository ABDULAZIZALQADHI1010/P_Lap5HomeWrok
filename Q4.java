public class Q4 {
    public static void main(String[] args) {
        SavingsAccountQ4 momsSaving=new SavingsAccountQ4(1000);
        momsSaving.addinterest(10);
        System.out.println("expected balance :1100"+"\nactual balance ="+momsSaving.getBalance());
    }
}
