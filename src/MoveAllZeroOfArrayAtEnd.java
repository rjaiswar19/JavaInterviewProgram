
public class MoveAllZeroOfArrayAtEnd {

	public static void main(String[] args) {
	       int arr[]={2,5,6,0,23,0,5,6,0};
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
	       
	       //System.out.println(arr);
	       
	       for(int i=0;i<n;i++)
	       {
	       System.out.println(arr[i]);
	       }
	}

}
