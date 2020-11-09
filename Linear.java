class Linear
{
	public static void main(String[] args)
	{
		int a[] = {10,40,20,30,50};
		int key = 5;
		boolean flag=false;
		for(int i=0;i<a.length;i++)
		{
			if(key==a[i])
			{
				System.out.println("Element found at "+i);
				flag=true;
				break;
			}
		}
		if(flag==false)
		{	
			System.out.println("Element not found");
		}
	}
}						
