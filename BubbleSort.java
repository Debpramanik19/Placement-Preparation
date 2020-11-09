import java.util.Arrays;
class BubbleSort
{
	public static void main(String[] args)
	{
		int a[]={10,30,20,50,40};
		int n = a.length;
		boolean flag = false;
		int temp=0;
		System.out.println("Arrays before sorting: "+Arrays.toString(a));
		for(int i=0;i<n-1;i++)
		{
			flag=true;
			for(int j=0;j<n-i-1;j++)
			{
				if(a[j]>a[j+1])
				{
					temp=a[j];
					a[j]=a[j+1];
					a[j+1]=temp;
				}
			}
		}
		System.out.println("Arrays after sorting: "+Arrays.toString(a));
	}
	
}					
