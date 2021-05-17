import java.util.Scanner;

public class SortingOfArray {

	public static void main(String[] args) {
	
		int i,j;
		int num[]=new int[5];
		Scanner sc=new Scanner(System.in);
		System.out.println("please enter 5 integer");
		for(i=0;i<5;i++)
		{
			num[i]=sc.nextInt();
		}
		for(i=0;i<5;i++)
		{
			for(j=i+1;j<5;j++)
			{
				if(num[i]>num[j])
				{
					int temp=num[i];
					num[i]=num[j];
					num[j]=temp;
				}
			}
		}
			
		for(int x:num)
		{
			System.out.println(x);
		}
sc.close();
	}

}
