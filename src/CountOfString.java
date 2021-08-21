
public class CountOfString {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		String s="my name is ramashankar Jaiswar is my name ramesh is rama";
		String []st=s.split(" ");
		int count =1;
		for(int i=0;i<st.length;i++)
		{
			for(int j=i+1;j<st.length;j++)
			{
				if(st[i].equals(st[j]))
				{
					st[j]="";
					count=count+1;
				}
			}
			if(st[i]!="")
			System.out.println(st[i] + " count is " +count);
			count=1;
			
		}

	}

}
