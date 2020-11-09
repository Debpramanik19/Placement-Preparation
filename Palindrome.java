import java.util.Scanner;
import java.util.*;

public class Palindrome
{
	public static void main(String[] args)
	{
		Scanner sc =  new Scanner(System.in);
		System.out.println("Enter string/number: ");
		String str = sc.next();
		String org_str=str;
		String rev="";
		int len = str.length();
		for(int i=len-1;i>=0;i--)
		{
			rev += str.charAt(i);
		}
		if(org_str.equals(rev))
		{
			System.out.println("Palindrome");
		}
		else
			System.out.println("Not");
				
	}
}	
				
			
