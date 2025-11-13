package DSA_Assignments;

// // Q.5 Write a Java Program to interchange first and last node of Circular Linked List. 
// //The task should be done with only one extra node, 
// //you can not declare more than one extra node. Note: Extra node means the need of a node to traverse a list.

// // Input:
// // 5 4 3 2 1
// // Output
// // 1 4 3 2 5

// // Input : 6 1 2 3 4 5 6 7 8 9
// // Output: 9 1 2 3 4 5 6 7 8 6

public class SingleCircular1 {
    Node head;

    class Node {
        int data;
        Node next;

        Node(int data) {
            this.data = data;
        }
    }
        void addLast(int data) {
            Node newNode = new Node(data);

            if (head == null) {
                head = newNode;
                newNode.next = head;
                return;
            }
            Node curr = head;

            while (curr.next != head) {
                curr = curr.next;
            }
            curr.next = newNode;
            newNode.next = head;
        }

        void swap() {
            if (head == null || head.next == head) {
                return;
            }
            Node curr = head;

            while (curr.next != head) {
                curr = curr.next;
            }
                int temp = head.data;
                head.data = curr.data;
                curr.data = temp;
        }

        void display() {
            if (head == null) {
                System.out.println("List is Empty...!!!");
                return;
            }
            System.out.print(head.data + " ");
            Node curr = head.next;
        
            while (curr != head) {
                System.out.print(curr.data + " ");
                curr = curr.next;
            }
            System.out.println();
        }
        public static void main(String[] args) {
            SingleCircular1 sc = new SingleCircular1();

            sc.addLast(5);
            sc.addLast(4);
            sc.addLast(3);
            sc.addLast(2);
            sc.addLast(1);
            sc.display();

            sc.swap();
            sc.display();
        }
    }

