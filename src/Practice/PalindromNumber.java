package Practice;

public class PalindromNumber {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int no=353;
		int palno=0;
		int r;
		int b=no;
		while(no>0)
		{
			r=no%10;
			no=no/10;
			palno=(palno*10)+r;
		}
		if(b==palno)
		{
			System.out.println("it is palindrom no");
		}
		else
		{
			System.out.println("it is not palindrom no");
		}

	}

}
