package Practice;

public class reverseofstringwithspecialcharacter {

	public static void main(String arg[])
	{
		String str="sabc$tr@rrrt";
		char strarr[]=str.toCharArray();
		int l=str.length()-1;
		int r=0;
		while(l>r)
		{
			if(!Character.isAlphabetic(strarr[l]))
				l--;
			if(!Character.isAlphabetic(strarr[r]))
				r++;
			else
			{
				char temp=strarr[l];
				strarr[l]=strarr[r];
				strarr[r]=temp;
				l--;
				r++;
			}
		}
		System.out.println(strarr);
	}
}
