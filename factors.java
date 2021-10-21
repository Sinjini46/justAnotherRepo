import java.util.*;
class factors
{
	int odd(int i,int n)
	{
		
		if(i<=n)
		{
			if(n%i==0 && i%2!=0)
				
			{
				return i+odd(i+1,n);	
			}
			else
				return 0+odd(i+1,n);	
			
		}
			return 0;
	}
	int even(int i,int n)
	{
		
		if(i<=n)
		{
			if(n%i==0 && i%2==0)
			{
				return i+even(i+1,n);	
			}
			else
				return 0+even(i+1,n);	
		}
			return 0;
	}
	public static void main(String[]args)
	{
		Scanner sc=new Scanner(System.in);
		int b=sc.nextInt();
		factors ob=new factors();
		int k=ob.odd(1,b);
		System.out.println("sum of odd factors="+ k);
		int l=ob.even(1,b);
		System.out.println("sum of even factors="+ l);	
	}
}
