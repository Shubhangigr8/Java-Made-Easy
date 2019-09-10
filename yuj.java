import java.io.*;
class vehicle
{
void disp()
{
System.out.println("Vehicle");
}
class car extends vehicle
{
void vehdisp()
{
System.out.println("car");
}
}
class maruti extends car
{
void mardisp()
{
System.out.println("maruti is a vehicle and its a car");
}
class carveh
{
public static void main(String args[])
{
vehicle mar=new vehicle();
mar.disp();
car cars=new car();
cars.vehdisp();
maruti mart=new maruti();
mart.mardisp();
}