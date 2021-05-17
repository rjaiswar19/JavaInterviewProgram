
public class CapitalOfFirstLetterOfString {

	public static void main(String[] args) {
    String str="my name is rama";
    String capstr="";
    int count=0;
    char []ch=str.toCharArray();
    for(int i=0;i<str.length();i++)
    {
    	if(i==0)
    	{
    		capstr=capstr+String.valueOf(ch[i]).toUpperCase();
    	}
    	else
    	{
    		if(ch[i]==' ')
    		{
    			capstr=capstr+ch[i];
    			count=count+1;
    		}
    		else
    		{
    			if(!(count==0))
    			{
    				capstr=capstr+String.valueOf(ch[i]).toUpperCase();
    				count=0;
    			}
    			else
    			{
    				capstr=capstr+ch[i];
    			}
    		}
    	}
    }
    
    System.out.println(capstr);
	}

}
