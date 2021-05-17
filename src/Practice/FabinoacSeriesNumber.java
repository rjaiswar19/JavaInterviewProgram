package Practice;

public class FabinoacSeriesNumber {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int no=10;
		int firstno=0; 
		int secno=1;
		int next;
		for(int i=0;i<=no;i++)
		{
			System.out.print(firstno+"  ");
			next=firstno+secno;
			firstno=secno;
			secno=next;
		}
	}

}
