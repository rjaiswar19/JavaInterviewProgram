package PracticeOne;

public class ArmstongNumber {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		
		int n=151;
		int r,no=0,b=n;
		while(n>0)
		{
			r=n%10;
			n=n/10;
			no=no+r*r*r;
				
		}
		
		if(no==b)
		{
			System.out.println("number is armstong number   " +  no);
			
		}
		else
		{
			System.out.println("It is not armstron number");
		}
	}

}
