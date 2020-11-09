import java.util.Arrays;
class QuickSort
{
	static int partition(int a[],int l,int h)
	{
		int pivot=a[l];
		int i=l,j=h;
		do
		{
			do
			{
				i++;
			}while(a[i]<=pivot);
			do
			{
				j--;
			}while(a[j]>pivot);
			if(i<j)
			{
				int temp=a[i];
				a[i]=a[j];
				a[j]=temp;
			}
		}while(i<j);
		int temp=a[l];
		a[l]=a[j];
		a[j]=temp;
		return j;
	}
	static void Quick(int a[],int l,int h)
	{
		if(l<h)
		{
			int j=partition(a,l,h);
			Quick(a,l,j);
			Quick(a,j+1,h);
		}
	}		
	public static void main(String args[])
	{
		int a[] = {10,20,50,40,30,Integer.MAX_VALUE},n=6;
		n = a.length;
		System.out.println("Arrays before sorting: "+Arrays.toString(a));
		Quick(a,0,n-1);
		for(int i=0;i<n;i++)
		{
			System.out.println(a[i]);
		}	
			
	}
}	 			
						
