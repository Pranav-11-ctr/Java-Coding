import java.util.*;
public class BenjaminBulb
{
	public static void main(String[] args)
	{
		Scanner sc=new Scanner(System.in);
		int n=sc.nextInt();
		int s=(int)Math.sqrt(n);
		for(int i=1;i<=s;i++)
			System.out.println(i*i);
	}
}