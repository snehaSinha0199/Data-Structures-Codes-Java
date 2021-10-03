package queue;


/*
 * 1. enQueue
 * 2. deQueue
 * 3. getFront
 * 4. getRear
 * 5. size
 * 6. isEmpty
 * 7. clean
 */
public class QueueUsingLinkedList {
	private Node front;
	private Node rear;
	private int size;
 	public void enQueue(int data) {
		Node newNode=new Node(data,null);
		if(front==null) {
			front=newNode;
			rear=front;
			size++;
		}
		else {
			rear.next=newNode;
			rear=newNode;
			size++;
		}
	}
	public int deQueue() {
		if(front==null) {
			return -1;
		}
		else {
			int data = front.data;
			Node temp=front;
			front=front.next;
			temp.next=null;
			size--;
			return data;
		}
	}
	public int getFirst() {
		return size==0 ? -1 : front.data;
	}
	public int getLast() {
		return size==0 ? -1 : rear.data; 
	}
	public boolean isEmpty() {
		return size==0;
	}
	public void clean() {
		front=null;
		rear=null;
	}
	public int size() {
		return size;
	}
private static class Node{
	int data;
	Node next;
	public Node(int data, Node next) {
		this.data = data;
		this.next = next;
	}
	
}
public static void main(String[] args) {
	QueueUsingLinkedList queue=new QueueUsingLinkedList();
	System.out.println(queue.deQueue());
	queue.enQueue(10);
	queue.enQueue(20);
	queue.enQueue(30);
	queue.enQueue(40);
	System.out.println(queue.size());
	System.out.println(queue.deQueue());
	System.out.println(queue.deQueue());
	System.out.println(queue.deQueue());
	System.out.println(queue.deQueue());
	System.out.println(queue.size());
	System.out.println(queue.deQueue());
}
}