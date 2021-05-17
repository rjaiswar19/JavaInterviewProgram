package Collection;

import java.util.ArrayList;
import java.util.Iterator;



public class ArrayListProgramToTraverseArray {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ArrayList<String> al=new ArrayList<String>();
		al.add("Australia");
		al.add("India");
		al.add("Germany");
		al.add("England");
		al.add("America");
		al.add("Canada");
		al.add("Germany");
		
		/*Iterator it=al.iterator();
		while(it.hasNext())
		{
			System.out.println(it.next());
		}
		*/
		for(String a:al)
		{
			System.out.println(a);
		}
		

	}

}
