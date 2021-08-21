package PracticeOne;

public class LargestwordFromString {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		String s="my ramashankar name is maharashtraaaa";
		String st[]=s.split(" ");
		String longeststring=st[0];
		for(int i=0;i<st.length;i++)
		{			if(st[i].length()>longeststring.length())
					{
			            longeststring=st[i];
		
					}
		
	    }
		System.out.println(longeststring);
}
}