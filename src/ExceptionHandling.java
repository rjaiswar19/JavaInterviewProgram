
public class ExceptionHandling {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
 
		try{
			int a=10/0;
		}
		catch(ArithmeticException a)
		{
			//a.printStackTrace();
			System.out.println("This is arithemetic exception");
		}
		catch(Exception e)
		{
			e.printStackTrace();
			System.out.println("This is parent exception");
			
		}
		finally
		{
			System.out.println("closing all the opened connection");
		}
	}

}
