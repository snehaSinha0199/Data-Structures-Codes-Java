package arrayDS;
/*
 * Q1.write a program of odd number.
 * Q2.write a program of even number.
 * Q3.swap two numbers without using a third variable.
 * Q4.Add all the digits of a given number without using String.
 * Q5.find length of a given number.
 * Q6.write a program of a prime number.
 * Q7.write a program of factorial(using with and without recursive).
 * Q8.write a program of a fibnnocci number.
 * Q9.write a program GCF.
 * Q10.write a program of LCF.
 */
public class NumberSystem {
	public static void fibonacci(int n) {
		for(int i=0;i<=n;i++) {
			
			
		}
	}
	public static void greatestCommonFactor(int a,int b) {
		int gcd=1;
		for(int i=1;i<=a&&i<=b;i++) {
			if(a%i==0 && b%i==0) {
				 gcd=i;
			}
			System.out.println("GreatestCommonFactor of x & y is :"+gcd);
		}
			
		
	}
	

	public static void oddNumber(int a) {
				if(a%2==1) {
			System.out.println("the number is odd");
			
		}
				else
				{
					
				}
			
	}
	public static void evenNumber(int a1) {
		if(a1%2==0) {
			System.out.println("the number is even");
			
		}
	}
	//swap two numbers without using a third variable.
	public static void swapping(int a2,int a3) {
		a2=a2+a3;
		a3=a2-a3;
		a2=a2-a3;
		System.out.println(a2);
		System.out.println(a3);
		
	} 
	public static int prime(int b) {
		if(b==0||b==1) {
		return b;	
		}
		else {
			if(b%2==0) {
				System.out.println();
			}
			return b;
			
		}
	}
	public int factorial(int n) {
		int result;
		if(n==1) {
			return 1;
		}
		result=factorial(n-1)*n;
		return result;
	}
	
	
	public static void main(String[] args) {
		NumberSystem ns=new NumberSystem();
		//n.swapping(10, 20);
	int s=ns.factorial(5);
	System.out.println(s);
 int prime = ns.prime(15);
	System.out.println(prime);
	ns.greatestCommonFactor(12, 20);
	
		
	}

}
