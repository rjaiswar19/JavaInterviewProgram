
public class AnagramProgram {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String str1="rama";
		String str2="maraa";
		
		char ch[]=str1.toCharArray();
		char ch1[]=str2.toCharArray();
		
		int no_of_char=256;
		int [] count=new int[no_of_char];
		int i;
		
		for(i=0;i<str1.length();i++)
		{
			count[ch[i]-'a']++;
			count[ch1[i]-'a']--;
		}
		
		if(str1.length() !=str2.length())
			System.out.println("it is not anagram");
		
		for(i=0;i<no_of_char;i++)
		{ 
			if(count[i] !=0)
			{
				System.out.println("it is not anagram number");
			}
			
		}
		

	}

}
