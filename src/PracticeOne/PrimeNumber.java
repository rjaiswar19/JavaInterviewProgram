package PracticeOne;

public class PrimeNumber {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int i,n=17;
		
		if(n==1)
		{
			System.out.println("Smallest prime number is 2");
			
		}
		for(i=0;i<n;i++)
		{
			if(n%2==0)
			{
				System.out.println("it is not a prime number");
				break;
			}
		}
		if(n==i)
		{
			System.out.println("it is prime number");
		}

	}

}
