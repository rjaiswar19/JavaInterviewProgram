

public class ReverseOfStrinwithoutAffectingSpecialCharacterposition {
	public static void main(String[] args) 
	{
            String str = "abc@ert$hr";
            System.out.println("inputstream string: " + str);
            char[] charArray = str.toCharArray();
	        int r = charArray.length-1, l = 0;
	        while (l < r)
	        {
	            if (!Character.isAlphabetic(charArray[l]))
	                l++;
	            else if(!Character.isAlphabetic(charArray[r]))
	                r--;
	            else
	            {
	                char tmp = charArray[l];
	                charArray[l] = charArray[r];
	                charArray[r] = tmp;
	                l++;
	                r--;
	            }
	        }
	        
	        System.out.println(charArray);
	      /*  String revStr = new String(charArray);
	        System.out.println("Output string: " + revStr);*/
	    }
	}