class A
{
	
		String S="Shubhangi";
void read()
{
try
{
throw new ArithmeticException("something");
}
catch(NullPointerException e)
{
System.out.print(e);
throw e;
}
}
public static void main(String args[])
	{try
		{
			A a=new A();
		a.read();
		}
		catch(ArithmeticException e)
		{
		System.out.println(e);
		}
	}
}