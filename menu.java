import java.util.*;
class menu
{
public static void main(String args[])
{
System.out.println("1.Vegetarian");
System.out.println("2.Non-Vegetarian");
Scanner sc = new Scanner(System.in);
int num = sc.nextInt();
switch(num)
{
case 1 :

	System.out.println("1.Rice");
	System.out.println("2.Dal:");
	System.out.println("3.Veg pulav");
	System.out.println("4.Salad");
	System.out.println("5.Kheer");
	int num1 = sc.nextInt();
	switch(num1)
	{
		case 1:
		System.out.println("Rice:50");
		break;
		case 2:
		System.out.println("Dal:67");
		break;
		case 3:
		System.out.println("Veg pulav:45");
		break;
		case 4:
		System.out.println("Salad:89");
		break;
		case 5:
		System.out.println("Dessert:20");
		break;
	}
	
	break;

case 2 :

	System.out.println("1.Rogan Josh");
	System.out.println("2.Butter Chicken");
	System.out.println("3.Chicken Briyani");
	System.out.println("4.Kabbab");
	System.out.println("5.Mutton");
	int num2 = sc.nextInt();
	switch(num2)
	{
		case 1:
		System.out.println("Rogan Josh:150");
		break;
		case 2:
		System.out.println("Butter Chicken:250");
		break;
		case 3:
		System.out.println("Chicken Briyani:230");
		break;
		case 4:
		System.out.println("Kabbab:90");
		break;
		case 5:
		System.out.println("Mutton:56");
		break;
	}
	
	break;

}
sc.close();
}
}
