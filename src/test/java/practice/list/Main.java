package practice.list;

public class Main {
    public static void main(String[] args) {
        Employee johnDoe = new Employee("John", "Doe", 111);
        Employee janeJones = new Employee("Jane", "Jones", 222);
        Employee marySmith = new Employee("Mary", "Smith", 333);

        EmployeeLinkedList employeeLinkedList = new EmployeeLinkedList();
        employeeLinkedList.addToFront(johnDoe);
        employeeLinkedList.addToFront(janeJones);
        employeeLinkedList.addToFront(marySmith);

        employeeLinkedList.printList();

    }
}
