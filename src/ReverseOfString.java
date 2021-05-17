
public class ReverseOfString {

	public static void main(String[] args) {
		String str="Rama";
		String revstr="";
		char []ch=str.toCharArray();
		for(int i=str.length()-1;i>=0;i--)
		{
			revstr=revstr+ch[i];
			
		}
	    System.out.println(revstr);	

	} 	

}
