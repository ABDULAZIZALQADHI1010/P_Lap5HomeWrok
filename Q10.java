public class Q10 {
    private String empName="";
    private double empSalary=0;
    public Q10(String empName, double currentSalary) {
        this.empName = empName;
        this.empSalary = currentSalary;
    }

    public String getEmpName() {
        return empName;
    }

    public double getEmpSalary() {
        return empSalary;
    }
    public void raiseSalary(double byPercent){
        this.empSalary+=((byPercent/100)*this.empSalary);
    }

    public static void main(String[] args) {

    }
}
