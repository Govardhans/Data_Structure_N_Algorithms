package practice.stacks.usinglinkedlist;

import practice.stacks.Employee;

public class Main {
    public static void main(String[] args) {
        EmployeeLinkedListStack stack = new EmployeeLinkedListStack();

        stack.push(new Employee("Jane", "Smith", 111));
        stack.push(new Employee("John", "Smith", 222));
        stack.push(new Employee("Vector", "Smith", 333));
        stack.push(new Employee("Adam", "Smith", 444));

        stack.printStack();
        System.out.println(stack.peek().toString());
    }
}
