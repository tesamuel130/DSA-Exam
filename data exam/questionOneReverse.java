class ListNode {
    int value;
    ListNode next;

    ListNode(int value) {
        this.value = value;
        this.next = null;
    }
}

public class questionOneReverse {
    public static ListNode reverseList(ListNode head) {
        ListNode prev = null;
        ListNode current = head;
        ListNode next = null;

        while (current != null) {
            next = current.next;

            current.next = prev;

            prev = current;
            current = next;
        }

        return prev;
    }

    public static void printList(ListNode head) {
        ListNode current = head;
        while (current != null) {
            System.out.print(current.value + " ");
            current = current.next;
        }
        System.out.println();
    }

    public static void main(String[] args) {
        ListNode head = new ListNode(10);
        head.next = new ListNode(20);
        head.next.next = new ListNode(30);
        head.next.next.next = new ListNode(40);
        head.next.next.next.next = new ListNode(5);
        head.next.next.next.next.next= new ListNode(60);

        System.out.println("Original list:");
        printList(head);

        ListNode reversedHead = reverseList(head);

        System.out.println("Reversed list:");
        printList(reversedHead);
    }
}

