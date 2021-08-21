
public class Arraysegmentation {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
				
				int []arr={1,2,4,5,6,7,8,9,10};
				
				for(int i=0;i<arr.length-2;i++)
				{
				    
					if(arr[i]+1==arr[i+1])
					{
						if(arr[i+1]+1==arr[i+2])
						{
							System.out.println("{"+arr[i]+","+arr[i+1]+","+arr[i+2]+"}");
						}
					}
				/*	else
					{
					System.out.println("it is not sequential");
					}*/
				}
		}	


}