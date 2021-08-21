package PracticeOne;

import java.util.Arrays;
import java.util.Scanner;

public class AnagramPractice1 {

	public static void main(String arg[])
	{
		String s1,s2;
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter first string");
		s1=sc.next();
		System.out.println("Enter second string");
		s2=sc.next();
		boolean status=true;
		if(s1.length()!=s2.length())
		{
			System.out.println("it is not anagram number");
		}
		else
		{
			char ch[]=s1.toLowerCase().toCharArray();
			char ch1[]=s2.toLowerCase().toCharArray();
			Arrays.sort(ch);
			Arrays.sort(ch1);
		    status=Arrays.equals(ch, ch1);
		}
		if(status)
		{
			System.out.println("it is anagaram");
		}
		else
		{
			System.out.println("it is not anagaram");
		}
	}
}
