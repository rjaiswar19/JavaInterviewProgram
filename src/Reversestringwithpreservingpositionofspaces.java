
public class Reversestringwithpreservingpositionofspaces {

	public static void main(String[] args) {
		String s="My name is rama";
		char[] ch=s.toCharArray();
		int r=ch.length-1,l=0;
		while(l < r)
		{
			   if (ch[l]==' ')
			   {
	                l++;
			   }
	            else if(ch[r]==' ')
	            {
	                r--;
	            }
	            else
	            {
	                char tmp = ch[l];
	                ch[l] = ch[r];
	                ch[r] = tmp;
	                l++;
	                r--;
	            }
	        }
	        
	        System.out.println(ch);
	      /*  String revStr = new String(charArray);
	        System.out.println("Output string: " + revStr);*/
			
		}

	

}
