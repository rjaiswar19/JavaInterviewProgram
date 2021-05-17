package PracticeOne;

public class SwapofNumberWithouttochingSpecialCharacter {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		String s="Ram@@a$shan&&ka*r";
		char ch[]=s.toCharArray();
		int l=ch.length-1;
		int r=0;
		while(l>r)
		{
			if(!Character.isAlphabetic(ch[r]))
			{
				r++;
			}
			else if(!Character.isAlphabetic(ch[l]))
			{
				l--;
			}
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
