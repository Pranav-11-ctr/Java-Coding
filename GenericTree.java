
import java.util.ArrayList;
import java.util.Scanner;
public class GenericTree{
	public static void main(String[] args)
	{
	GenericTree1 tree=new GenericTree1();
	tree.display();
	}
}
 class GenericTree1
{
	private class Node{
		int data;
		ArrayList<Node> children;
		Node(int data)
		{
			this.data=data;
			this.children=new ArrayList<>();
		}
	}
	private Node root;
	private int size;
	GenericTree1()
	{
		Scanner s=new Scanner(System.in);
		this.root=takeInput(s,null,0);
		
	}
	private Node takeInput(Scanner s,Node parent,int ithChild)
	{
		if(parent==null)
		{
			System.out.println("Please Enter the root data");
			
		}else
		{
			System.out.println("Enter the data for "+ithChild+"th child of Parent"+parent.data); 
		}
		int nodedata=s.nextInt();
		Node node=new Node(nodedata);
		this.size++;
		
		System.out.println("Enter the no. of children for "+node.data);
		int children=s.nextInt();
		
		//will be executed accordimg to children
		for(int i=0;i<children;i++)
		{
			Node child=this.takeInput(s,node,i);
			node.children.add(child);
		}
		return node;		
	}
	public void display()
	{
		this.display(this.root);
	}
	private void display(Node node)
	{
		//node data
		String str=node.data+"=>";
		for(int i=0;i<node.children.size();i++)
		{
			//add children data of current node
			str=str+node.children.get(i).data+",";
		}
		str=str+"End";
		System.out.println(str);
		//display for all nodes
		for(int i=0;i<node.children.size();i++)
		{
			this.display(node.children.get(i));
		}
	}
}
