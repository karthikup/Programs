package Fibonaccciseries;

import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;
import java.util.Scanner;

public class MainClass {

	public static void main(String[] args) 
	{
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		sc.nextLine();
		while(n-->0)
		{
			String str = sc.nextLine();
			char a[] = str.toCharArray();
			HashMap<Character, Integer> map = new HashMap<Character, Integer>();
			for(char i : a)
			{
				if(map.containsKey(i))
				{
					map.put(i, map.get(i)+1);
				}
				else
				{
					map.put(i, 1);
				}
			}
			ArrayList<Integer> list = new ArrayList<Integer>();
			for(char i : map.keySet())
			{
				list.add(map.get(i));
			}
			boolean f = true;
			if(list.size()<3)
			{
				f = true;
			}
			else
			{
				Collections.sort(list);
			
				for(int i=2; i<list.size(); i++)
				{
					if(list.get(i) != list.get(i-1)+list.get(i-2))
					{
						f = false;
						break;
					}
				}
				if(!f)
				{
					f = true;
					int temp = list.get(0);
					list.set(0, list.get(0));
					list.set(1, temp);
					for(int i=2; i<list.size(); i++)
					{
						if(list.get(i) != list.get(i-1)+list.get(i-2))
						{
							f = false;
							break;
						}
					}
				}
			}
			if(f)
			{
				System.out.println("Dynamic");
			}
			else
			{
				System.out.println("Not");
			}
		}
		
	}

}
