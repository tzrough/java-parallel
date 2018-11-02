package test;

import java.util.ArrayList;

import org.junit.Test;

public class App
{
	/*
	 * ArrayList<Fruit> print fruitlist
	 */
	@Test
	public void test1() 
	{
		ArrayList<Fruit> fruitList = new ArrayList<>();
		
		fruitList.add(new Apple());
		fruitList.add(new Orange());
		
		Fruit.print1(fruitList);
	}
	
	/*
	 * ArrayList<Fruit> print applelist
	 */
	@Test
	public void test2() 
	{
		ArrayList<Apple> appleList = new ArrayList<>();
		
		appleList.add(new Apple());
		appleList.add(new Apple());
		
		Fruit.print1(appleList);
	}
	
	/*
	 * ArrayList<? extends Fruit> print fruitList
	 */
	@Test
	public void test3() 
	{
		ArrayList<Fruit> fruitList = new ArrayList<>();
		
		fruitList.add(new Apple());
		fruitList.add(new Orange());
		
		Fruit.print2(fruitList);
	}
	
	/*
	 * ArrayList<? extends Fruit> print appleList
	 */
	@Test
	public void test4() 
	{
		ArrayList<Apple> appleList = new ArrayList<>();
		
		appleList.add(new Apple());
		appleList.add(new Apple());
		
		Fruit.print2(appleList);
	}
	
	
	@Test
	public void test5() 
	{
		ArrayList<Fruit> fruitList = new ArrayList<>();
		ArrayList<Apple> appleList = new ArrayList<>();
		
		fruitList.add(new Apple());
		fruitList.add(new Orange());	
		fruitList.add(new Fruit());	
		
		appleList.add(new Apple());
		appleList.add(new Orange());
		appleList.add(new Fruit());
		
	}
}
