package Collection;

import java.util.HashMap;
import java.util.Iterator;
import java.util.Set;

public class InializeHashMap {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
      HashMap<Integer,String> hm=new HashMap<Integer,String>();
      hm.put(1, "Java");
      hm.put(2, "Python");
      hm.put(3, "C#");
      hm.put(4, "dotnet");
      
      Set<Integer> set=hm.keySet();
      Iterator<Integer> it=set.iterator();
      while(it.hasNext())
      {
    	  int key=it.next();
    	  System.out.println(key+" the value is "+hm.get(key));
    	  
      }

      
	}

}
