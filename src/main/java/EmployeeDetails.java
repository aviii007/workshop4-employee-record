public class EmployeeDetails {
    public int employeeName ;
    public String employeeId;
    public String employeeDoj;

    public int getEmployeeName() {
        return employeeName;
    }

    public void setEmployeeName(int employeeName) {
        this.employeeName = employeeName;
    }

    public String getEmployeeId() {
        return employeeId;
    }

    public void setEmployeeId(String employeeId) {
        this.employeeId = employeeId;
    }

    public String getEmployeeDoj() {
        return employeeDoj;
    }

    public void setEmployeeDoj(String employeeDoj) {
        this.employeeDoj = employeeDoj;
    }

    @Override
    public String toString() {
        return "EmployeeDetails{" +
                "employeeName=" + employeeName +
                ", employeeId='" + employeeId + '\'' +
                ", employeeDoj='" + employeeDoj + '\'' +
                '}';
    }
}
