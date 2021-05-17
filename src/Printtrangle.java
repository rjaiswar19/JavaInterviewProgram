
public class Printtrangle {
	
	public static void main(String[] args)
	{
		int i,j,k,r;
		int n=4;
		for(i=0;i<=n;i++)		
		{
			for(j=n;j>i;j--)
			{
				System.out.print(" ");
			}
			
			for(k=0;k<=(2*i);k++)
			{
				System.out.print("*");
			}
			
			System.out.println();
		}
		
	}
}
