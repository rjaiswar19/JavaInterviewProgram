package Practice;

public class CountOfDuplicate {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
      String str="my name is name rama rama";
      String[] s=str.split(" ");
      int len=s.length;
      int count=1;
      for(int i=0;i<len;i++)
      {
    	  for(int j=i+1;j<len;j++)
    	  {
    		  if(s[i].equals(s[j]))
    		  {
    			 count=count+1;
    			 s[j]="0";
    		  }
    	  }
    	  if(s[i]!="0")
    		  System.out.println(s[i]+"--------"+count);
    	  count=1;
      }
	}

}
