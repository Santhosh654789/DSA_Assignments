package DSA_Assignments;

// Write a java program to find the middle element of a linked list. 
//For example, if the given list is 1-> 2-> 3-> 4-> 5-> 6 then the output should be 4.



class Middle {
    Node head;

    class Node {
        int data;
        Node next;

        Node(int data) {
            this.data = data;
            this.next = null;
        }
    }

    void addLast(int data) {
        Node newNode = new Node(data);
        if (head == null) {
            head = newNode;
            return;
        }
        Node curr = head;
        while (curr.next != null) {
            curr = curr.next;
        }
        curr.next = newNode;
    }

    void findMiddle() {
        if (head == null) {
            System.out.println("List is Empty....!!!");
            return;
        }

        Node slow = head;
        Node fast = head;

        while (fast != null && fast.next != null) {
            slow = slow.next; 
            fast = fast.next.next; 
        }
        System.out.println(slow.data); 
    }

    void display() {
        Node curr = head;
        while (curr != null) {
            System.out.print(curr.data + " ");
            curr = curr.next;
        }
        System.out.println();
    }

    public static void main(String[] args) {
        Middle m = new Middle();

        m.addLast(1);
        m.addLast(2);
        m.addLast(3);
        m.addLast(4);
        m.addLast(5);
        m.addLast(6);
        m.addLast(7);
        m.addLast(8);
        m.display();
        m.findMiddle();

    }
}
