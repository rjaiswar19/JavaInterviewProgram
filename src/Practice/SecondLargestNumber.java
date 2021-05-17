package Practice;

public class SecondLargestNumber {
	public static void main(String arg[])
	{
		int[] no={10,856,456,500,3,12,9};
		int largestno=no[0];
		int seclargestno=no[1];
		for(int i=0;i<no.length;i++)
		{
			if(no[i]>largestno)
			{
				seclargestno=largestno;
				largestno=no[i];
			}
		}
		System.out.println("secondLargestno is " +seclargestno);
	}

}
