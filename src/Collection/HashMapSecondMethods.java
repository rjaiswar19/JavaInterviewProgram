package Collection;

import java.io.ObjectOutputStream.PutField;
import java.util.HashMap;
import java.util.Map;

public class HashMapSecondMethods {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		HashMap<Integer,String> hm=new HashMap<Integer,String>();
		hm.put(1, "Ghakopr");
		hm.put(2, "Vikroli");
		hm.put(3, "Chembur");
		hm.put(4, "Sion");
		hm.put(5, "Dadar");
		
		for(Map.Entry<Integer,String> mpe:hm.entrySet())
		{
			System.out.println(mpe.getKey()+"----"+mpe.getValue());
		}
	}

}
