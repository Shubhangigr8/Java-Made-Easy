import java.io.*;
class throws1
{
void x() throws IOException
{
throw new IOException();
}
void y() throws IOException
{
x();
}
void z()
{
try{y();
}
catch(Exception a)
{}
}
class ecepthrows
{
public static void main(String args[]) throws IOException
{
ecepthrows e=new ecepthrows();
e.z();
}
}
