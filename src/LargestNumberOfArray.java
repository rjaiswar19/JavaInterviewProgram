
public class LargestNumberOfArray {

	public static void main(String[] args) {
		int arr[]={23,324,9809,45,90,};
		int i=1;
		int max=arr[0];
		
		for(i=1;i<arr.length;i++)
		{
			if(arr[i]>max)
			{
				max=arr[i];
			}
		}
		
		System.out.println(max);

	}

}
