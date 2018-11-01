package com.tzrough.thread.shareobj;

public class Bank
{

	public static void main(String[] args)
	{
		BankAccount bankAccount = new BankAccount("张三");

		Draw draw = new Draw(bankAccount);
		Save save = new Save(bankAccount);
		
		save.setMoney(10);
		draw.setMoney(1);
		
		Thread saveThread = new Thread(save);
		Thread drawThread = new Thread(draw);
		
		drawThread.start();
		saveThread.start();
	}
	
}
