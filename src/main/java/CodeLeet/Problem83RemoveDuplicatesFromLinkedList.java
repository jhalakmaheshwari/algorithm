package CodeLeet;

/**
 * Created by Jhalak on 8/10/2017.
 */
public class Problem83RemoveDuplicatesFromLinkedList {
    public static class ListNode {
      int val;
      ListNode next;
      ListNode(int x) { val = x; }
  }
    public ListNode deleteDuplicates(ListNode head) {
        if(head == null){
            return head;
        }
//        ListNode head1 = head;
        ListNode curr = new ListNode(head.val);
        ListNode prev = new ListNode(head.val);

        ListNode resultList = new ListNode(head.val);
        ListNode prev1 = resultList;
        while(head != null){
            System.out.println(curr.val);
            System.out.println(prev.val);

            if(prev.val == curr.val){

            }
            else{
                System.out.println("Heys");
                prev1.next = new ListNode(curr.val);
                // curr = curr.next;
                prev1 = prev1.next;
            }
            prev = curr;
            System.out.println(head.val);
            head = head.next;

            curr = head;
        }
        return resultList;
    }

    public static void main(String[] args) {
        ListNode head = new ListNode(1);
        head.next = new ListNode(2);
        head.next.next = new ListNode(3);
        Problem83RemoveDuplicatesFromLinkedList pl = new Problem83RemoveDuplicatesFromLinkedList();
        pl.deleteDuplicates(head);
    }
}
