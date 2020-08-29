package practice.doublylist;

import practice.list.Employee;

public class EmployeeNode {
    Employee employee;
    EmployeeNode next;
    EmployeeNode prev;

    public EmployeeNode(Employee employee){
        this.employee = employee;
    }

    public Employee getEmployee() {
        return employee;
    }

    public void setEmployee(Employee employee) {
        this.employee = employee;
    }

    public EmployeeNode getNext() {
        return next;
    }

    public void setNext(EmployeeNode next) {
        this.next = next;
    }

    public EmployeeNode getPrev() {
        return prev;
    }

    public void setPrev(EmployeeNode prev) {
        this.prev = prev;
    }

    @Override
    public String toString() {
        return employee.toString();
    }
}
