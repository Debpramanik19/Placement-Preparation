import java.util.Arrays;

class Selection
{
	static void Select(int a[],int n)
	{
		int i,j,k;
		n= a.length;
		for(i=0;i<n-1;i++)
		{
			for(j=k=i;j<n;j++)
			{
				k=j;
			}
			int temp = a[i];
			a[i]=a[k];
			a[k]=temp;
		}
	}
	public static void main(String args[])
	{
		int a[] = {10,20,50,40,30};
		int n = a.length;
		System.out.println("Arrays before sorting: "+Arrays.toString(a));
		Select(a,n);
		for(int i=0;i<n;i++)
		{
			System.out.println(a[i]);
		}	
	}
}				
