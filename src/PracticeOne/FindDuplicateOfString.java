package PracticeOne;

public class FindDuplicateOfString {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
    int arr2[]={11,7,10,5,2,14,1,50,30};
    int arr1[]={50,10,2,30,200};
    int m=arr1.length;
    int n=arr2.length;
    
    for(int i=0;i<m;i++)
    {
    	for(int j=0;j<n;j++)
    	{
    		if(arr1[i]==arr2[j])
    		    break;
    		
    		if(j==n)
    			System.out.println("it is not subset");
    		
    	}
    	
    }
  System.out.println("it is subset" + arr2 + "   of  "+arr1);
	}

}
