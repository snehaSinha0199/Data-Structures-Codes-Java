package sorting;

public class BubbleSort {
public int[] bubbleSort(int arr[]) {
for(int i=0;i<arr.length;i++) {
   for(int j=0;j<=i;j++) {
	   if(arr[i]<arr[j]) {
	   int temp=arr[j];
	   arr[j]=arr[i];
	  arr[i]=temp;
	   }
	      }	
}
return arr;
}

public void display() {
	
}

	

public static void main(String[] args) {
	BubbleSort sort=new BubbleSort();
int arr[]= {10,5,4,20,30,40};
int[] result=sort.bubbleSort(arr);
	for(int i:result) {
		System.out.println(i+" ");
	}
}

}

