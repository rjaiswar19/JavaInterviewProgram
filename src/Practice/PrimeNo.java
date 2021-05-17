package Practice;

public class PrimeNo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int no=10;
		int i;
		if(no==1)
		{
			System.out.println("smallest prime no");
		}
		for(i=2;i<no;i++)
		{
			if((no%i)==0)
			{
				System.out.println("it is not a prime no");
				break;
			}
			
		}
		if(i==no)
		{
			System.out.println("it's prime no");
		}

	}

}
