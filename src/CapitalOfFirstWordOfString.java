
public class CapitalOfFirstWordOfString {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String str = "i name is ramashankar jaiswar";
		char arr[] = str.toCharArray();
		String capstring = "";
		int count = 0;
		for (int i = 0; i < str.length(); i++) {
			if (i == 0) {
				capstring = capstring + String.valueOf(arr[i]).toUpperCase();
			} else {
				if (arr[i] == ' ') {
					capstring = capstring + arr[i];
					count++;
				} else {
					if (count != 0) {
						capstring = capstring + String.valueOf(arr[i]).toUpperCase();
						count = 0;
					} else {
						capstring = capstring + arr[i];
					}
				}
			}
		}
		System.out.println(capstring);

	}

}
