import java.util.Scanner;

public class Repeatation
{
	public static void main(String[] args)
	{
		Scanner sc = new Scanner(System.in);
		int arr[] = {1,2,3,4,5,5};
		int n = arr.length;
		boolean flag = false;
		for(int i=0;i<n;i++)
		{
			for(int j=i+1;j<n;j++)
			{
				if(arr[i]==arr[j])
				{
					System.out.println("Duplicate found "+ arr[i]);
					flag=true;
				}
			}
			
		}
		if(flag==false)
		{
			System.out.println("Duplicate found");
		}
	}
}					
