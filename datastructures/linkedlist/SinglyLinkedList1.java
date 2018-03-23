package datastructures.linkedlist;


public class SinglyLinkedList1 {

    // class to represent Node in linked list
    private static class ListNode {

        private int data;
        private ListNode next;

        ListNode(int data) {

            this.data = data;
            next = null;
        }
    }

    // method to print linkedlist

    private static void printList(ListNode head) {

        if (head == null) {
            return;
        }

        ListNode current = head;

        while (current != null) {

            System.out.print(current.data+" -> ");
            current = current.next;
        }

        System.out.print(current);

    }

    // method to get the length of linkedlist

    private static int getLength(ListNode head) {

        if (head == null) {
            return 0;
        }
        int count =0;
        ListNode current = head;

        while (current != null) {

            count++;
            current = current.next;

        }

        return count;
    }

    // method to delete first node in linkedlist

    private static ListNode deleteFirst(ListNode head) {

        if (head == null) {

            return head;
        }

        ListNode temp = head;

        head = head.next;

        temp.next = null;

        return head;
    }

    // delete the last node from the linkedlist

    private static ListNode deleteLast(ListNode head) {

        if (head == null) {

            return head;
        }

        ListNode last = head;

        ListNode previousToLast = null;

        while (last.next != null) {

            previousToLast = last;
            last = last.next;

        }

        previousToLast.next = null;

        return head;
    }

    // delete node at given position
    private static ListNode deleteAtPosition(ListNode head, int position) {

        int size = getLength(head);

        if (position > size || position < 1) {

            System.out.println("Invalid position");
            return head;
        }

        ListNode previous = head;
        int count = 1;

        while (count < position - 1) {

            previous = previous.next;
            count++;

        }

        ListNode current = previous.next;

        previous.next = current.next;
        current.next = null;

        return head;
    }

    // method to search key from linked list

    private static boolean searchKey(ListNode head, int key) {

        if (head == null) {

            return false;
        }

        ListNode current = head;

        while (current != null) {

            if (current.data == key) {

                return true;
            }

            current = current.next;
        }

        return false;
    }

    // reverse linked list

    private static ListNode reverseList(ListNode head) {

        if (head == null) {

            return head;
        }

        ListNode current = head;
        ListNode previous = null;
        ListNode next = null;

        while (current != null) {

            next = current.next;

            current.next = previous;

            previous = current;
            current = next;
        }

        return previous;
    }


    public static void main(String[] args) {

        // creating new nodes
        ListNode head = new ListNode(34);
        ListNode second = new ListNode(45);
        ListNode third = new ListNode(78);
        ListNode fourth = new ListNode(23);
        ListNode fifth = new ListNode(90);

        // joining these nodes together to form lined list

        head.next = second;
        second.next = third;
        third.next = fourth;
        fourth.next = fifth;

        // printing the linked list
        printList(head);
        System.out.println();

        // deleting the first node from list
//        System.out.println();
//        System.out.println("After deleting the first node :");
//        printList(deleteFirst(head));

//        System.out.println();
//        System.out.println("After deleting the last node :");
//        printList(deleteLast(head));

//
//        System.out.println("deleting node at position 3 :");
//        printList(deleteAtPosition(head,3));
//
//        System.out.println("10 is in linked list : "+searchKey(head, 10));
//        System.out.println("23 is in linked list : "+ searchKey(head,23));

        // reversing the linked list
        printList(reverseList(head));
    }

}
