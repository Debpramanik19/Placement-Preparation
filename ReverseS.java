import java.util.Scanner;

public class ReverseS
{
	public static void main(String[] args)
	{
		Scanner sc =  new Scanner(System.in);
		System.out.println("Enter string/number: ");
		String str = sc.nextLine();
		String rev="";
		char a[] = str.toCharArray();
		int len = a.length;
		for(int i=len-1;i>=0;i--)
		{
			rev += a[i];
		}
		System.out.println(rev);
	}
}			
