package ArrayList;

public class LinkedList {
	int length;
	ListNode head;
	public LinkedList(){
		length=0;
	}
	public synchronized ListNode getHead(){
		return head;
	}
	// insertion at beginning
	public synchronized void insertAtBegin(ListNode node){
		node.setNext(head);
		head=node;
		length++;
	}
	
	//insertion at end
	public synchronized void insertAtEnd(ListNode node){
		node.setNext(null);
		
	}
	

}
