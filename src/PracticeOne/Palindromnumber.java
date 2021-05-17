package PracticeOne;

public class Palindromnumber {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int n=153;
		int r,no=0,b=n;
		while(n>0)
		{
			r=n%10;
			n=n/10;
			no=no*10+r;
		}
		if(no==b)
		{
			System.out.println("number is palindrom number  "+no);
		}
		else{
			System.out.println("it is not prime number");
		}

	}

}
