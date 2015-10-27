package linkedList;

public class Node {
	
	public int info;
	public Node next;
	
	public Node(){					//blank Constructor
		info = 0;
		next = null;
	}
	public Node(int s){				//value giving Constructor 
		this.info = s;
		this.next = null;
	}
	public Node(int s, Node n){		//value giving Constructor 
		this.info = s;
		this.next = n;
	}
	
	public int getinfo()				{		return info;		}	//get the element
	public Node getNext()				{		return next;		}	//get the next node
	
	public void setinfo(int e)			{		info = e;			}	//set data to the node
	public void setNext(Node newnext)	{		next = newnext;		}	//set pointer to next node
	
}
