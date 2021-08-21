
public class ReverseOfStringWithoutAffectingSpecialCharacter {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String str="my@#name*&^i(s!!r@m#a$m%a";
		char []ch=str.toCharArray();
		int l=ch.length-1,r=0;
		while(l>r)
		{
			if(!Character.isAlphabetic(ch[l]))
				l--;
			else if(!Character.isAlphabetic(ch[r]))
				r++;
			else
			{
				char temp=ch[l];
				ch[l]=ch[r];
				ch[r]=temp;
				l--;
				r++;
			}
		}
  System.out.println(ch);
	}

}
