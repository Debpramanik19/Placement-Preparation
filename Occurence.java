import java.util.Scanner;

class Occurence
{
	public static void main(String [] args)
	{
		Scanner sc = new Scanner(System.in);	
		System.out.println("Enter the string: ");
		String str = sc.nextLine();
		int initiallength = str.length();
		Scanner sc1 = new Scanner(System.in);
		System.out.println("Enter the value you want to count: ");
		String str1 = sc1.next();
		str = str.replace(str1,"");
		int finallength = str.length();
		System.out.println("The occurence of the character is: "+(initiallength-finallength));
	}
}		
