import java.util.*;  
class check  
{  
	public static void main(String args[])  
	{  
		int T, n, digit, sum = 0;  
		Scanner sc = new Scanner(System.in);   
		T= sc.nextInt(); 
		for(int i=0;i<T;i++)
		{
			n=sc.nextInt();
			if(n%2==0)
			{
				System.out.println("Even");
			}
			else
			{
				System.out.println("Odd");
			}
		}			
		
	}  
}  
