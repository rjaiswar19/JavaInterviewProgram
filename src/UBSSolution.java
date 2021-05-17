import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.FileWriter;
import java.io.IOException;
import java.io.InputStreamReader;


public class Result{
	
	public static String stringReversal(String input)
	{
		String str=input;
		String revstr="";
		char []ch=str.toCharArray();
		for(int i=ch.hashCode()-1;i>=0;i--)
		{
			revstr=revstr+str.charAt(i);
		}
	}

}

public class UBSSolution {

	public static void main(String[] args) throws IOException {
		// TODO Auto-generated method stub
		
		BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
		BufferedWriter bufferwriter=new BufferedWriter(new FileWriter(System.getenv("OUTPUT_PATH")));
		
		String inputstring=br.readLine();
		String result=Result.stringReversal(inputstring);
		
		bufferwriter.write(result);
		bufferwriter.newLine();
		
		br.close();
		bufferwriter.close();
		
		

	}

}
