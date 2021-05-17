
public class MoveAllZeroOfArrayAtEnd {

	public static void main(String[] args) {
	       int arr[]={1,2,0,4,0,0,5};
	       int count=0;
	       int n=arr.length;
	       for(int i=0;i<arr.length;i++)
	       {
	    	   if(arr[i]!=0)
	    	   {
	    		   arr[count++]=arr[i];
	    	   }
	       }
           
	       while(count<n)
	       {
	    	   arr[count++]=0;
	       }
	       
	       for(int i=0;i<n;i++)
	       {
	       System.out.println(arr[i]);
	       }
	}

}
