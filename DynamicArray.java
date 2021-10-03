package arrayDS;

public class DynamicArray {
private int[] array;
private int capacity=10;
private int size;
public DynamicArray() {
	this.array=new int[10];
}
/*
 * 1.check bucket is full or not.
 * 2.if bucket is full then
 *   a)take temporary array
 *   b)double the capacity of original array.
 *   c)copy the data from temporary array to original size.
 * 3.add the data to the array.
 * 4.increase the size.
 */
public void add(int data) {
	if(size!=capacity) {
		this.array[size++]=data;
	}
	else {
		int[] temp=array;
		this.capacity=capacity*2;
		this.array=new int[capacity];
		for(int i=0;i<size;i++) {
		array[i]=temp[i];
		}
		array[size++]=data;
	}
}
/*
 * 1.first check index is in the range.
 * 2.start the loop from index till size.
 * 3.assign value of array [i+1] into array[i]
 * 4.and then increase the size.
 * 
 * T.C. :-O(n)
 * S.C. :-O(1)
 */
public void remove(int index) {
	if(index>=0 && index<size) {
		for(int i=index;i<size-1;) {
			array[i]=array[++i];
		}
		size--;
	}
}
/*
 * 1.check index is in the range
 * 2.return the value
 * T.C.:-O(1)
 * S.C:-O(1)
 */

public int get(int index) {
	return 10;
}
public int size() {
	return size;
}
public void display() {
	for(int i=0;i<size;i++) {
		System.out.println(array[i]);
	}
}
public static void main(String[] args) {
	DynamicArray array=new DynamicArray();
	array.add(10);
	array.add(20);
	array.add(30);
	array.add(40);
	array.add(50);
	array.add(60);
	array.add(70);
	array.add(80);
	array.add(90);
	array.add(100);
	array.add(110);
	array.remove(5);
	array.display();
	System.out.println(array.size());
}
}
