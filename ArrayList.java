package arrayDS;

public class ArrayList {
private int[] array;
private int size;
public ArrayList() {
	this.array=new int[10];
}
public void add(int data) {
	/*
	 * 1.check array is full or not.
	 * 2.if not full then add the element.
	 * 3.increase the size.
	 * T.C=O(1)
	 * S.C=O(1)
	 */
	if(size<array.length) {
		array[size]=data;
		size++;
		
	}
	
}
/*
 * 1.first validate the index lies between the range.
 * 2.start the loop from size-1 till given index.
 * 3.do the right shifting e.g, array[i+1]=array[i]
 * 4.assign the data into the array at given position.
 * 5.increase the size.
 * TIME COMPLEXITY=O(n).
 * SPACE COMPLEXITY=O(1) explanation 4(index)+4(size)+4(data)+4(i)=12
 */
public void add(int index,int data) {
	if(index>=0 && index<size) {
		for(int i=size-1;i>=index;i--) {
			array[i+1]=array[i];
		}
		array[index]=data;
		size++;
	}
	}
public void remove(int index) {
	/*
	 * 1.first validate the index(lies between the range).
	 * 2.start th loop from the given index till size-1.
	 * 3.do the left shifting till te size-1.
	 * 4.after left shifting decrease the size.
	 * T.C=O(n)
	 * S.C=O(1)
	*/
	if(index>=0 && index<size) {
		for(int i=index;i<size-1;i++) {
			array[index]=array[++index]; //array[i]=array[++i];?
			
		}
		size--;
	}
	
}
/*
 * 1.first validate the index range.
 * 2.if the index is valid then return the value on that index number.
 * 3.otherwise return -1.
 * T.C=O(1)
 * S.C=O(1)
 */
public int get(int index) {
	if(index>=0 && index<size) {
	return array[index];
	}
	return -1;
}
/*
 * T.C=O(1)
 */
public int size() {
	return size;
}
/*
 * T.C=O(n)
 * S.C=O(1)
 */
public void display() {
	for(int i=0;i<size;i++) {
		System.out.println(array[i]);
	}
}
public static void main(String[] args) {
	ArrayList list=new ArrayList();
	list.add(10);
	list.add(20);
	list.add(30);
	list.add(40);
	list.add(50);
	list.add(60);
	list.add(70);
	list.add(80);
	list.add(90);
	list.add(100);
	//list.add(110);
	list.display();
	System.out.println(list.size);
	//list.remove(3);
	//list.remove(5);
	//list.display();
	//System.out.println(list.size);
	System.out.println("-----------------");
//list.add(2,58);
list.display();
System.out.println(list.size);

}
}
