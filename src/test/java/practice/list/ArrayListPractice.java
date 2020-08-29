package practice.list;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class ArrayListPractice {
    public static void main(String[] args) {
        List<Employee> employeeList = new ArrayList<>(20);
        employeeList.add(new Employee("John", "Doe", 111));
        employeeList.add(new Employee("Marry", "Johns", 222));

        employeeList.add(2, new Employee("Sarah", "Williams", 333));
        employeeList.set(2, new Employee("glass", "door", 444));

        Employee[] employees = employeeList.toArray(new Employee[employeeList.size()]);

        employeeList.forEach(employee -> {
            System.out.println(employee);
        });

        boolean contains = employeeList.contains(new Employee("glass", "door", 444));

        System.out.println("contians element : " + contains);
        Arrays.stream(employees).iterator().forEachRemaining(e -> System.out.println(e));
    }
}
