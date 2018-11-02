package test;

import java.util.ArrayList;

public class Fruit
{
	String name;
	
	public Fruit(){}
	
	public String getName() 
	{
		return name;
	}
	
	public static void print1(ArrayList<Fruit> list)
	{
		for(Fruit f : list) 
		{
			System.out.println(f.getName());
		}
		
		list.add(new Fruit());
	}
	
	public static void print2(ArrayList<? extends Fruit> list)
	{
		for(Fruit f : list) 
		{
			System.out.println(f.getName());
		}
		
		list.add(new Fruit());
	}
	
}
