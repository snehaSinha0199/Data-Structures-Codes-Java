package stack;

import java.util.ArrayList;

public class DynamicStack {
private ArrayList<Integer> list;
	public DynamicStack() {
		this.list=new ArrayList<>();
		}
	public void push(int data) {
		list.add(data);
	}
	public int pop() {
		if(list.size()>0) {
		int result= list.remove(list.size()-1);
		return result;
		}
		else {
			throw new RuntimeException("stack underflow");
		}
			
	}
	public int peek() {
		if(list.size()>0) { 
		return list.get((list.size()-1));
		}
		else {
			throw new RuntimeException("stack underflow");
		}
		}
	
	public boolean isEmpty() {
		return list.size()==0;
	}
	
	public int size() {
		return list.size();
	}
	public static void main(String[] args) {
		DynamicStack stack=new DynamicStack();
		//stack.pop();
		stack.push(10);
		//stack.pop();
		stack.push(20);
		stack.push(30);
		stack.push(40);
		stack.push(50);
		stack.push(60);
		stack.push(70);
		stack.push(80);
		stack.push(90);
		stack.push(100);
		System.out.println(stack.size());
		System.out.println(stack.peek());
		
		//System.out.println(stack.pop());//100
		//System.out.println(stack.pop());//90
		//System.out.println(stack.pop());//80
		//System.out.println(stack.size);//7
		//ystem.out.println("--------");
		int count=stack.size();
		for(int i=0;i<count;i++) {
			System.out.println(stack.pop());
		}
		System.out.println(stack.pop());
		
	}

}
