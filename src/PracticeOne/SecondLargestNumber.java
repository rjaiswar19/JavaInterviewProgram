package PracticeOne;

public class SecondLargestNumber {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
       int [] numarr= {12,1,20,120,8};
       int len=numarr.length-1;
       for(int i=0;i<numarr.length;i++)
       {
    	   for(int j=i+1;j<numarr.length;j++)
    	   {
    		   if(numarr[i]>numarr[j])
    		   {
    		   int temp=numarr[i];
    		   numarr[i]=numarr[j];
    		   numarr[j]=temp;
    		   }	
	       }
       }
       
       System.out.println("Second highest number is" +numarr[(len-1)]);
       for(int n:numarr)
       {
    	   System.out.println(n);
       }
	}
       
}
