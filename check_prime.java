import java.util.Scanner;
public class check_prime
{
	public static void main(String[] args)
	{
		Scanner s=new Scanner(System.in);
		System.out.println("Enter any number");
		int num=s.nextInt();
		boolean isprime=true;
		for(int i=2;i<num;i++)
		{
			if(num%i==0)
			{
				isprime=false;
				break;		
			}
		}
		if(isprime)
		{System.out.println(num+" is a prime number");}
		else
		{System.out.println(num+" is not a prime number");}
	}
}
