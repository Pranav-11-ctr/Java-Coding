//50 true 25 true 38 false false true 48 true 18 false false false true 45 true 85 false false true 60 false false
import java.util.*;
public class BinaryTree{
	public static void main(String[] args)
	{
	BinaryTree1 tree=new BinaryTree1();
	tree.display();
	System.out.println("Height of tree is :"+tree.height());
	System.out.println("Pre Order Traversal");
	tree.preOrder();
	System.out.println();
	System.out.println(" InOrder Traversal");
	tree.inOrder();
	System.out.println();
	System.out.println(" Post Order Traversal");
	tree.postOrder();
	System.out.println();
	System.out.println(" Level Order Traversal");
	tree.levelOrder();
	}
}
class BinaryTree1
{
	private class Node{
		int data;
		Node left;
		Node right;
	    Node(int data,Node left,Node right)
	    {
		this.data=data;
		this.left=left;
		this.right=right;
	    }
	}
	 private Node root=null;
	 private int size=0;
	 BinaryTree1()
	 {
		 Scanner s=new Scanner(System.in);
		 this.root=takeInput(s,null,false);
	 }
	 private Node takeInput(Scanner s,Node parent,boolean isLeftRight)
	 {
		 if(parent==null)
		 {
			 System.out.println("Enter the data for root node");
		 }
		 else
		 {
			 if(isLeftRight)
			 {
				 System.out.println("Enetr the left Child data of"+parent.data);
				 
			 }
			 else{
				 System.out.println("Enetr the right child data of"+parent.data);
			 }
			 
		 }
		 int nodedata=s.nextInt();
		 Node node=new Node(nodedata,null,null);
		 this.size++;
		 
		 boolean choice=false;
		 System.out.println("Do you have left child of "+node.data);
		 choice=s.nextBoolean();
		 
		 if(choice)
		 {
			node.left=takeInput(s,node,true); 
		 }
		 
		 choice=false;
		 System.out.println("Do you have right child of "+node.data);
		 choice=s.nextBoolean();
		 
		 if(choice)
		 {
			node.right=takeInput(s,node,false); 
		 }
		 return node;
	 }
	 public void display()
	 {
		 display(this.root);
	 }
	 
	 private void display(Node node)
	 {
		 String str="";
		 if(node.left!=null)
		 {
			str=str+node.left.data+"=>"; 
		 }
		 else{
			 str=str+"End=>";
		 }
		 str=str+node.data;
		 if(node.right!=null)
		 {
			 str=str+"<="+node.right.data;
		 }
		 else{
			 str=str+"<=End";
		 }
		 System.out.println(str);
		 if(node.left!=null)
			 this.display(node.left);
		 if(node.right!=null)
		 {
			 this.display(node.right);
		 }
	 }
	 public int height()
	 {
		 return this.height(this.root);
	 }
	 private int height(Node node)
	 {
		 if(node==null)
			 return -1;
		 int lheight=this.height(node.left);
		 int rheight=this.height(node.right);
		 int high=Math.max(lheight,rheight)+1;
		 return high;
	 }
	 public void preOrder()
	 {
		 this.preOrder(this.root);
	 }
	 private void preOrder(Node node)
	 {
		 if(node==null)
			 return;
		 System.out.print(node.data+",");
		 preOrder(node.left);
		 preOrder(node.right);
	 }
	 public void inOrder()
	 {
		 this.inOrder(this.root);
	 }
	 private void inOrder(Node node)
	 {
		 if(node==null)
			 return;
		 inOrder(node.left);
		 System.out.print(node.data+",");
		 inOrder(node.right);
	 } 
     public void postOrder()
	 {
		 this.postOrder(this.root);
	 }
	 private void postOrder(Node node)
	 {
		 if(node==null)
			 return;
		 postOrder(node.left);
		 postOrder(node.right);
		 System.out.print(node.data+",");
	 }  
	 public void levelOrder()
	 {
		 LinkedList<Node> queue=new LinkedList<>();
		 queue.add(this.root);
		 while(!queue.isEmpty())
		 {
			 Node rv=queue.removeFirst();
			 System.out.print(rv.data+" ,");
			 if(rv.left!=null)
				 queue.addLast(rv.left);
			 if(rv.right!=null)
				 queue.addLast(rv.right);
			 
		 }
		 
	 }
	 	 
	 
}