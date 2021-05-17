
public class CapitalOfString {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
        String capstr="";
		String s = "my name is rama";
		String[] allword = s.split(" ");
		for (String s1 : allword)
		{
			char ch[]=s1.toCharArray();
			for (int i = 0; i < ch.length; i++) 
			{
				if(i==0)
				{
					capstr = capstr + String.valueOf(ch[i]).toUpperCase();
				}
				else
				{
					capstr=capstr+ch[i];
				}
				
			}
			capstr=capstr+" ";
		}
		System.out.println(capstr);
	}

}
