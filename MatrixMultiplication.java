package arrayDS;
/*
 * Q1.write a program of matrix addition.
 * Q2.write a program of matrix multiplication.
 * Q3.write a program of matrix substraction.
 * Given int[][]={
 * {1,2,3,4},{5,6,7,8},{9,10,11,12},{13,14,15,16}
 * }
 * Q4.print the elements in snake pattern---->4,3,2,1..5,6,7,8...12,11,10,9..13,14,15,16
 * Q5.print all the elements 1->16.
 * Q6.print elements using boundary traversal--->1,2,3,4,8,12,16,15,14,113,9,5
 * Q7.print all the elements in spiral form--->1,2,3,4,8,12,16,15,14,13,9,5,6,7,11,10
 * Q8.
 * Q9.
 * Q10.
*/
public class MatrixMultiplication {
	
public static void addMatrix(int array1[][],int array2[][]) {
		for(int i=0;i<array1.length;i++) {
		for(int j=0;j<array2.length;j++) {
			int array3[][]=new int[i][j];
      array3[i][j]=array1[i][j]+array2[i][j];
		}
	}
		
}
public static void addSubtraction(int a1[][],int a2[][]) {
	for(int i=0;i<a1.length;i++) {
	for(int j=0;j<a2.length;j++) {
		int a3[][]=new int[i][j];
      a3[i][j]=a1[i][j]-a2[i][j];
	}
}
}
public static void addMultplication(int a1[][],int a2[][]) {
	for(int i=0;i<a1.length;i++) {
	for(int j=0;j<a2.length;j++) {
		int a3[][]=new int[i][j];
      a3[i][j]=a1[i][j]*a2[i][j];
	}
}
}
public static void traversal() {
	int b[]= {1,2,3,4,8,12,16,15,14,113,9,5};
	
}
//print the elements in snake pattern---->4,3,2,1..5,6,7,8...12,11,10,9..13,14,15,16
public static void snakePattern() {
	
}

public static void main(String[] args) {
	

	int[][] a= {{1,2,3,4},{5,6,7,8},{9,10,11,12},{13,14,15,16}};
	for(int k=0;k<a.length;k++) {
		for(int l=0;l<a[k].length;l++) {
			System.out.println(a[k][l]);
		}
		
	}
}


}












