package linkedlist;/*Reverse a singly linked list

Example 0(N)
        Input: 1->2->3->4->5->NULL
        Output: 5->4->3->2->1->NULL
*/

public class ReverseALinkedList {

    public static void main(String[] args) {
        ReverseALinkedList reverseALinkedList = new ReverseALinkedList();

        ListNode node1 = new ListNode(10);
        ListNode node2 = new ListNode(20);
        ListNode node3 = new ListNode(30);
        node1.next = node2;
        node2.next = node3;

        ListNode newNode = reverseALinkedList.reverseList(node1);
        while (newNode != null) {
            System.out.println("newNode.val = " + newNode.val);
            newNode = newNode.next;
        }
    }

    public ListNode reverseList(ListNode head) {

        ListNode newHead = null;
        while (head != null) {
            ListNode next = head.next;
            head.next = newHead;
            newHead = head;
            head = next;
        }
        return newHead;
    }
}

class ListNode {
    int val;
    ListNode next;

    public ListNode(int val) {
        this.val = val;
    }
}