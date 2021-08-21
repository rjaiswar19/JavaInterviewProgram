
public class SecondLargestElementInArray {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int arr[]={10,2,5,17,1,20,45};
		int firstlar=arr[0];
		int seclar=arr[0];
		for(int i=0;i<arr.length;i++)
		{
			if(arr[i]>firstlar)
			{
				seclar=firstlar;
				firstlar=arr[i];
			}
		}
     System.out.println(seclar);
     System.out.println(firstlar);
	}

}
