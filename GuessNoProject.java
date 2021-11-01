import java.util.Scanner;
public  class GuessNoProject
{
	public static void main(String[] args)
	{
		Scanner sc=new Scanner(System.in);
		int num=(int)(Math.random()*100);
		int ipno=0;
		System.out.println("In this game you have to predict the number which is auto generated");
		System.out.println("To exit from game you have to enter -1");
		do
		{
			System.out.println(" *********");
			System.out.println(" Input the integer");
			ipno=sc.nextInt();
			if(ipno==num)
			{
				System.out.println("Wow you find the number");
				System.exit(0);
			}
			else if(num<ipno)
			{
				System.out.println("Input no. is too large");
			}
			else if(ipno==-1)
			{
				System.exit(0);
			}
			else{
				System.out.println("Input no. is too small");
			}
			
		}
		while(ipno!=num || ipno!=-1);
		
	}
}