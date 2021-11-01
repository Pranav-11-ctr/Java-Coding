import java.util.*;
public class Stack
{
	public static void main(String[] args) {
	  Stack s=new Stack();
	  System.out.println(s.capacity());
	  for(int i=1;i<=10;i++)
	  {
	      s.push(i);
	  }
	  System.out.println(s);
	  s.push("A");
	  s.addElement("K");
	  s.removeElementAt(0);
	  System.out.println(s);
	  s.pop();
	  System.out.println(s);
	  System.out.println(s.pop());
	  System.out.println(s.peek());
	  System.out.println(s);
	  System.out.println(s.search(4));
	  System.out.println(s.search(0));
	  System.out.println(s.capacity());
	  
	  
	    
	//	System.out.println("Hello World");
	}
}
