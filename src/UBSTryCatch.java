
public class UBSTryCatch {

	public static void main(String[] args) throws Exception {
		// TODO Auto-generated method stub
		try
		{
			assert false;
			System.out.print("t ");
		}
        catch(Error e)
        {
        	System.out.println("c ");
        	throw new Exception();
        }
		finally{
			System.out.print("f ");
		}
	}

}
