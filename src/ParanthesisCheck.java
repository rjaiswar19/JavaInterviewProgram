import java.util.Stack;

public class ParanthesisCheck {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		/*String par="{()}[]";
		Stack<Character> ch=new Stack<>();
		
		for(int i=0;i<par.length();i++)
		{
			if(par.charAt(i)=='{' || par.charAt(i)=='[' || par.charAt(i)=='(')
			{
				ch.push(par.charAt(i));
			}
			else if(!ch.empty()&&(
					(par.charAt(i)=='[' && ch.peek()==']')||
			        (par.charAt(i)=='(' && ch.peek()==')')||
                    (par.charAt(i)=='{' && ch.peek()=='}')))
					{
							ch.pop();
					}
			else
			{
				ch.push(par.charAt(i));
			}
		}
		
		if(ch.isEmpty())
		{
			System.out.println("balanced");
		}
		else
		{
			System.out.println("it is not balanced");
		}
		*/	
		String str = "{()}}[]";
		//Declare a stack
		Stack<Character> st = new Stack<>();
		//Traverse a string
		for(int i = 0; i < str.length(); i++) {
		/* If the current character is starting bracket,
		then push them in a stack
		*/
		if(str.charAt(i) == '{' || str.charAt(i) == '[' || str.charAt(i) == '(') {
		st.push(str.charAt(i));
		/* 
		Else, If the stack is not empty,
		And current character is a closing bracket
		and top character of a stack is matching open bracket
		then pop it.
		*/
		} else if ( !st.empty() && ((str.charAt(i) == ']' && st.peek() == '[') || 
		(str.charAt(i) == '}' && st.peek() == '{') ||
		(str.charAt(i) == ')' && st.peek() == '('))) {
		st.pop();
		} else {
		st.push(str.charAt(i));
		}
		}
		if(st.empty()) {
		System.out.println("Balanced");
		} else {
		System.out.println("Not balanced");

		}

	}

}
