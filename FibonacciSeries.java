/*
	3. Fibonacci Series
	Description: Write a program to print the first n Fibonacci numbers.
	Input: n = 5
	Output: 0 1 1 2 3
*/
import java.util.*;
public class FibonacciSeries
{
	public static void main(String x[])
	{
		Scanner s=new Scanner(System.in);
		System.out.println("Enter Limit of Fibonacci ");
		int limit=s.nextInt();
		int f1=0;
		int f2=1;
		System.out.println(f1+"\n"+f2);
		for(int i=1;i<=limit;i++)
		{
			int fib=f1+f2;
			f1=f2;
			f2=fib;
			System.out.println(fib);
		}
	}
	
}
