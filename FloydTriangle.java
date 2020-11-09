import java.util.Scanner;

class FloydTriangle
{
	public static void main(String args[])
	{
		int n,c,d,num=1;
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the size of the triangle: ");
		n = sc.nextInt();
		System.out.println("Floyd triangle: ");
		for(c=1;c<=n;c++)
		{
			for(d=1;d<=c;d++)
			{
				System.out.print(num+" ");
				num++;
			}
			System.out.println(" ");
		}
	}
}				
