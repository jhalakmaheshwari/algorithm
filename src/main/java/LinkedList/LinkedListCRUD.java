package LinkedList;

import java.util.LinkedList;
import java.util.List;

/**
 * Created by Jhalak on 5/22/2017.
 */

/*Singly Linked List Implementation*/
public class LinkedListCRUD<E> {

    public static class ListNode{
        private int data;
        private ListNode next;
        private ListNode prev;
        public ListNode(){}
        public ListNode(int data){
            this.data=data; next=null;
            prev=null;
        }
        public ListNode(int data, ListNode next,ListNode prev){
         this.data=data;
         this.next=next;
         this.prev=prev;
        }

        public int getData() {
            return data;
        }

        public void setData(int data) {
            this.data = data;
        }

        public ListNode getNext() {
            return next;
        }

        public void setNext(ListNode next) {
            this.next = next;
        }

        public void setPrev(ListNode prev) {
            this.prev = prev;
        }

        public ListNode getPrev() {
            return prev;
        }
    }

    ListNode head;

    /*Constructor*/
    public LinkedListCRUD(){
        LinkedList l=new LinkedList();

    }
    int length=0;
    public void insertAtBegin(ListNode node){
        node.setNext(head);
        head=node;
        length++;
    }

    public void insertAtEnd(ListNode node){
        if(head==null){
            head=node;
        }
        else{
            node.setNext(null);
//            ListNode temp=head.getNext();
            ListNode p,q;
            for (p=head; (q=p.getNext())!=null; p=q){

            }
            p.setNext(node);
            length++;
        }
    }

    public void insert(int data,int position){
        ListNode nodeInsert=new ListNode(data);
        if(position==0)
            insertAtBegin(nodeInsert);
        else if(position == length-1)
            insertAtEnd(nodeInsert);
        else{
            ListNode p,q=new ListNode(),r=new ListNode();
            int i=0;
            while(i<position){
                p=head;
                q=p.getNext();
                r=q.getNext();
                i++;
            }
            nodeInsert.setNext(r);
            q.setNext(nodeInsert);


        }
    }

    public static void main(String[] args) {
        LinkedListCRUD llc=new LinkedListCRUD();
        llc.insertAtBegin(new ListNode(20));
        llc.insertAtBegin(new ListNode(21));
        llc.insertAtEnd(new ListNode(22));
        llc.insertAtEnd(new ListNode(23));
        llc.insert(24,2);
    }
}
