
public class SecondLargestNumber {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		 int arr[] = { 14, 900, 47, 86, 92, 52, 48, 36, 66, 85 };
			int largest = arr[0];
			int secondLargest = arr[0];
			//int thirdLargest=arr[0];
			for (int i = 1; i < arr.length; i++) {
	 
				if (arr[i] > largest || arr[i]>secondLargest) {
					//thirdLargest=secondLargest;
					secondLargest = largest;
					largest = arr[i];
	 
				}/* else if (arr[i] > secondLargest) {
					secondLargest = arr[i];
	 
				}
				 else if (arr[i] > thirdLargest) {
					 thirdLargest = arr[i];
		 
					}
			}
			System.out.println("\nlargest number is:" + largest);

			System.out.println("\nSecond largest number is:" + secondLargest);
			System.out.println("\nThird  largest number is:" + thirdLargest);

*/   
			}
			System.out.println("\nSecond largest number is:" + secondLargest);
	}

}
