class outerclass
{
private int a=12;
private static int b=30;
int c=20;
static int d=20;
static int e=2;
class aadharclass
{
void read()
{

obj.a++;
b++;
obj.c++;
d++;
e++;
int f=23;
final int g=39;
System.out.println(obj.a);
System.out.println(b);
System.out.println(obj.c);
System.out.println(d);
System.out.println(e);
System.out.println(f);
System.out.println(g);
}
}
class bt
{
public static void main(String args[])
{
	outerclass obj=new outerclass();
outerclass.aadharclass obj1=obj.new aadharclass();
obj1.read();
}
}
}


