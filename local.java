class outer
{
int a=10;
static int b=2;
private static int c=30;
private int d=20;
void read()
{
int e=90;
final int f=89;
class Local
{
void x()
{
System.out.println(a++);
System.out.println(b++);
}
}
public static void main(String args[])
Local a= new Local();
a.x();
}
}
