/*Algorithm :
 * 
 * Abstraction type of Implementation 
 * 1.Object implementation layer : By generalizing the common methods in the implementation of the 
 * subclass to one common abstract class or interface.
 * 
 * 2.Object creation layer : It will create the object of any of the implementation class and will return the address 
 * of the created object.
 * 
 * 3.Object utilization layer : By using upCasted reference and call the generalize overridden methods of implementation class.
 * 
 * */

/* Pseudo code :
 * 
 * 1.Create the interface or abstract class.
 * 2.In that interface or abstract class create the generalized method.
 * 3.Implement(Override) the respective classes of the interface or abstract class.
 * 4.Create the separate class that will create the object of respective classes(Abstraction part of the program/application)
 * 5.Return the object of the respective classes to the main class or the server 
 * 6.Create the Object of the class(In this case Spring class) in the main class.
 * 7.Call the generalize overridden methods of implementation class. 
 * 
 * */ 

package Idandship;

import java.util.ArrayList;
import java.util.ListIterator;
import java.util.Scanner;

//This is by the approach of Abstraction type of implementation
interface IdAndShip//Interface 
{
	public void test();//abstract method
}

class BattleShip implements IdAndShip//class BattleShip implementing interface IdAndShip
{
	public void test()
	{
		System.out.println("BattleShip");
	}
}

class Cruiser implements IdAndShip//class Cruiser implementing interface IdAndShip
{
	public void test()
	{
		System.out.println("Cruiser");
	}
}

class Destroyer implements IdAndShip//class Destroyer implementing interface IdAndShip
{
	public void test()
	{
		System.out.println("Destroyer");
	}
}

class Frigate implements IdAndShip//class Frigate implementing interface IdAndShip
{
	public void test()
	{
		System.out.println("Frigate");
	}
}

class Spring//class Spring creating the object of the respective classes
{
	public void createObject(String type)
	{
		if(type.equalsIgnoreCase("b"))
		{
			IdAndShip i1 = new BattleShip();
			i1.test();
		}
		else if(type.equalsIgnoreCase("c"))
		{
			IdAndShip i2 = new Cruiser();
			i2.test();
		}
		else if(type.equalsIgnoreCase("d"))
		{
			IdAndShip i3 = new Destroyer();
			i3.test();
		}
		else
		{
			IdAndShip i4 = new Frigate();
			i4.test();
		}
	}
}
public class MainClass 
{

	public static void main(String[] args) 
	{
		
		String str;
		Scanner s1 = new Scanner(System.in);
		Scanner s2= new Scanner(System.in);
		Scanner s3 = new Scanner(System.in);
		Scanner s4 = new Scanner(System.in);
		Scanner s5 = new Scanner(System.in);
		
		int n = s1.nextInt();
		ArrayList List = new ArrayList(n);
		Spring s = new Spring();//creating the object of Spring class
		for(int i=0; i<n; i++)
		{
			str = s2.nextLine();
			List.add(str);
		}
		
		ListIterator itr = List.listIterator();
		while(itr.hasNext())
		{
			String string = (String)itr.next();
			if(itr.equals("b"))
			{
				s.createObject("b");
			}
			else if(itr.equals("c"))
			{
				s.createObject("c");			
			}
			else if(itr.equals("d"))
			{
				s.createObject("d");			
			}
			else
			{
				s.createObject("f");
			}
		}
		//Spring s = new Spring();//creating the object of Spring class
		/*IdAndShip a = s.createObject("b");//here the object of Spring class is returned if its instance is of type "b" or "B"
		a.test();//calling the generalized overridden methods of implementation class 
					//OR
		IdAndShip b = s.createObject("c");//here the object of Spring class is returned if its instance is of type "c" or "C"
		b.test();//calling the generalized overridden methods of implementation class
					//OR
		IdAndShip c = s.createObject("d");//here the object of Spring class is returned if its instance is of type "d" or "D"
		c.test();//calling the generalized overridden methods of implementation class
					//OR
		IdAndShip d = s.createObject("f");//here the object of Spring class is returned if its instance is of type "f" or "F"
		d.test();//calling the generalized overridden methods of implementation class*/
	}

}
