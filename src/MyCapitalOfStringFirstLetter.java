
public class MyCapitalOfStringFirstLetter {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String str="my name is rama";
		String capstr="";
		char ch[]=str.toCharArray();
		int count=0;
		int lenth=ch.length;
		for(int i=0;i<lenth;i++)
		{
			if(i==0)
			{
				capstr=capstr+String.valueOf(ch[i]).toUpperCase();
			}
			else
			{
				if(ch[i]==' ')
				{
					capstr=capstr+ch[i];
					count++;
				}
				else
				{
					if(!(count==0))
					{
						capstr=capstr+String.valueOf(ch[i]).toUpperCase();
						count=0;
					}
					else
					{
						capstr=capstr+ch[i];
					}
				}
			}
				
		}
		System.out.println(capstr);

	}

}
