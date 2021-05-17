package Practice;

import java.util.Scanner;

public class PrimeNumber {

	public static void main(String[] args) {
	            
		int n,i;
		Scanner sc=new Scanner(System.in);
		System.out.println("enter a number");
		n=sc.nextInt();
		if(n==1)
		{
			System.out.println("smallest prime number is 2");
		}
		for(i=2;i<n;i++)
		{
			if((n%i)==0)
			{
				System.out.print("it is not prime number");
				break;
			}
		}
		if(n==i)
		{
			System.out.print("it is prime number");
		}
	}

}
