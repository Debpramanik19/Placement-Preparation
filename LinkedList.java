
public class LinkedList {
	public class Node
	{
		int data;
		Node next;
	}	
	Node head;
	public void insertBefore(int data)
	{
		Node node = new Node();
		node.data=data;
		node.next=null;
		node.next=head;
		head=node;
	}	
	public void insertAfter(int data)
	{
		Node node = new Node();
		node.data=data;
		node.next=null;
		if(head==null)
		{
			head=node;
		}
		else
		{
			Node n =head;
			while(n.next!=null)
			{
				n = n.next;
			}
			n.next = node;
		}
		
	}
	public void insertAny(int index, int data)
	{
		Node node = new Node();
		node.data=data;
		node.next=null;
		Node n =head;
		for(int i=0;i<index-1;i++)
		{
			n = n.next;
		}
		node.next=n.next;
		n.next=node;
	}	
			
	public void show()
	{
		Node node = head;
		while(node.next!=null)
		{
			System.out.println(node.data);
			node = node.next;
		}
		System.out.println(node.data);
	}
	public static void main(String[] args)
	{
		LinkedList list = new LinkedList();
		list.insertAfter(20);
		list.insertAfter(30);
		list.insertAfter(40);
		list.insertBefore(10);
		list.insertAny(2,35);
		list.show();
	}
}	

