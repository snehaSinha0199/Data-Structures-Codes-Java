package linkedlist;

public class SinglyLinkedList {
	private Node head;
	private int size;
	private Node prev;
	/*
	 * 1.create a new node.
	 * 2.check head is null or not if null means there is no element in the list.
	 * 3.if head is null then link newNode to head.and increase the size.
	 * 4.else traverse till last node then link newNode to last node and increase the size.
	 */
	public void add(int data) {
		Node newNode=new Node(data,null);
		if(head==null) {
		//head=newNode;
		//size++;
			addFirst(data);
		}
		else {
			/*
			 * Node temp=head;
			 *  while(temp!=null && temp.next!=null )
			 *   {
			 *    temp=temp.next; 
			 *    }
			 * temp.next=newNode; 
			 * size++;
			 */
			addLast(data);
		}
	}
	/*
	 *1.create a new node.
	 *2.link head to the firstNode.next.
	 *3.link firstNode to head and increase the size.
	 *4.T.C.O(1).
	 */
	public void addFirst(int data) {
		Node newNode=new Node(data,null);
		newNode.next=head;
		head=newNode;
		size++;
		
	}
	/*
	 * 1.create a new node.
	 * 2.traverse till last node 
	 * 3.link newNode to temp.next.
	 * 4.increase the size.
	 * T.C.=O(1) 
	 */
	public void addLast(int data) {
		Node newNode=new Node(data,null);
		Node temp=head;
		while(temp.next!=null)  { //
			temp=temp.next;
		}
		temp.next=newNode;
		size++;
		
	}
	/*
	 * 1.check the index 
	 * 2.validate the index range if not valid return the index.
	 * 3.else check
	 *    a)it is at first position.
	 *    b)it is at last position.
	 *    c)it is at mid(between first and last) position.
	 * 4.link the newNode at appropriate position.
	 * 5.increase the size.  
	 * T.C.=O(n).
	 */
	public void add(int index,int data) {
		Node newNode=new Node(data,null);
			if(!(index>=0 && index<=size)) {
				return;
			}
			if(index==0) {
				addFirst(data);
				return;
			}
			if(index==size) {
				addLast(data);
				return;
			}
			//add at middle
			Node temp=head;
			for(int i=0;i<index-1;i++) {
				temp=temp.next;
				}
		 newNode.next=temp.next;
			temp.next=newNode;
			size++;
			
	}
	/*
	 * 1.check head is null or not.
	 * 2.if not null then move head pointer to 2nd node.
	 * 3.remove 1st node.
	 */
	public void removeFirst() {
		validateHead();
		head=head.next;
		size--;
	}
	/*
	 * check head is null or not.
	 *traverse till previous node of the (size-2)..
	 * remove last node.
	 * decrease the size.
	 * 
	 *  
	 */
	public void removeLast() {
		validateHead();
		Node temp=head;
		
		  for(int i=0;i<size-2;i++)
		  {
			  temp=temp.next; 
			  }
		 
				
		temp.next=null;
		size--;
	}
	private void validateHead() {
		if(head==null) {
			return;
		}
	}
	/*
	 * 1.validate head.
	 * 2.check the given data is first element or not.
	 * 3.if it is first element then remove the node.
	 * 4.otherwise,traverse till given node or appropriate data.
	 */
	public void remove(int data) {
		validateHead();
		Node temp=head;
		if(temp.data==data) {
			removeFirst();
			return;
		}
		while(temp!=null) {
			if(temp.data==data) {
			prev.next=temp.next;
			temp.next=null;
			size--;
			return;
		}
		prev=temp;
		temp=temp.next;
	}
		}
	/*
	 * check given index is valid or not or lie between the range.
	 * if not valid then return -1.
	 * else traverse till given index.
	 */
	public int get(int index) {
		if(!(index>=0 && index<size)) {
		return -1;
	}
		Node temp=head;
		for(int i=0;i<index;i++) {
			temp=temp.next;
		}
		return temp.data;
	}
	/*
	 * 1.validate head
	 * 2.traverse till given node.
	 * 3.if data found return true.
	 * 4.else return false.
	 */
	public boolean contains(int data) {
		validateHead();
		Node temp=head;
		while(temp!=null) {
		if(temp.data==data) {
			return true;
		}
		temp=temp.next;
		}
		return false;
	}
	
	public int size() {
		return size;
	}
	public void display() {
		Node temp=head;
	while(temp!=null) {
		System.out.println(temp.data);
		temp=temp.next;
	}	
	}

	private static class Node {
		int data;
		Node next;

		public Node(int data, Node next) {
			this.data = data;
			this.next = next;
		}
	}
	public static void main(String[] args) {
		SinglyLinkedList sll=new SinglyLinkedList();
 		sll.add(10);
		sll.add(20);
		sll.add(30);
		sll.add(40);
		sll.addLast(50);
		//sll.add(4,70);
		//sll.display();
		//sll.removeFirst();
		//System.out.println(sll.size());
		//sll.removeLast();
		//sll.remove(10);
		sll.get(6);
		sll.display();
		//System.out.println(sll.size());
		//System.out.println(sll.contains(80));
	}
}
