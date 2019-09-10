class Myexception extends Exception
{
int d;
Myexception(int a)
{
d=a;
}/*
public String toString()
{
	return "hey"+d;
}*/
}
class A
{
void compute(int a)throws Myexception
{
if(a>10)
{
throw new Myexception(a);
}
}
public static void main(String args[])
{
	try
	{
A a= new A();
a.compute(19);
}
catch(Exception e)
{
	System.out.print(e);
}
}
}