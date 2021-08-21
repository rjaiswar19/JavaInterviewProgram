
public class SumOfArrayExcludingElementliebetweennumber {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		int[] arr={2,-1,6,9,11};
		int len=arr.length;
		int sum=0;
		for(int i=0;i<len;i++)
		{
			if(arr[i]<6 || arr[i]>9)
			{
				sum=sum+arr[i];
			}
			
		}
		System.out.println(sum);
	}

}
