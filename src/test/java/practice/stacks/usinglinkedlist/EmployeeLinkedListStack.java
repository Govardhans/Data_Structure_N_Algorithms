package practice.stacks.usinglinkedlist;

import practice.stacks.Employee;

import java.util.LinkedList;

public class EmployeeLinkedListStack {
    LinkedList<Employee> employeeListStack;
    int top;

    public EmployeeLinkedListStack() {
        employeeListStack = new LinkedList<Employee>();
    }

    public void push(Employee emp){
        employeeListStack.push(emp);
    }

    public Employee pop(Employee emp){
        return employeeListStack.pop();
    }

    public Employee peek(){
        return
                employeeListStack.peek();
    }

    public void printStack(){
        System.out.println(employeeListStack.toString());
    }
}
