import java.util.Arrays;
class Insertion
{
	static void Insert(int a[],int n)
	{
		for(int i=1;i<n;i++)
		{
			int j=i-1;
			int x=a[i];
			while(j>-1 && a[j]>x)
			{
				a[j+1]=a[j];
				j--;
			}
			a[j+1]=x;
		}
	}
	public static void main(String[] args)
	{
		int a[]={10,40,20,50,30};
		int n = a.length;
		System.out.println("Arrays before sorting: "+Arrays.toString(a));
		Insert(a,n);
		System.out.println("Arrays after sorting: "+Arrays.toString(a));	
		
	}
}					
