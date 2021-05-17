import java.util.Scanner;

public class ArmStrongNumber {

	public static void main(String[] args) {
		int arm=0,r,b,c,d,no; 
		Scanner s=new Scanner(System.in);
		System.out.println("Enter any num :");
		no=s.nextInt();
		d=no;
		while(no>0)
		{
		r=no%10;
		no=no/10;
		arm=arm+r*r*r;
		}
		if(arm==d)
		{
		System.out.println("Armstrong :" + d);
		}
		else
		{
		System.out.println("not Armstrong");
		}
	}

}
