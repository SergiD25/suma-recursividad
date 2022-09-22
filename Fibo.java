public class Fibo
{
	public int Fibonacci(int c)
	{ 
	    if(c==1)
	     return 0;
	    if(c==2)
	     return 1;
		return Fibonacci (c-1) + Fibonacci (c-2);
	}
}