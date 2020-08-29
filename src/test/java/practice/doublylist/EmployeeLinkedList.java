package practice.doublylist;

import practice.list.Employee;

public class EmployeeLinkedList {
    EmployeeNode head;
    EmployeeNode tail;

    public void addToHead(Employee employee) {
        EmployeeNode node = new EmployeeNode(employee);

        node.setNext(head);
        if (head == null) {
            tail = node;
        } else {
            head.setPrev(node);
        }

        head = node;
        //prev-head-next
    }

    public void addToTail(Employee employee) {
        EmployeeNode node = new EmployeeNode((employee));
        if (tail == null) {
            head = node;
        }
        tail.setNext(node);
        node.setPrev(tail);
        tail = node;
    }

    public EmployeeNode removeFromTail() {
        if (tail == null) {
            return null;
        }
        EmployeeNode removeNode = tail;

        if (tail.getPrev() == null) {
            head = null;
        } else {
            tail.getPrev().setNext(null);
        }
        tail = tail.getPrev();
        removeNode.setPrev(null);
        return removeNode;
    }

    public EmployeeNode removeFromHead() {
        if (head == null) {
            return null;
        }
        EmployeeNode removeNode = head;
        if (head.getNext() == null) {
            tail = null;
        } else {
            head.getNext().setPrev(null);
        }
        head = head.getNext();
        removeNode.setNext(null);
        return removeNode;
    }

    public void addBefore(Employee newEmp, Employee existingEmp) {
        EmployeeNode newEmployee = new EmployeeNode(newEmp);
        EmployeeNode currentNode = head;
        while (currentNode != null) {
            if (currentNode.getEmployee().equals(existingEmp)) {
                newEmployee.setPrev(currentNode.getPrev());
                newEmployee.setNext(currentNode);
                currentNode.setPrev(newEmployee);
                if(head == currentNode){
                    head = newEmployee;
                }else{
                    newEmployee.getPrev().setNext(newEmployee);
                }
                break;
            } else {
                currentNode = currentNode.getNext();
            }
        }
    }

    public EmployeeNode getHead() {
        return head;
    }

    public void setHead(EmployeeNode head) {
        this.head = head;
    }

    public void printList() {
        System.out.print("null <=> head <=> ");
        EmployeeNode current = head;
        while (current != null) {
            System.out.print(current.toString());
            System.out.print(" <=> ");
            current = current.getNext();
        }
        System.out.println(" null");
    }
}
