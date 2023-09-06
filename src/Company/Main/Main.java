package Company.Main;

import Company.Model.Employee;

import java.util.*;

public class Main {
    public static void main(String[] args) {
        List<Employee> employeeList = new LinkedList<>();

        employeeList.add(new Employee(1,"Canberk","Ok"));
        employeeList.add(new Employee(1,"Canberk","Ok"));
        employeeList.add(new Employee(2,"Halil","Aladag"));
        employeeList.add(new Employee(2,"Halil","Aladag"));
        employeeList.add(new Employee(3,"Dogancan","Kınık"));
        employeeList.add(new Employee(3,"Dogancan","Kınık"));
        System.out.println("Silinmeden önce :  "+employeeList);

        Map<Integer,Employee> employeeMap = new HashMap<>();
        List<Employee> removeEmployee = new ArrayList<>();

        Iterator iterator = employeeList.iterator();
        while (iterator.hasNext()) {
            Employee employee = (Employee) iterator.next();
            if (employeeMap.containsKey(employee.getId())) {
                removeEmployee.add(employee);
                iterator.remove();
            } else {
                employeeMap.put(employee.getId(), employee);
            }

        }

        System.out.println("Silindikten sonra: "+ employeeMap);
    }
}