package PracticeOne;

import java.util.Arrays;
import java.util.Collections;
import java.util.Scanner;

public class Anagram {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc=new Scanner(System.in);
		System.out.println("enter first string");
	    String s1=sc.next();
	    s1=s1.replace("//s", "");
	    System.out.println("enter second string");
		String s2=sc.next();
		s2=s2.replace("//s", "");
		boolean status=true;
		if(s1.length()!=s2.length()){
			status=false;
		}
		else
		{
			char ch1[]=s1.toLowerCase().toCharArray();
			char ch2[]=s2.toLowerCase().toCharArray();
			Arrays.sort(ch1);
			Arrays.sort(ch2);
			status=Arrays.equals(ch1, ch2);	
		}
		if(status)
		{
			System.out.println("it is Anagram number");
		}
		else
		{
			System.out.println("it is not an anagram number");
		}
		
		
	}

}
