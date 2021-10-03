package dequeue;
/*
 * operations on dequeue:-
 * 1.insertFront()
 * insertRear()
 * deleteFront()
 * deleteRear()
 * getFirst()
 * getRear()
 * isEmpty()
 * size()
 * MyDequeue underlying data structure is simple array/circular array
 * front=(front+capacity-1)%capacity
 * rear=(front+size)%capacity
 */
public class MyDequeue {
	private static int capacity=10;
private int[] array;
private int size;
private int front;
private int rear;
private int f;
private int r;
public MyDequeue() {
	this.array=new int[capacity];
}
public void insertFront(int data) {
	front=(front+capacity-1)%capacity;
	this.array[front]=data;
	size++;
}
public void insertRear(int data) {
	if(!isFull()) {
	rear=(front+size)%capacity;
	this.array[rear]=data;
	size++;
}
}
public int deleteFront() {
	f=(f+1)%capacity;
	int data=isEmpty()?-1:this.array[size-1];
	size--;
	return data;
}
public int deleteRear() {
	if(!isEmpty()) {
	return -1;
	}
	else {
		int data=this.array[r--];
		size--;
		return data;
	}
	
}
public int getFront() {
	return isEmpty()?-1:this.array[0];
}
public int getRear() {
	rear=(front+size-1)%capacity;
	return isEmpty()?-1:this.array[size-1];
}
public boolean isFull() {
	return size==capacity;
}
public boolean isEmpty() {
	return size==0;
}
public int size() {
	return size;
}
public static void main(String[] args) {
	MyDequeue dequeue=new MyDequeue();
	dequeue.insertFront(10);
	dequeue.insertFront(20);
	dequeue.insertFront(30);
	dequeue.insertFront(40);
	dequeue.insertFront(50);
	dequeue.insertRear(60);
	dequeue.insertRear(70);
	dequeue.insertRear(80);
	dequeue.insertRear(90);
	dequeue.insertRear(100);
	System.out.println(dequeue.size());
	System.out.println(dequeue.getFront());
	System.out.println(dequeue.getRear());
}
}









