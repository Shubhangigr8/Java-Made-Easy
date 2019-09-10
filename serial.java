import java.io.*;
class objofser implements Serializable
{
String s;
int i;
double d;
objofser(String s,int i,double d)
{
this.s=s;
this.d=d;
this.i=i;
}
public String toString()
{
return s+";"+d+";"+i;
}
}
class filehandle
{
public static void main(String args[])throws IOException
{
objofser obj=new objofser("hello",-8,2.7e10);
System.out.println("obj1"+obj);
FileOutputStream f=new FileOutputStream("ser.txt");
ObjectOutputStream o=new ObjectOutputStream(f);
o.writeObject(obj);
o.close();
}
}