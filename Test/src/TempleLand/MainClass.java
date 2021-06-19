package TempleLand;

import java.util.Scanner;

public class MainClass 
{

	public static void main(String[] args) 
	{
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		while(n>0)
		{
			int n1 = sc.nextInt();
			int a[] = new int [n1];
			for(int i=0; i<n; i++)
			{
				a[i] = sc.nextInt();
			}
			int c = 0;
			int total = 0;
			for(int i=n1/2; i<n1-1; i++)
			{
				if(a[i+1]-a[i]==1 && a[0]==1)
				{
					c++;
				}
			}
			for(int i=n1/2; i<n-1; i++)
			{
				if(a[i]-a[i+1]==1)
				{
					total++;
				}
			}
			if(c==n1/2 && total ==n1/2)
			{
				System.out.println("Yes");
			}
			else
			{
				System.out.println("No");
			}
			n--;
		}
		
	}

}
