
public class BitonicArray {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int arr[]={-3,9,17,20,17,5,1};
		int n=arr.length;
		
		int i,j;
		
		for(i=1;i<n;i++)
		{
			if(arr[i]>arr[i-1])
				continue;
			if(arr[i]<arr[i-1])
				break;
			
		}
		if(i==n-1)
			System.out.println("it is bitonic");
		
		for(j=i+1;j<n;j++)
		{
			if(arr[j]<arr[j-1])
				continue;
			if(arr[i]>=arr[j-1])
             break;
		}
		
		i=j;
		if(i!=n)
		{
			System.out.println("it is not bitonic");
		}
		else
		{
			System.out.println("it is  bitonic");
		}
	}

}
