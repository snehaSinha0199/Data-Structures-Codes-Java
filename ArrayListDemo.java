package arrayDS;

public class ArrayListDemo {
private int[] arr;
private int size;
public ArrayListDemo() {
int[] arr=new int[10];	
}
public void add(int data) {
	if(size<arr.length) {
		arr[size]=data;
		size++;
	}
}
public void add(int index,int data) {
	if(index>=0 && index<=size) {
		for(int i=size-1;i<=size;i--) {
			
		}
	}
}
}
