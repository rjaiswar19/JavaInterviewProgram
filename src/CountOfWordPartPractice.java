
public class CountOfWordPartPractice {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		String s="my name is java java is my,i am from germany";
		String cs=s.replace(",", " ");
		String []str1=s.split(",");
		String []str=cs.split("\\s");
		for(String st:str)
		{
			System.out.println(st);
		}
		
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
				System.out.println(str[i]+" count is "+count);
			count=1;
			
		}
		

	}

}
