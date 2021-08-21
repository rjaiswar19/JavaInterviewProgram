
public class CapitalOfFirstLetterOfStringPractice {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String str="my name is ramashankar";
		char st[]=str.toCharArray();
		int count=0;
		String capstr="";
		for(int i=0;i<str.length();i++)
		{
			if(i==0)
			{
				capstr=capstr+String.valueOf(st[i]).toUpperCase();
			}
			else
			{
				if(st[i]==' ')
				{
					capstr=capstr+st[i];
					count=count+1;
				}
				else
				{
					if(count!=0)
					{
						capstr=capstr+String.valueOf(st[i]).toUpperCase();
						count=0;
					}
					else
					{
					capstr=capstr+st[i];
					}
				}
			}
			
		}
		System.out.println(capstr);

	}

}
