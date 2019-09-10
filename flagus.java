import java.io.*;
import java.math.*;
import java.util.*;
 public class flagus
{
	public static void main(String [] args)
	{
		int n;
		Scanner sc= new Scanner(System.in);
		n=sc.nextInt();
		int lop;
		lop=n/3;
		for(int f=0;f<n;f++)
		{
			for(int s=0;s<n;s++)
		{
		for(int i=0;i<lop;i++)
		{
			for(int j=0;j<lop;j++)
			{
				if((i==0||i%2==0)&&(j==0||j%2==0))
				{
					System.out.print("*");
				}
				
					else if(i%2!=0&&j%2!=0)
					{
					System.out.print("*");
					}
					else
					{
						System.out.print(" ");
					}
			}
			for(int k=lop;k<n;k++)
		{
			for(int d=lop;d<n;d++)
			{
		System.out.print("=");
		
			}
		}
		}
			System.out.println();
		}
		sc.close();
	}
		}
	}

					
			
