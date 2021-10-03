package stack;
/*
 * Order of statement in a class.
 * 1.Constant variable.
 *   e.g. private static final double PIE=3.14
 * 2.static variable
 *   e.g. private static String name="aastha"
 * 3.Instance variable
 *   e.g. private String fullname="pk"
 * 4.constructor
 *  public MyConstructor(){}
 * 5.Methods(static or non-static)
 * 6.Helper method(private)-just after respective actual method
 * 7.enum or interface or class
 * 
 */


public class SinglyStack {
	private int size;
	private Node top;
	private static class Node {
		int data;
		Node next;

		public Node(int data, Node next) {
			super();
			this.data = data;
			this.next = next;
		}
	}
	public void push(int data) {
		Node newNode=new Node(data,null);
			newNode.next=top;
			top=newNode;
			size++;
	}
	public int pop() {
		if(top==null) {
			throw new RuntimeException("stack is underflow");
		}
		else {
			int data=top.data;
			top=top.next;
			size--;
			return data;
		}
		
	}
	public int peek() {
		if(top==null) {
			throw new RuntimeException("stack is underflow");
		}
		else {
			int data=top.data;
			return data;
		}
	}
	public int size() {
		return size;
	}
	public boolean isEmpty() {
		return size==0;
	}
	public void clean() {
		this.top=null;
	}
	public static void main(String[] args) {
		SinglyStack stack=new SinglyStack();
		System.out.println(stack.isEmpty());//true
		stack.push(100);
		stack.push(200);
		stack.push(300);
		stack.push(400);
		stack.push(500);
		System.out.println(stack.size());//5
		System.out.println(stack.peek());//500
		System.out.println(stack.pop());//500
		System.out.println(stack.size());//4
		stack.clean();
		System.out.println(stack.pop());//exception
	}
}
