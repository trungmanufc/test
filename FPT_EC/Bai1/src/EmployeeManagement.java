import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;
import java.util.stream.Collectors;

public class EmployeeManagement {
    private List<Employee> employeeList = new LinkedList<>();

    public void addEmployee(Employee employee) {
        employeeList.add(employee);
    }

    public List<Employee> searchEmployeeByName(String name) {
        return employeeList.stream().filter(e -> e.getName().contains(name)).collect(Collectors.toList());
    }

    public void showEmployeeList() {
        employeeList.forEach(e -> {System.out.println(e.toString());});
    }

    public void exit() {
        employeeList.removeAll(employeeList);
    }
}
