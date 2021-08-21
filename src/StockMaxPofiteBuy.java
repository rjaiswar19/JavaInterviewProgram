
public class StockMaxPofiteBuy {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		
		int stock[]={1,1,-7, 5 , 5};
		int lowestpricetilldate=stock[0];
		int maxprofite=0;
		//System.out.println(maxprofite);
		for(int i=0;i<stock.length;i++)
		{
			int profite=0;
			if(stock[i]>lowestpricetilldate)
			{
				profite=stock[i]-lowestpricetilldate;
				if(profite>maxprofite)
				{
					maxprofite=profite;
				}
				else
				{
					lowestpricetilldate=stock[i];	
				}
			}
		}
		System.out.println(maxprofite);
	}

}
