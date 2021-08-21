
public class bitonicArrays {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		int arr[]={12,24,50,12,5,1};
		int len=arr.length;
		int i,j;
		for(i=1;i<len;i++)
		{
			if(arr[i]>arr[i-1])
				continue;
			if(arr[i]<arr[i-1])
				break;
		}
		if(i==len-1)
		{
			System.out.println("it is bitonic");
		}
		
		for(j=i+1;j<len;j++)
		{
			if(arr[j]<arr[j-1])
				continue;
			if(arr[j]>=arr[j-1])
				break;
		}
		i=j;
		if(i!=len)
		{
			System.out.println("it is not balanced");
		}
		else
		{
			System.out.println("it is balanced");
		}

	}

}
