import java.util.HashMap;
import java.util.Map;

public class CountOfDuplicate {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String str="Rama is my name name is rama rama";
		String []st=str.split(" ");
		HashMap <String,Integer> hm=new HashMap <String,Integer>();
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
		
		for(Map.Entry<String,Integer> entry:hm.entrySet())
		{
			System.out.println(entry.getKey()+" the count is " + entry.getValue());
		}
	}

}
