package exercise;

public class Node {
	private int info;
	private Node next;
	
	Node(){
		info = 0;
		next = null;
	}
	Node(int temp, Node link){
		info = temp;
		next = link;
	}
	public int getinfo()			{	return info;	}
	public Node getnext()			{	return next;	}
	public void setinfo(int temp)	{	info = temp;	}
	public void setnext(Node link)	{	next = link;	}
}
