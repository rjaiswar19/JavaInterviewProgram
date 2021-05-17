
public class Palindrometring 
{

	public static void main(String[] args) 
	{
		String str="madam";
		String palindromstr="";
		String s=str;
		for(int i=str.length()-1;i>=0;i--)
		{
			palindromstr=palindromstr+str.charAt(i);
		}
		System.out.println(s.toString());
		if(palindromstr.equals(s))
		{
			System.out.println("it is Palindrome");
		}
		else
		{
			System.out.println("it is not Palindrome");
		}
	}
	

}
