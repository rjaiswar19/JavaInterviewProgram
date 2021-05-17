package Collection;

import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import java.util.Map.Entry;
import java.util.Set;

public class IteratingHashMapwithentrySet {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		HashMap<Integer,String> st=new HashMap<Integer,String>();
		st.put(1, "Red");
		st.put(2, "White");
		st.put(3, "Black");
		st.put(4, "Green");
		st.put(5, "Yellow");
		st.put(6, "Blue");
		
		Set<Map.Entry<Integer,String>> entrySet=st.entrySet();
		Iterator<Map.Entry<Integer, String>> it=entrySet.iterator();
		
		while(it.hasNext())
		{
			Map.Entry entry=it.next();
			System.out.println("Key "+ entry.getKey()+" value "+entry.getValue());
		}
		

	}

}
