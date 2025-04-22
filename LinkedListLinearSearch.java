// Write a java  program that implements linear search in a singly linked list.

public class LinkedListLinearSearch {

    // Node class
    static class Node {
        int data;
        Node next;

        Node(int data) {
            this.data = data;
            this.next = null;
        }
    }

    // Linked List class
    static class SinglyLinkedList {
        Node head;

        // Add node at end
        public void append(int data) {
            Node newNode = new Node(data);
            if (head == null) {
                head = newNode;
                return;
            }

            Node current = head;
            while (current.next != null) {
                current = current.next;
            }
            current.next = newNode;
        }

        // Linear search
        public int linearSearch(int target) {
            Node current = head;
            int position = 0;

            while (current != null) {
                if (current.data == target) {
                    return position;
                }
                current = current.next;
                position++;
            }

            return -1; // Not found
        }

        // Print list (for reference)
        public void printList() {
            Node current = head;
            while (current != null) {
                System.out.print(current.data + " -> ");
                current = current.next;
            }
            System.out.println("null");
        }
    }

    // Main method to test
    public static void main(String[] args) {
        SinglyLinkedList list = new SinglyLinkedList();

        list.append(10);
        list.append(20);
        list.append(30);
        list.append(40);
        list.append(50);

        list.printList();

        int searchValue = 30;
        int result = list.linearSearch(searchValue);

        if (result != -1) {
            System.out.println("Element " + searchValue + " found at position " + result);
        } else {
            System.out.println("Element " + searchValue + " not found in the list.");
        }
    }
}

// output:
// 10 -> 20 -> 30 -> 40 -> 50 -> null
// Element 30 found at position 2




 
