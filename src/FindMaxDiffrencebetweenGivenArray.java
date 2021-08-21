
public class FindMaxDiffrencebetweenGivenArray {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		//int arr[] = { 1, 10, 3, 4, 9 };
		int arr[]={1, 1,-7, 5, 5};
		int len = arr.length;
		
		int diff = 0;
		int deffcom = 0;
		
		for (int i = 0; i < len - 1; i++) 
		{
			if (arr[i] < arr[i + 1]) 
			{
				diff = arr[i + 1] - arr[i];
				{
					if (diff > deffcom) 
					{
						deffcom = diff;

					}
				}
			}
		}

		System.out.println(deffcom);

	}

}
