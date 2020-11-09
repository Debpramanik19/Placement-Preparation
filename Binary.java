class Binary
{	
	public static void main(String []args)
	{
		int a[]={1,2,3,4,5,6,7,8,9,10};
		int key=6;
		boolean flag=false;
		int l=0;
		int h=a.length-1;
		while(l<=h)
		{
			int mid=(l+h)/2;
			if(mid==key)
			{	
				System.out.println("Element found at "+mid);
				flag=true;
				break;
			}
			if(mid<key)
			{
				l=mid+1;
			}
			if(mid>key)
			{
				h=mid-1;
			}
		}
		if(flag==false)
		{
			System.out.println("Element not found");
		}
	}
}							
