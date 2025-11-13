package DSA_Assignments;

public class LinkedList3 {
    int size;
    Node head;

    LinkedList3() {
        size = 0;
    }
    class Node {
        int data;
        Node next;

        Node(int data) {
            this.data = data;
            this.next = null;
            size++;
        }
    }
    void addFirst(int data) {
        Node newNode = new Node(data);

        if (head == null) {
            head = newNode;
            return;
        }
        newNode.next = head;
        head = newNode;
    }
    void addLast(int data) {
        Node newNode = new Node(data);

        if (head == null) {
            newNode = head;
            return;
        }
        Node curr = head;
        while (curr.next != null) {
            curr = curr.next;
        }
        curr.next = newNode;
    }

    void display() {
        if (head == null) {
            System.out.println("List is Empty...!!!");
            return;
        }
        Node curr = head;
        while (curr != null) {
            System.out.print(curr.data + " ");
            curr = curr.next;
        }
        System.out.println();
    }

    void deleteFirst() {
        if (head == null) {
            System.out.println("List is Empty...!!!");
            return;
        }
        head = head.next;
        size--;
    }

    void deleteLast() {
        size--;
        if (head.next == null) {
            head = null;
            return;
        }
        Node last = head.next;
        Node slast = head;

        while (last.next != null) {
            last = last.next;
            slast = slast.next;
        }
        slast.next = null;
    }

    void getSize() {
        System.out.println(size);
    }

    void insert(int ind, int val) {
        if (ind < 0 || ind > size) {
            System.out.println("Invalid index...!!!");
            return;
        }
        Node newNode = new Node(val);
        int i = 0;
        Node curr = head;
        while (curr.next != null) {
            if (i == ind - 1) {
            newNode.next = curr.next;
            curr.next = newNode;
        }
        i++;
        curr = curr.next;
    }
}
    void update(int ind, int val) {
        if (ind < 0 || ind > size) {
            System.out.println("Invalid index...!!!");
            return;
        }
        size--;
        Node newNode = new Node(val);
        int i = 0;
        Node curr = head;
        while (curr.next != null) {
            if (i == ind - 1) {
                newNode.next = curr.next.next;
                curr.next = newNode;
            }
            i++;
            curr = curr.next;
        }
    }
    void deleteAtAny(int ind) {
        
        if (ind < 0 || ind > size) {
            System.out.println("Invalid index...!!!");
            return;
        }
        if (head == null) {
            System.out.println("Liast is Empty...!!!");
            return;
        }
        if (head.next == null) {
            head = null;
            return;
        }
        size--;
        int i = 0;
        Node curr = head;
        while (curr.next != null) {
            if (i == ind - 1) {
            curr.next = curr.next.next;
        }
        i++;
        curr = curr.next;
    }
    }
    public static void main(String[] args) {
        LinkedList3 lk = new LinkedList3();

        lk.addFirst(88);
        lk.addFirst(78);
        lk.addFirst(22);
        lk.addFirst(34);
        lk.getSize();
        lk.display();

        lk.addLast(99);
        lk.addLast(87);
        lk.getSize();
        lk.display();

        lk.deleteFirst();
        lk.getSize();
        lk.display();

        lk.deleteLast();
        lk.getSize();
        lk.display();

        lk.insert(1, 56);
        lk.getSize();
        lk.display();

        lk.update(3,21);
        lk.getSize();
        lk.display();

        lk.deleteAtAny(2);
        lk.getSize();
        lk.display();
        
    }
}
