package Collection;

import java.util.HashMap;
import java.util.Map;

public class CountOfDuplicateCharInString {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String s="aabbbaaab";
		//String s="Ramashankar Jaiswar Jaiswar Ramashankar Ghatkopar";
		Map<Character,Integer> map=new HashMap<Character,Integer>();
		//Map<String,Integer> map=new HashMap<String,Integer>();
		
		char ch[]=s.toCharArray();
		//String[] str=s.split(" ");
		
		for(char c:ch)
		{
			if(map.containsKey(c))
			{
				map.put(c, map.get(c)+1);
			}
			else
			{
				map.put(c, 1);
			}
		}
		
		/*for(String st:str)
		{
			if(map.containsKey(st))
			{
				map.put(st, map.get(st)+1);
			
			}
			else
			{
				map.put(st, 1);
			}
			
		}*/
		
		for(Map.Entry<Character, Integer> entry:map.entrySet())
		{
			System.out.println(entry.getKey()+"  :  "+entry.getValue() );
		}
		

	}

}
