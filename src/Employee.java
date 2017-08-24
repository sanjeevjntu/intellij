/**
 * Created by keerti sanjeev on 13/8/2017.
 */
public class Employee {

    private String empId;
    private String empName;


    public Employee(String empId, String empName) {
        this.empId = empId;
        this.empName = empName;
    }

    public Employee() {
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;

        Employee employee = (Employee) o;

        if (empId != null ? !empId.equals(employee.empId) : employee.empId != null) return false;
        return empName != null ? empName.equals(employee.empName) : employee.empName == null;
    }

    @Override
    public int hashCode() {
        int result = empId != null ? empId.hashCode() : 0;
        result = 31 * result + (empName != null ? empName.hashCode() : 0);
        return result;
    }

    @Override
    public String toString() {
        return "Employee{" +
                "empId='" + empId + '\'' +
                ", empName='" + empName + '\'' +
                '}';
    }

    public String getEmpId() {
        return empId;
    }

    public void setEmpId(String empId) {
        this.empId = empId;
    }

    public String getEmpName() {
        return empName;
    }

    public void setEmpName(String empName) {
        this.empName = empName;
    }
}
