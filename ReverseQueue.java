package queue;

import java.util.ArrayList;
import java.util.List;

public class ReverseQueue {
public static void main(String[] args) {
	int [] values=new int[3];
	values[0]=10;
	values[1]=new Integer(5);
	values[2]=15;
	for(int i=1;i<values.length;i++) {
		System.out.println(values[i]-values[i-1]);
		int[] array= {6,9,8};
		List<Integer> list=new ArrayList<>();
		list.add(array[0]);
		list.add(array[2]);
		list.set(1,array[1]);
		list.remove(0);
		System.out.println(list);
	}
}
}
