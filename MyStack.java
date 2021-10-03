package stack;
/*
 * Application of stack:-
 * 1.In function call
 * 2.Checking for balanced expression
 * 3.Reversing items
 * 4.Infix to prefix/postfix
 * 5.Undo/Redo or Forward/Backward
 * 6.Stock span problems and its variation *****
 * 
 * 
 * Operation on stack(Abstract data type)
 * 1.push
 * 2.pop
 * 3.size
 * 4.isEmpty
 * 5.peek
 * 
 *  Stack implementation using array(fixed in size)
 */
public class MyStack {
private int[] array;
private int size;
private static int capacity=10;
public MyStack() {
	this.array=new int[capacity];
}
public void push(int data) {
	/*
	 * 1.check stack is full or not
	 * else add or push the element
	 * 3.increase the size
	 * T.C.:-O(1)
	 * 
	 */
	if(size!=capacity) { 
	  array[size++]=data;
	}
	else {
		throw new RuntimeException("stack overflow");
}
}
public int pop() {
	/*
	 * first check stack is full or not if empty then throw exception
	 * else pop the element and decrease the size
	 * T.C.:-O(1)
	 */
	if(size>0) {
		int result=this.array[size-1];
		/*for(int i=size-1;i>0;i--) {
			array[i]=array[i-1]; what happen if we will do this?
		}*/ 
		size--;
		return result;
	}
	else {
		throw new RuntimeException("stack underflow");
	}
}
/*
 * 1.
 * 2.else pop the element
 * T.C.:-O(1)
 */
public int peek() {
	if(size>0) {
		return this.array[size-1];
		
	}
	else {
		throw new RuntimeException("stack underflow");
	}
}
/*
 * check size=0 then true
 * else false
 * T.C:-O(1)
 */
public boolean isEmpty() {
    return size==0;
}
/*
 * return size
 * T.C.:-O(1)
 */
public int size() {
	return size;
}
public static void main(String[] args) {
	MyStack stack=new MyStack();
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
	//System.out.println(stack.size);
	//System.out.println(stack.peek());
	System.out.println(stack.pop());//100
	
	//System.out.println(stack.pop());//90
	//System.out.println(stack.pop());//80
	System.out.println(stack.size);//7
	//System.out.println("--------");
	/*int count=stack.size();
	for(int i=0;i<count;i++) {
		System.out.println(stack.pop());
	}
	System.out.println(stack.pop());
	System.out.println(stack.isEmpty());//true
	*/
}
}
