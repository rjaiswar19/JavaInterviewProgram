package Practice;

import java.util.Scanner;

public class Printstar1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Scanner sc=new Scanner(System.in);
		System.out.println("Please enter a string");
		int n=sc.nextInt();
		
		for(int i=0;i<n;i++)
		{
			for(int j=n;j>i;j--)
			{
				System.out.print(" ");
			}
			for(int k=0;k<=(2*i);k++)
			{
				System.out.print("*");
			}
 				
			System.out.println();
		}

	}

}
