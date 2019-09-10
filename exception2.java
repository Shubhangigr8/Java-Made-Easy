import java.util.*;
class B
{
public static void main(String args[])
{
Scanner sc=new Scanner(System.in);
{
try
{
System.out.println("Enter the value");
int a=sc.nextInt();
int s[]=new int[2];
int b= sc.nextInt();
int c=b/a;
s[3]=56;

}
catch(Exception e)
{
	System.out.println(e);
}
catch(ArrayIndexOutOfBoundsException s)
{
	System.out.println("array limit exceeds do not perfowm the assigning");
}
catch(ArithmeticException c)
{
System.out.print(c);
System.out.println("stop this cause it won't work");
}
}
}
}