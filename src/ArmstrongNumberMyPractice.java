
public class ArmstrongNumberMyPractice {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int no=153;
		int armno=0;
		int r;
		int b=no;
		while(no>0)
		{
			r=no%10;
			no=no/10;
			armno=armno+r*r*r;
		}
		if(b==armno)
		{
			System.out.println("it is armstong no");
		}
		else
		{
			System.out.println("it is not a armstrong number");
		}

	}

}
