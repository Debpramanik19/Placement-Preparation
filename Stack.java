public class Stack
{
	int stack[] = new int[5];
	int top=0;
	
	public void push(int data)
	{
		stack[top]=data;
		top++;
	}
	public int pop()
	{
		int data;
		top--;
		data = stack[top];
		stack[top]=0;
		return data;
	}	
	public int peek()
	{
		int data;
		data = stack[top-1];
		return data;
	}	
	public void show()
	{
		for(int n:stack)
		{
			System.out.println(n+ " ");
		}
	}
	public static void main(String[] args)
	{
		Stack stack = new Stack();
		stack.push(10);
		stack.push(20);
		stack.push(30);
		System.out.println(stack.pop());
		stack.show();
	}
}					
