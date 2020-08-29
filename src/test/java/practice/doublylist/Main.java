package practice.doublylist;

import practice.list.Employee;

public class Main {

    public static void main(String[] args) {
        Employee johnDoe = new Employee("John", "Doe", 111);
        Employee janeJones = new Employee("Jane", "Jones", 222);
        Employee marySmith = new Employee("Mary", "Smith", 333);

        EmployeeLinkedList list = new EmployeeLinkedList();
        list.addToHead(johnDoe);
        list.addToHead(janeJones);
        list.addToTail(marySmith);

        list.printList();
        list.addBefore(new Employee("Bruce", "Lee",444), marySmith);
        System.out.println("After adding emp between : ");
        list.printList();

//        list.printList();
//        list.removeFromHead();
//        System.out.println("After removing from head");
//        list.printList();
//
//        list.removeFromTail();
//        System.out.println("After removing from tail");
//        list.printList();
    }
}
