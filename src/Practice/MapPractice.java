package Practice;

import java.util.HashMap;
import java.util.LinkedHashMap;
import java.util.Map;
import java.util.TreeMap;

public class MapPractice {
	public static void main(String arg[])
	{
		Map<Integer,String> m=new TreeMap<Integer,String>();
		m.put(1, "Mango");
		m.put(2,"Grapesh");
		m.put(2, "Banana");
		System.out.print(m);
	}

}
