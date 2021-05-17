package Practice;

public class CountDuplicateWords {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
        String str="my is name is is rama my my is rama";
        String[] s=str.split(" ");
        int count=1;
        for(int i=0;i<s.length;i++)
        {
        	for(int j=i+1;j<s.length;j++)
        	{
        		if(s[i].equals(s[j]))
        		{
        			count=count+1;
        			s[j]="0";
        			
        		}
        	}
        	if(s[i] !="0")
        	System.out.println(s[i]+"---------" +count);
        	count=1;
        }
	}

}
