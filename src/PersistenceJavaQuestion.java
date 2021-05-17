
public class PersistenceJavaQuestion {
	
	static int x;
	boolean catch()
	{
		x++;
		return true;
	}
	
	public static void main(String arg[])
	{
		
		x=0;
		if((catch()|catch())||catch())
			x++;
		System.out.println(x);
	}

}
