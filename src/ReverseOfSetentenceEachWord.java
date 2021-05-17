
public class ReverseOfSetentenceEachWord {

	public static void main(String[] args) {
		String str="i name is Rama";
		String revstr=" ";
		String []st=str.split(" ");
		for(String s:st)
		{
			int lnth=s.length();
			for(int i=lnth-1;i>=0;i--)
			{
				revstr=revstr+s.charAt(i);
			}
			revstr+=" "; 
		}
	    System.out.println(revstr.trim());
	}

}
