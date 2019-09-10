interface student
{
void degree();
static void nativit()
{
System.out.println("nativity hostel");
}
default void purpose()
{
System.out.println("default");
}
}
class study implements student
{
public void degree()
{
System.out.println("bachelors");
}
}
class abc
{
public static void main(String args[])
{
study ob=new study();
ob.degree();
student.nativit();
ob.purpose();
}
}