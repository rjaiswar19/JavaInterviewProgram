public class StockMaxProfit {
	
	public static void main(String args[])
	{
		int price[]={17,3,5,0,1,12};
		
		int n=price.length;
		
		int cost=0;
		int maxcost=0;
		
		int min_price=price[0];
		for(int i=0;i<n;i++)
		{
			min_price=Math.min(min_price, price[i]);
			cost=price[i]-min_price;
			maxcost=Math.max(maxcost, cost);				
		}
		System.out.println(maxcost);		
	}

}
