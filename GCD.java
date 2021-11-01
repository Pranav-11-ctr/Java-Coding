//gcd * lcm==n1*n2;

import java.util.*;
public class GCD
{
	public static void main(String[] args)
	{
		Scanner sc=new Scanner(System.in);
		int a=sc.nextInt();
		int b=sc.nextInt();
		int GCD=gcd(a,b);
		System.out.println("GCD = "+GCD);
		System.out.println("LCM = "+(a*b)/GCD);
	}
	public static int gcd(int a,int b)
	{   
		if(a%b==0){
		return b;}
	    return gcd(b,a%b);
	}
	
}