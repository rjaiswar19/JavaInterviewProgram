
public class ReverseOfSentence {

	public static void main(String[] args) {
	     String str="i love my india";
	     String revstr="";
	     char ch[]=str.toCharArray();
	     for(int i=str.length()-1;i>=0;i--)
	     {
	    	 //revstr=revstr+str.charAt(i);
	    	 revstr=revstr+ch[i];
	     }
         System.out.println(revstr);
	}

}
