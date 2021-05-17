package Collection;

import java.util.HashSet;
import java.util.Iterator;

public class HashSetIteration {

	public static  void main(String[] args) {
		// TODO Auto-generated method stub
		HashSet<String> hs=new HashSet<String>();
		hs.add("Rama");
//		hs.add("Manoj");
		hs.add("Rakesh");
		hs.add("Subu");
		hs.add("Abhash");
		
		Iterator it=hs.iterator();
		while(it.hasNext())
		{
			System.out.println(it.next());
			
		}

	}

}
