import java.util.*;
class student implements Comparable<student>
{
String name;
int rn;
double cgpa;
student(){}
student(String n,int r, double c)
{
n=name;
r=rn;
c=cgpa;
}
public String ToString()
{
return name+" "+rn+" "+cgpa;
}
public int compareTo(student s)
{
	return if(this.rn>s.rn:1?-1);
//return this.rn=s.rn;
}
}
class arraylisting
{
public static void main(String args[])
{

ArrayList <student> st= new ArrayList<student>();
{
st.add(new student("cardy",8,9.0));
st.add(new student("rakny",3,8.7));
st.add(new student("gnay",2,9.8));
st.add(new student("aliyh",5,7.8));
Collections.sort(st);
System.out.println(st);
Iterator itr=st.iterator();
while(itr.hasNext())
{System.out.println(itr.next());
}
}
}
}