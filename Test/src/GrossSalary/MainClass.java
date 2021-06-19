package GrossSalary;

import java.util.Scanner;

public class MainClass 
{
	public static void test(int a[])
	{
		double grossSalary = 0;
		double hra = 0;
		double da = 0;
		for(int i=0; i<=a.length-1; i++)
		{
			if(a[i]<1500)
			{
				hra = 0.1 * a[i];
				da = 0.98 * a[i];
			}
			else
			{
				hra = 500;
				da = 0.98 * a[i];
			}
			grossSalary = a[i] + hra + da;
			System.out.println(grossSalary);
		}
	}
	public static void main(String[] args) 
	{
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		int a[] = new int[n];
		for(int i=0; i<n; i++)
		{
			a[i] = sc.nextInt();
		}
		test(a);
	}

}
