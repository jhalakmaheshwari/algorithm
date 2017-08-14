package CodeLeet.LinkedList;

/**
 * Created by Jhalak on 8/10/2017.
 * Given a linked list, determine if it has a cycle in it.

 Follow up:
 Can you solve it without using extra space?
 */
class ListNode {
    int val;
    ListNode next;

    ListNode(int x) {
        val = x;
        next = null;
    }
}

public class Problem143LinkedListCycle {

    public boolean hasCycle(ListNode head) {
//         LOOKUP Table Soln
        // HashMap<ListNode, Integer> lookup = new HashMap<ListNode, Integer>();
        // while(head != null){
        //     if(lookup.containsKey(head)){
        //         return true;
        //     }
        //     else{
        //         lookup.put(head, head.val);
        //     }
        //     head = head.next;
        // }

        /*Floyd’s Cycle-Finding Algorithm:*/
        ListNode head1 = head;
        while (head != null && head1!=null) {
            head = head.next;
            if(head1.next != null)
                head1 = head1.next.next;
            else{
                return false;
            }
            if (head == head1) {
                System.out.println(head.val + "  Head1 : "+head1.val);
                return true;
            }
        }


        return false;
    }

    public static void main(String[] args) {
        ListNode ln = new ListNode(1);
        ln.next = new ListNode(2);
        Problem143LinkedListCycle pl = new Problem143LinkedListCycle();
        pl.hasCycle(ln);
    }
}
