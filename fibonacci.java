import java.util.*;
class fibonacciseries
{
	public static void main(String[]ags)
	{
		int a=0,b= 1,f=0,i=0;
		Scanner sc=new Scanner(System.in);
		int n=sc.nextInt();
		System.out.println(a);
		System.out.println(b);
		do
		{
			f= a+b;
			a=b;
			b=f;
			System.out.println(f);
			i++;
			
		}
		while(i<n);
	}
}
