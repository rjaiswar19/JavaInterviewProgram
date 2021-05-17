
public class PrintTriangle {

	public static void main(String[] args) 
	{
		int size = 4;
		int i, j, k;
		for (i = 0; i <=size; i++) 
		{
			for (j = size; j > i; j--) 
			{
				System.out.print(" ");
			}
			for (k = 0; k <= (2 * i); k++) 
			{
				System.out.print("*");
			}
			System.out.println();
		}

	}

}
