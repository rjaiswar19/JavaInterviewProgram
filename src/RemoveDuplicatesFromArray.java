import java.util.HashSet;
import java.util.Iterator;
import java.util.LinkedHashSet;
import java.util.Set;
import java.util.TreeSet;

public class RemoveDuplicatesFromArray {

	public static void main(String[] args) {
		
		int arr[]={0,105,105,0,104,103,102,101};
        int end = arr.length;
        Set<Integer> set = new TreeSet<Integer>();

        for (int i = 0; i < end; i++) 
        {
            set.add(arr[i]);
        }
        Iterator it = set.iterator();
        while (it.hasNext()) 
        {
            System.out.println(it.next());
        }
    }

}
