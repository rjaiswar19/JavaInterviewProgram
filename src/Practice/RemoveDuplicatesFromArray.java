package Practice;

import java.util.Iterator;
import java.util.Set;
import java.util.TreeSet;

public class RemoveDuplicatesFromArray {

	public static void main(String[] args) {
		int[] arr={10,9,10,1,2,1,2};
		Set<Integer> set=new TreeSet<Integer>();
		for(int i=0;i< arr.length;i++)
		{
			set.add(arr[i]);
		}
		Iterator it=set.iterator();
		while(it.hasNext())
		{
		    System.out.println(it.next());
		}
	}
}
