interface vehicle
{
void speed();
void purpose();
void aerodynamic();
}
class car implements vehicle
{
public void speed()
{
System.out.println("speed of a car");
}
public void  purpose()
{
	System.out.println("purpose of a car");
}
public void aerodynamic()
{
	System.out.println("aero of a car");
}
}
class verna
{
public static void main(String args[])
{
car obj=new car();
obj.speed();
obj.purpose();
obj.aerodynamic();

}
}