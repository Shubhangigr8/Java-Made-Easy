import java.io.*;
import java.util.*;
class filehandled
{
public static void main(String args[]) throws IOException
{
File f1= new File("java1.txt");
	f1.createNewFile();
File f=new File("abc.txt");
f.createNewFile();
Scanner sc= new Scanner(f1);
String str;
while((str=sc.readLine())!=null)
{
PrintWriter pw= new PrintWriter("abc.txt");
{
System.out.println(str);
}
}
}
}
