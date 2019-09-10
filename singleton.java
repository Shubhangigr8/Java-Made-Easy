class Qwerty
{
int x,y;
static Qwerty obj=null;
private Qwerty()
{
}
static Qwerty transfers()
{
if(obj==null)
{
obj=new Qwerty();
}
return obj;
}
}
class bank
{
public static void main(String args[])
{
Qwerty o=Qwerty.transfers();
System.out.println(o.x);
System.out.println(o.y);
Qwerty o1=Qwerty.transfers();
System.out.println(o1.x);
System.out.println(o1.y);
}
}