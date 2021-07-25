package com.simplilearn.accessmodifiers.bank;

public class BankLocker {

	public static void main(String[] args) {
		
		Account account = new Account();
		account.email ="john@gmail.com";
		account.gender ="male";
		
		System.out.println("The Locker Bank : " + account.bankName);
		// System.out.println(" The Locker No " + account.accNo);
		// System.out.println(" The Locker Pin " + account.accPin);
		 System.out.println("The Locker Type : " + account.accType);
		 System.out.println("The Acc user email : " + account.email);
		 System.out.println("The Acc user gender : " + account.gender);
		 account.showAccount();
		 

	}

}


class Account {
	
	public String bankName ="Iron Bank";
	private long accNo =2344343;
	private int accPin = 2393;
	protected String accType ="current";
	String email ;
	String gender;
	
	public void showAccount() {
		System.out.println("Acc No  : "+accNo +" Acc Pin :"+accPin);
	}
	
	
}