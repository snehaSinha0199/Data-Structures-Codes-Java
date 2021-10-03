package queue;
/*
 * 1.inqueue
 * 2.dequeue
 * 3.getFirst
 * 4.getLast
 * 5.size
 * 6.isEmpty
 * 7.isFull
 * 8.clear
 */
public class MyQueue {
private int[] array;
private int size;
private static final int capacity=10;

public MyQueue() {
	this.array=new int[capacity];
}
public void enQueue(int data) {
	//T.C.=O(1)
	if(!isFull()) {
	 this.array[size++]=data;
	}
	
	
}
/*
 *Q.Is it possible to reduce the time complexity to O(1)?
 *Ans.yes,with the help of circular array
 *(hint:-circular array,(rear=[front+(size-1)]%capacity)
 */
public int deQueue() {
	//T.C:-O(n)
	if(!isEmpty()) {
		int data = this.array[0];
		for(int i=0;i<size-1;i++) {
			array[i]=array[i+1];
		}
		size--;
		return data;
	}
		else 
			return -1;	
}
public int getFirst() {
	//T.C:-O(1)
	return !isEmpty()?array[0]:-1;
}
public int getLast() {
	//T.C.:-O(1)
	return !isEmpty()?array[size-1]:-1;
}
public int size() {
	//T.C.:-O(1)
	return size;
}
public void clear() {
	//T.C.:-O(1)
	this.array=null;
}
public boolean isFull() {
	//T.C.:-O(1)
	return size==capacity;
	}
public boolean isEmpty() {
	//T.C.:-O(1)
	return size==0;
}
public static void main(String[] args) {
	MyQueue queue=new MyQueue();
	System.out.println(queue.size());
	queue.enQueue(10);
	queue.enQueue(20);
	queue.enQueue(30);
	queue.enQueue(40);
	//System.out.println(queue.deQueue());
	//System.out.println(queue.getFirst());
	//System.out.println(queue.getLast());
	//System.out.println(queue.deQueue());
	//System.out.println(queue.deQueue());
	
	
	
}
}
