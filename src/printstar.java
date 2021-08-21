import java.util.Scanner;

public class printstar {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc=new Scanner(System.in);
		System.out.println("Please enter star lenght");
		int starsize=sc.nextInt();
		for(int i=0;i<starsize;i++)
		{
			for(int j=starsize;j>i;j--)
			{
				System.out.print(" ");
			}
			for(int k=0;k<=(i*2);k++)
			{
				System.out.print("*");
			}
			System.out.println();
		}

	}

}
