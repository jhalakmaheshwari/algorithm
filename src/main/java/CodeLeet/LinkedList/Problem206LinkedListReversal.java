package CodeLeet.LinkedList;

/**
 * Created by Jhalak on 8/11/2017.
 */
public class Problem206LinkedListReversal {
    public ListNode reverseList(ListNode head) {
        if (head == null) {
            return null;
        }
        ListNode prev = null;
        ListNode prevCopy = prev;
        ListNode reverseHead = new ListNode(head.val);
        while (head != null) {
            System.out.println(head.val);
            reverseHead.val = head.val;
            reverseHead.next = prev;

            prev = new ListNode(reverseHead.val);
            prev.next = prevCopy;
            prevCopy = prev;
            head = head.next;
        }
        System.out.println(reverseHead.val);
        return reverseHead;
    }

    public static void main(String[] args) {
        Problem206LinkedListReversal pl = new Problem206LinkedListReversal();
        ListNode l = new ListNode(1);
        l.next = new ListNode(2);
        pl.reverseList(l);
    }

}
