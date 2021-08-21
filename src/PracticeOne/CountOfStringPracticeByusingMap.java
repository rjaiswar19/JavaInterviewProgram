package PracticeOne;

import java.util.HashMap;
import java.util.Map;

public class CountOfStringPracticeByusingMap {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Map<String,Integer> hm=new HashMap<String,Integer>();
		String s="My name is Ramashankar Jaiswr this is software engineer for is the profile";
		String[] st=s.split(" ");
		for(String st1:st)
		{
			if(hm.containsKey(st1))
			{
			   hm.put(st1,hm.get(st1)+1);
			}
			else
			{
				hm.put(st1, 1);
			}
		}
		System.out.println(hm);
		
		for(Map.Entry<String,Integer> entry:hm.entrySet())
		{
			System.out.println(entry.getKey() + "  count of string " +entry.getValue());
		}
	}

}
