import java.util.Stack;

public class ParenthesisPractice {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String str="{{}([])}}";
		Stack<Character> st=new Stack<>();
		int len=str.length();
		for(int i=0;i<len;i++)
		{
			if(str.charAt(i)=='{' || str.charAt(i)=='(' || str.charAt(i)=='[')
			{
				st.push(str.charAt(i));
			}
			else if (!st.empty() &&((str.charAt(i)=='}' && st.peek()=='{' )||
					(str.charAt(i)==']' && st.peek()=='[' )||
					(str.charAt(i)==')' && st.peek()=='(' )))
			{
				st.pop();
			}
			else
			{
				st.push(str.charAt(i));
			}
		}

		if(st.empty())
		{
			System.out.println("it is balanced");
		}
		else
		{
			System.out.println("it is not balanced");
		}
	}

}
