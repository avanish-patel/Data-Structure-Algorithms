package datastructures.linkedlist;

public class SinglyLinkedList {

    // class to represent linkedlist Node
    private static class ListNode{

        private int data;
        private ListNode next;

        ListNode(int data) {

            this.data = data;
            this.next = null;
        }
    }

    // method to print the linked list

    private static void printList(ListNode head) {

        if (head == null) {
            return;
        }

        ListNode current = head;

        while (current != null) {

            System.out.print(current.data + " -> ");

            current = current.next;
        }

        System.out.print(current);
    }

    // method to find the length of linkedlist
    private static int getLength(ListNode head) {

        if (head == null) {

            return 0;
        }
        int count = 0;

        ListNode current = head;

        while (current != null) {

            count++;
            current = current.next;
        }

        return count;
    }

    // insert new node at the beginning of the list

    private static ListNode insertAtBegin(ListNode head, int data) {

        ListNode newNode = new ListNode(data);

        if (head == null) {

            return newNode;
        }

        newNode.next = head;
        head = newNode;

        return head;
    }

    // insert new node at the end of the list

    private static ListNode insertAtEnd(ListNode head, int data) {

        ListNode newNode = new ListNode(data);

        if (head == null) {
            return newNode;
        }

        ListNode current = head;

        while (null != current.next) {

            current = current.next;

        }

        current.next = newNode;

        return head;
    }

    // insert new node after any node
    private static void insertAfter(ListNode previous, int data) {

        if (previous == null) {

            System.out.println("It is the end of the list.");
            return;
        }

        ListNode newNode = new ListNode(data);

        newNode.next = previous.next;

        previous.next = newNode;
    }

    // insert node at any position

    private static ListNode insertAtPosition(ListNode head, int data, int position) {

        int size = getLength(head);

        if (position > size+1 || position < 1) {

            System.out.println("Invalid Position");

            return head;
        }

        ListNode newNode = new ListNode(data);

        if (position == 1) {

            newNode.next = head;

            return head;
        }else {

            ListNode previous = head;

            int count = 1;

            while (count < position - 1) {

                previous = previous.next;

                count++;
            }

            ListNode current = previous.next;

            newNode.next = current;

            previous.next = newNode;

            return head;
        }
    }

    // main method
    public static void main(String[] args) {

        // create nodes 23, 12, 45, 4

        ListNode head = new ListNode(23);
        ListNode second = new ListNode(12);
        ListNode third = new ListNode(45);
        ListNode fourth = new ListNode(4);

        // link those node such that 23 -> 12 -> 45 -> 4 -> null

        head.next = second;
        second.next = third;
        third.next = fourth;


        // print the linkedlist
        System.out.println("Linked list : ");
        printList(head);

        System.out.println();
        // print the length of linked list

        System.out.println("Length of linked list : "+ getLength(head));

        // inserting data at the beginning of the list and printing the new list
        System.out.println("After adding 15 to the front of list :");
        ListNode newList = insertAtBegin(head, 15);
        printList(newList);


        System.out.println();
        // inserting data at the end of the list and printing the new list
        System.out.println("After adding 35 at the end of newList : ");
        ListNode newList1 = insertAtEnd(newList, 35);
        printList(newList1);

        // inserting node after the second node
        System.out.println();

        System.out.println("Inserting 99 after second node : ");
        insertAfter(second, 99);
        printList(head);

        // inserting new node at position 3

        System.out.println();
        System.out.println("Inserting node 22 at position 3");
        printList(insertAtPosition(head,22,3));
    }
}
