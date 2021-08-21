
public class StockPricePractice2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		int price[]={12,20,3,39,70};
		int a=price[0];
		int b=0;
		int diff=0;
		
		for(int i=0;i<price.length;i++)
		{
			a=Math.min(a, price[i]);
			diff=price[i]-a;
			b=Math.max(b, diff);	
		}
        System.out.println(b);
	}

}
