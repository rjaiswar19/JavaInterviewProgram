import java.util.HashMap;
import java.util.Map;

public class CountOfStringUsingMap {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		/*HashMap<Character,Integer> hm=new HashMap<Character,Integer>();
		String s="nitin";
		char[]ch=s.toCharArray();
		for(int i=0;i<s.length();i++)
		{
			if(hm.containsKey(ch[i]))
			{
				hm.put(ch[i], hm.get(ch[i])+1);
						
			}
			else
			{
				hm.put(ch[i], 1);
			}
			
		}*/
		HashMap<String,Integer> hm=new HashMap<String,Integer>();
		String str="this is india india is best country in this world";
		String []st=str.split(" ");
		
		for(int i=0;i<st.length;i++)
		{
			if(hm.containsKey(st[i]))
			{
			hm.put(st[i], hm.get(st[i])+1);
			}
			else
			{
				hm.put(st[i], 1);
			}
		}
		
		for(Map.Entry<String, Integer> entry:hm.entrySet())
		{
			System.out.println(entry.getKey()+" the value is "+ entry.getValue());
		}
		

	}

}
