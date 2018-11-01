package com.tzrough.thread.shareobj;

public class BankAccount
{
	private String name;
	public int money;
	
	public BankAccount(String name)
	{
		this.name = name;
	}
	
	public void checkBalance() 
	{
		System.out.println("账户余额为" + money);
	}
	
}
