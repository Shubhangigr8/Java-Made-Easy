class alpha
{
public static void main(String args[])
{
try
{
try
{
int a=9;
int b=0;
int c=a/b;
}
catch(ArithmeticException c)
{
	System.out.println("Exception came ");
}
}
catch(ArrayIndexOutOfBoundsException c)
{
	System.out.println("array index out of bound");
}
}
}
