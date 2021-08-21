
public class StockMaxPricePractice {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		
		int price[]={17,3,5,0,1,12};
		int profit=0;
		int max=0;
		int min=price[0];
		
		for(int i=0;i<price.length;i++)
		{
			min=Math.min(min, price[i]);
			profit=price[i]-min;
			max=Math.max(max, profit);
		}
		System.out.println(max);
	}

}
