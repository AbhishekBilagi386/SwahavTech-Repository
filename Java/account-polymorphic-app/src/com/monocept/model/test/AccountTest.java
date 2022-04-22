package com.monocept.model.test;

import com.monocept.model.Account;
import com.monocept.model.CurrentAccount;
import com.monocept.model.SavingsAccount;

public class AccountTest {

	public static void main(String[] args) {
		SavingsAccount sa = new SavingsAccount(100, "ramya", 1000);
		CurrentAccount ca = new CurrentAccount(105,"Asha",500);
		printDetails(sa);
		printDetails(ca);
		System.out.println();
		Account account[] = new Account[]
				{
					new SavingsAccount(101,"Abhi",2000),
					new CurrentAccount(102,"Zawed",3000),
					new CurrentAccount(103,"Himanshu",4000),
					new SavingsAccount(104,"Rohan",5000)
						
				};
		for(Account obj: account){
			printDetails(obj);
			}
	}

	private static void printDetails(Account account) {
		System.out.println("Account number: "+account.getAccountNum()+" Name: "+account.getName()+
				" balance:"+account.getBalance()+" Account type: "+account.getClass().getSimpleName());
	}

}
