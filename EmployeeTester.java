public class EmployeeTester {
    public static void main(String[] args) {
        Q10 Harry=new Q10("Ahmed",1000);
        System.out.println(Harry.getEmpSalary());
        Harry.raiseSalary(10);
        System.out.println(Harry.getEmpSalary());
    }
}