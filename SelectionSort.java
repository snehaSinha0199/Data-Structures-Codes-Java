package sorting;
/*
 * 1.Find the minimum value in the List
 * 2.Swap it with the value in the current position
 * 3.Repeat this process for all the elements untill the array is sorted
 */
public class SelectionSort {
public int[] selectionSort(int[] arr) {
for(int i=0;i<arr.length-1;i++) {
	int min=i;
	for(int j=i+1;j<arr.length;j++) {
		if(arr[min]>arr[j]) {
			min=j;
	
		}
	}
	//swaping
	int temp=arr[min];
	arr[min]=arr[i];
	arr[i]=temp;
}
	
	return arr;	
}//2 1  7 8 14 how 1 and 2 will be swapped 
public static void main(String[] args) {
	SelectionSort sort=new SelectionSort();
	int arr[]= {14,7,8,1,2};
	int[] result=sort.selectionSort(arr);
	for(int a:result) {
		System.out.println(a);
	}
}
}
