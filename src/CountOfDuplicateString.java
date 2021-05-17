public class CountOfDuplicateString {

	public static void main(String[] args) {
		String str="my name is rama rama my name to to to";
		int count=1;
		String []st=str.split(" ");
		for(int i=0;i<st.length;i++)
		{
			for(int j=i+1;j<st.length;j++)
			{
				if(st[i].equals(st[j]))
				{
					count=count+1;
					st[j]="0";
					
				}
			}
			if(st[i]!="0")
			System.out.println(st[i]+"-----"+ count );
			count=1;
					
			
		}

	}

}
