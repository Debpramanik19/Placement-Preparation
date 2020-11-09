public class Queue
{
	int queue[] = new int[5];
	int data;
	int size;
	int front;
	int rear;
	
	public void enqueue(int data)
	{
		queue[rear]=data;
		rear++;
		size++;
	}
	public int dequeue()
	{
		int data=queue[front];
		front++;
		size--;
		return data;
	}	
	public void show()
	{
		for(int i=0;i<size;i++)
		{
			System.out.print(queue[front+i]+" ");
		}
	}
	public static void main(String args[])
	{
		Queue queue = new Queue();
		queue.enqueue(5);	
		queue.enqueue(10);
		queue.enqueue(15);
		queue.enqueue(20);
		queue.dequeue();
		queue.show();
	}
}				
