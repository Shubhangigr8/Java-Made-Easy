class A 
{
public static void main(String args[])
{
try
{
	try
	{
int a=9/0;
	}
catch(ArithmeticException e)
{
	System.out.println("see this");
}
finally
{
System.out.println("No one could harm me");
}
}

catch(Exception e)
{
System.out.println("I am an error ");
}
finally
{
System.out.println("i told you na no onwe could harm me");
}
}
}