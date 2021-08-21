
public class CountOfWord {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String s="my name is ramashankar jaiswar is name is name name name";
		String []str=s.split(" ");
		int count=1;
		for(int i=0;i<str.length;i++)
		{
			for(int j=i+1;j<str.length;j++)
			{
				if(str[i].equals(str[j]))
						{
							count=count+1;
							str[j]="0";
						}
			}
			if(str[i]!="0")
			System.out.println(str[i]+" count is "+ count);
			count=1;
		}

	}

}
