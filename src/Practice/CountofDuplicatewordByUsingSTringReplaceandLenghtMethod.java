package Practice;

public class CountofDuplicatewordByUsingSTringReplaceandLenghtMethod {
	public static void main(String[] args) {
		 String word = "ramashankar";
		 char[] ch=word. toCharArray();
		 /*for(int i=0;i<ch.length;i++)
		 {
			 
		 }
	*/	 while(ch.length>0)
		 {
			 int count = word.length() - word.replace("ch[0]", "").length();
		        System.out.println(count);
		 }
	        //System.out.println(word.length());
	       // System.out.println(word.replace("r", "").length());
	        int a_counter = word.length() - word.replace("r", "").length();
	        System.out.println(a_counter);
	       // System.out.println(word.length());
	        //System.out.println(word.replace("a", "").length());
	        int r_counter = word.length() - word.replace("a", "").length();
	        System.out.println(r_counter);
	        //System.out.println(word.replace("m", "").length());
	        int m_counter = word.length() - word.replace("m", "").length();
	        System.out.println(m_counter);
	        //System.out.println(word.length());
	        //System.out.println(word.replace("s", "").length());
	        int s_counter = word.length() - word.replace("s", "").length();
	        System.out.println(s_counter);
	}

}
