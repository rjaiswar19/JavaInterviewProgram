
public class MoveAllZeroAtTheEnd {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
       int arr[]={10,3,4,0,10,2,14,0,4,0};
       int count=0;
       int l=arr.length;
       
       for(int i=0;i<arr.length;i++)
       {
    	   if(arr[i]!=0)
    	   {
    		   arr[count++]=arr[i];
    	   }
       }
       
       while(count<l)
       {
    	   arr[count++]=0;
       }
       
       for(int i=0;i<l;i++)
       {
    	   System.out.println(arr[i]);
       }
	}

}
