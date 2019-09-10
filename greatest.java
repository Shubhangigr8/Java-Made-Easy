import java.util.*;
class greatest
{
	public static void main(String []args)
	{
		int a,b,c;
		System.out.println("ENTER THREE NUMBERS");
		Scanner sc = new Scanner(System.in);
		a = sc.nextInt();
		b = sc.nextInt();
		c = sc.nextInt();
		sc.close();
		if(a>b && a >c)
		{
			System.out.println(a+" is the greates number of the three numbers");
		}
		else if(b>c)
		{
			System.out.println(b+" is the greates number of the three numbers");
		}
		else
		{
			System.out.println(c+" is the greates number of the three numbers");
		}
	}
}