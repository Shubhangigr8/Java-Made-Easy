import java.util.*;
class GasPrices
{
	public static void main(String []args)
	{
		double pricePerBarrel;
		System.out.print("ENTER THE PRICE OF pricePerBarrel");
		Scanner sc = new Scanner(System.in);
		pricePerBarrel = sc.nextInt();
		sc.close();
		calculate(pricePerBarrel);
	}
	public static void calculate(double pricePerBarrel)
	{
		double a,b;
		a = (3.50/100)*pricePerBarrel;
		
		b = (4.00/100)*pricePerBarrel;
		System.out.println("THE CONSUMER PRICES ARE $"+a+"AND $"+b);
		return;
	}
}