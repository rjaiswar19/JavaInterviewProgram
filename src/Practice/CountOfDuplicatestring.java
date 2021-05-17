package Practice;

public class CountOfDuplicatestring {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
       String st="i love india india is my love i i i my my my my my is is is is is is is is is is is";
       String str[]=st.split(" ");
       int count=1;
       int lenofstr=str.length;
       
       for(int i =0; i<lenofstr;i++)
       {
    	   for(int j=i+1;j<lenofstr;j++)
    	   {
    		   if(str[i].equals(str[j]))
    		   {
    			   count=count+1;
    			   str[j]="";
    		   }
    	   }
    	  if(!str[i].equals(""))
    		   System.out.println(str[i]+"....."+count);
    	       count=1;
       }
       
	}

}
