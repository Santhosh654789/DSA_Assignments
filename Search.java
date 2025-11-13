package DSA_Assignments;

// Write a java program to search an element in linked list. Given a linked list and a key "X" in, the task is to check if X is present in tha linked list or not 
// Input:
// 14->21 ->11-> 30-> 10,
// X = 14
// Output: yes

 public class Search {
    
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

        boolean search(int key) {
            Node curr = head;

            while (curr != null) {
                if (curr.data == key) {
                    return true;
                }
                curr = curr.next;
            }
            return false;
        }

        void display() {
            Node curr = head;
            
            while (curr.next != null) {
                System.out.print(curr.data + " ");
                curr = curr.next;
            }
            System.out.println();
        }

        public static void main(String[] args) {
        Search s = new Search();

        s.addLast(14);
        s.addLast(21);
        s.addLast(11);
        s.addLast(30);
        s.addLast(10);
        s.display();

        int x = 14;

        if (s.search(x)) {
            System.out.println("yes");
        }else{
            System.out.println("No");
        }

    }
}
