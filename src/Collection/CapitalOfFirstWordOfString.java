package Collection;

public class CapitalOfFirstWordOfString {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String s="my name is Ramashankar";
		String []str=s.split(" ");
		String cpstr="";
		for(String st:str)
		{
			char[] ch=st.toCharArray();
			for(int i=0;i<ch.length;i++)
			{
				if(i==0)
				{
					cpstr=cpstr+String.valueOf(ch[i]).toUpperCase();
				}
				else
				{
					cpstr=cpstr+ch[i];
				}
				
			}
			cpstr=cpstr+" ";
		}
		System.out.println(cpstr);

	}

}
