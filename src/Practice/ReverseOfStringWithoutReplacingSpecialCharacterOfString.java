package Practice;

public class ReverseOfStringWithoutReplacingSpecialCharacterOfString {

	public static void main(String[] args) {
              String st="My@Name*is$Rama";
              char []ch=st.toCharArray();
              int l=ch.length-1, r=0;
              while(l>r)
              {
            	  if(!Character.isAlphabetic(ch[l]))
            		  l--;
            	  else if(!Character.isAlphabetic(ch[r]))
            		  r++;
            	  else
            	  {
            		  char temp=ch[l];
            		  ch[l]=ch[r];
            		  ch[r]=temp;
            		  l--;
            		  r++;
            	  }
            		  
              }
        	  System.out.println(ch);  

	}

}
