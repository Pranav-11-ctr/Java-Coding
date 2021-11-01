import java.util.*;
public class LinkedList2
{
	public static void main(String[] args) {
	    LinkedList l = new LinkedList();
	    l.add("Ashok");
	    l.add(30);
	    l.add(null);
	    System.out.println(l);
	    l.set(0,"Software");
	    System.out.println(l);
	    l.removeLast();
	    System.out.println(l);
	    l.addFirst(90);
	    System.out.println(l);
	    System.out.println(l.contains(309));
	    System.out.println(l.getLast());
	    System.out.println(l.getFirst());
	    
	    
	//	System.out.println("Hello World");
	}
}
