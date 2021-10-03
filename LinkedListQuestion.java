package linkedlist;


public class LinkedListQuestion extends SinglyLinkedList {
	private Node head;
	private int size;
	private int index;
	public int getFirstIndex() {
		return 0;
	}
	public int getLastIndex() {
		return size()-1;
	}

private static class Node {
	int data;
	Node next;

	public Node(int data, Node next) {
		this.data = data;
		this.next = next;
	}
}
}
