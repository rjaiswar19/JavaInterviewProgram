
public class SwipeOfTwoNumberwithoutUsingThirdVarialble {

	public static void main(String[] args) {
		int a=20;
		int b=10;
	
		
		a=a+b;
		b=a-b;
		a=a-b;
		
		System.out.println("after reversing a's value is" + a);
		System.out.println("after reversing b's value is" + b);

	}

}
