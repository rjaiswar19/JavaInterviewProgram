
public class CountOfDuplicateWord {

	public static void main(String[] args) {
		 String str="aaaabbbcc";
	       char []c=str.toCharArray();
	       int count=1;
	       for(int i=0;i<str.length();i++)
	       {
	    	   for(int j=i+1;j<str.length();j++)
	    	   {
	    		   if(c[i]==c[j])
	    		   {
	    			   count=count+1;
	    			   c[j]=0;
	    		   }
	    		   
	    	   }
	    	   if(c[i] !=0)
	    		   System.out.println(c[i] +"-----"+count);
	    		   count=1;
	    	   
	    	   
	       }
	       

	}

}
