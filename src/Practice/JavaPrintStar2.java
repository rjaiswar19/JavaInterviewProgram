package Practice;

import java.util.Scanner;

public class JavaPrintStar2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
       
		Scanner sc=new Scanner(System.in);
		System.out.println("please enetr a integer");
		int n=sc.nextInt();
		for(int i=0;i<n;i++)
		{
			for(int j=n;j>i;j--)
			{
				System.out.print("*");
			}
			System.out.println("");
		}
	}

}
