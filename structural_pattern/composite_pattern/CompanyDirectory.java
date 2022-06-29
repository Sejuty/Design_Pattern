package structural_pattern.composite_pattern;

import java.util.ArrayList;
import java.util.List;

public class CompanyDirectory implements Employee {

    public List<Employee> employeeList = new ArrayList<Employee>();

    public CompanyDirectory() {
        this.employeeList = employeeList;
    }

    @Override
    public void showDetails() {
        for (Employee employee : employeeList) {
            employee.showDetails();
        }
    }

    public void add(Employee emp) {
        employeeList.add(emp);
    }

    public void remove(Employee emp) {
            employeeList.remove(emp);
    }
}
