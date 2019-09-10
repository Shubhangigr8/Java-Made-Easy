import java.util.*;
class A
{
public static void main(String args[])
{
Scanner sc=new Scanner(System.in);
{
try
{
System.out.println("Enter the value");
int a=sc.nextInt();
int b= sc.nextInt();
int c=b/a;
}
catch(ArithmeticException a)
{
System.out.print(a);
System.out.println("stop this cause it won't work");
}
}
}
}