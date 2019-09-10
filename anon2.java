interface A
{
void read();
}
class anon
{
public static void main(String args[])
{
B b= new B();
b.display(new A()
{
public void read()
{
System.out.print("rest");
}
});
}
}
class B
{
void display(A obj)
{
obj.read();
}
}