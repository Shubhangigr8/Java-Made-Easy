class outclass
{
static int a=10;
int b=10;
private static int c=0;
private int d=56;
class Nestedclassin
{

public int e=8;
static final int f=90;
void display()
{
outclass obj=new outclass();
a++;
obj.b++;
c++;
obj.d++;
e++;
System.out.println(a);
System.out.println(obj.b);
System.out.println(c);
System.out.println(obj.d);
System.out.println(e);
System.out.println(f);
}}
public static void main(String args[])
{

outclass.Nestedclassin innerobj=new outclass.Nestedclassin();
innerobj.display();
}
}


