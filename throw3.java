class A
{
void x()
{
throws new ArithmeticException("my exception is my exception ");
}
void y()
{
x();
}
void z()
{
y();
}
public static void main(String args[])
{
A a= new A();
a.z();
}
}