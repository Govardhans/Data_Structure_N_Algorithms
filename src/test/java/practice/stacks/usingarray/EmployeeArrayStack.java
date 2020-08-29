package practice.stacks.usingarray;

import practice.stacks.Employee;

import java.util.EmptyStackException;

public class EmployeeArrayStack {
    Employee[] employeeStack;
    int top;

    public EmployeeArrayStack(int size) {
        employeeStack = new Employee[size];
    }

    public void push(Employee employee) {
        if (top == employeeStack.length) {
            Employee[] resizedArray = new Employee[employeeStack.length * 2];
            System.arraycopy(employeeStack, 0, resizedArray, 0, employeeStack.length );
            employeeStack = resizedArray;
        }
        employeeStack[top++] = employee;
    }
    public boolean isEmpty(){
        return top == 0;
    }
    public Employee pop(){
        if(isEmpty()){
            throw new EmptyStackException();
        }
        Employee emp = employeeStack[--top];
        employeeStack[top] = null;
        return emp;
    }

    public Employee peek(){
        if(isEmpty()){
            throw new EmptyStackException();
        }
        return employeeStack[top-1];
    }
    public void  printStack(){
        for(int i = employeeStack.length-1; i >= 0; i--){
            System.out.println(employeeStack[i]);
        }
    }
}
