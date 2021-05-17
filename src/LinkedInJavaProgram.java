import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.HashMap;
import java.util.HashSet;
import java.util.List;

public class LinkedInJavaProgram {
	
	/*static void badMethod()
	{
		System.out.println("C");;
	}*/

	public static void main(String[] args) {
		
		List<Boolean> list=new ArrayList<>();
		list.add(true);
		list.add(Boolean.parseBoolean("False"));
		list.add(Boolean.TRUE);
		System.out.println(list.size());
		System.out.println(list.get(1) instanceof Boolean);
		
		
		
		/*boolean b="nifty" instanceof String;
		System.out.println(b);*/
		
		/*try{
			System.out.println("A");
			badMethod();
			System.out.println("B");
			
		}
		catch(Exception e)
		{
			System.out.println(e);
		}
		finally
		{
			System.out.println("D");
		}
		
		*/
		
		// TODO Auto-generated method stub
		
	/*	String []arr={"abc","1000","2","399"};
        List<String> list=Arrays.asList(arr);
        Collections.sort(list);
        System.out.println(list);
        //System.out.println(arr);
        System.out.println(Arrays.toString(arr));*/
		
		/*HashMap<String,Integer> pantry=new HashMap<>();
		
		pantry.put("Apples",3);
		pantry.put("Orages",2);
		
		int currentapple=pantry.get("Apples");
		pantry.put("Apples",currentapple+4);
		
		System.out.println(pantry.get("Apples"));
		*/
		
		//System.out.println("danana".compareTo("cpple"));
		
		
		//boolean b;
		//b=(0/5)?true:false;
		//b=Math.isDivisble(0,5);
		//(0%5)!=0;
		//System.out.println(b);
		
		/*String message="Hello";
		print(message);
		message+="World!";
		print(message);	
        String newmessage=message.substring(6,12)+message.substring(12, 6);
        System.out.println(newmessage);
		
		for(int i=0;i<message.length();i++)
		{
			System.out.println(message.charAt(i+1));
		}*/
        		
	}
	
	/*static void print(String message)
	{
		System.out.print(message);
		message+= " ";
	}*/

}
