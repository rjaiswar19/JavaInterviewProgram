
public class SortingOfArrayPractice {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//int arr[]={1,20,4,6,19,50,8,2};
		int arr[]={2,5,6,0,23,0,5,6,0};
		int len=arr.length;
		for(int i=0;i<len;i++)
		{
			for(int j=i+1;j<len;j++)
			{
				if(arr[j]>0)
				{
					int temp=arr[i];
					arr[i]=arr[j];
					arr[j]=temp;
				}
				
			}
		}
		 for(int i=0;i<len;i++)
	       {
	       System.out.println(arr[i]);
	       }
	}

}
