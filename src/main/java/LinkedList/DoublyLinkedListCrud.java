package LinkedList;


/**
 * Created by mahes on 5/23/2017.
 */
public class DoublyLinkedListCrud {
    LinkedListCRUD.ListNode head;
    private int headPos=0;
    public int length=0;

    public void insertAtBegin(LinkedListCRUD.ListNode node){
        if(head==null){
            head=node;
        }
        else {
            node.setNext(head);
            head.setPrev(node);
            headPos++;
            length++;
        }
    }

    public void insertAtEnd(LinkedListCRUD.ListNode node){
        while(head.getNext()!=null){
            head=head.getNext();headPos++;
        }
        head.setNext(node);
        node.setPrev(head);
        length++;
    }

    public void insert(int position,LinkedListCRUD.ListNode node){
        if(position==0){
            insertAtBegin(node);
        }
        else if(position==length){
            insertAtEnd(node);
        }
        else{
            LinkedListCRUD.ListNode p=null;
            int i=0;
            if(position>headPos){
                i=headPos;
                while(i<position){
                    p=head.getNext();
                    i++;
                }
            }
            else if(position<headPos){
                i=headPos;
                while(i>position){
                    p=head.getPrev();
                    i--;
                }
            }
            else{
                p=head;
            }
            LinkedListCRUD.ListNode q=p.getNext();

//            p.getNext().setPrev(node);
            p.setNext(node);
            node.setPrev(p);
            node.setNext(q);
            q.setPrev(node);
            length++;
        }
    }

//    DELETE NODES:
    public void delete(int position){
        if(position==0) {
            while (position < headPos) {
                head = head.getPrev();
                headPos--;
            }
            head = head.getNext();
            headPos=0;
            head.setPrev(null);
            length--;
        }
        else if(position == length){
            while (position > headPos) {
                head = head.getNext();
                headPos++;
            }
            head = head.getPrev();
            head.setNext(null);
            length--;
            headPos=length;
        }
        else {
            int i = 0;
            LinkedListCRUD.ListNode p = null;
            if (position > headPos) {
                i = headPos;
                while (i < position) {
                    p = head.getNext();
                    i++;
                }
            } else if (position < headPos) {
                i = headPos;
                while (i > position) {
                    p = head.getPrev();
                    i--;
                }
            } else {
                p = head;
            }

            head = p.getPrev();
            p.getNext().setPrev(head);
            head.setNext(p.getNext());
            length--;
        }

    }

    public static void main(String[] args) {
        DoublyLinkedListCrud dllc=new DoublyLinkedListCrud();
        dllc.insertAtBegin(new LinkedListCRUD.ListNode(15));
        dllc.insertAtBegin(new LinkedListCRUD.ListNode(14));
        dllc.insertAtEnd(new LinkedListCRUD.ListNode(16));
        dllc.insertAtEnd(new LinkedListCRUD.ListNode(17));
        dllc.insert(2,new LinkedListCRUD.ListNode(20));
        dllc.delete(4);
        System.out.println(dllc);
    }

}
