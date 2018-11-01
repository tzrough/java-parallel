package com.tzrough.thread.shareobj;

public class Save implements Runnable
{

	private BankAccount bankAccount;
	private int money;
	
	public Save(BankAccount bankAccount)
	{
		this.bankAccount = bankAccount;
	}
	
	@Override
	//public void run()
	public synchronized void run()
	{
		
		System.out.println("---  账户余额为" + bankAccount.money + ", 将执行存款操作  ---");
		
		if(money <= 0) 
		{
			System.out.println("请设置正确的存款金额");
		}
		
		bankAccount.money+=money;
		
		System.out.println("---  存款操作执行完成, 存款" + money + ", 账户余额为" + bankAccount.money +  "  ---");
	}

	
	public int getMoney()
	{
		return money;
	}

	public void setMoney(int money)
	{
		this.money = money;
	}
	
}
