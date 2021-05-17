package Collection;

import java.util.ArrayList;
import java.util.Iterator;

public class ConvertArrayFromArrayToArrayList {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ArrayList<String> al=new ArrayList<String>();
		al.add("Apple");
		al.add("Grapes");
		al.add("Mango");
		al.add("Banana");
		
		
		System.out.println(al.contains("Mango"));
		if(al.contains("Mango"))
		{
			System.out.println("It is banana");
		}
		else
		{
			System.out.println("It is not banana");
		}
		/*String []arr=al.toArray(new String[al.size()]);
		for(String s:arr)
		{
			System.out.println(s);
		}*/
		/*for(int i=0;i<al.size();i++)
		{
			arr[i]=al.get(i);
		}
		
		for(String s:arr)
		{
			System.out.println(s);
		}*/
	}

}
