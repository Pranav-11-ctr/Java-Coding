/*public class Comparable1
{
	public static void main(String[] args)
	{
		System.out.println("A".compareTo("Z"));
		System.out.println("Z".compareTo("A"));
		//System.out.println(Integer(6).compareTo(Integer(7)));
		System.out.println("A".compareTo("A"));
	}
}*/
import java.util.*;
public class Comparable1{
	public static void main(String[] args)
	{
		TreeSet t=new TreeSet(new MyComparator());
		t.add(10);
		t.add(8);
		t.add(5);
		t.add(8);
		System.out.println(t);
	}
}
class MyComparator implements Comparator{
	public int compare(Object o1,Object o2)
	{
		Integer i1=(Integer)o1;
		Integer i2=(Integer)o2;
		if(i1<i2)
			return +1;
		else if(i2>i1)
		{
			return -1;
		}
		else
			return 0;
	}
}