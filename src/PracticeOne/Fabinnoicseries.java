package PracticeOne;

public class Fabinnoicseries {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
       int first=0;
       int sec=1;
       int next;
       int n=10;
       for(int i=0;i<n;i++)
       {
    	   System.out.println(first);
    	    next=first;
    	    first=sec;
    	    sec=first+next;
       }
	}

}
