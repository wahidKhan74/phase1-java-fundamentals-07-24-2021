package com.simplilearn.collections.map.bankmap;

public class Account {
	//properties
		private long id;
		private String name;
		private double balance;
		
		
		public long getId() {
			return id;
		}
		public void setId(long id) {
			this.id = id;
		}
		public String getName() {
			return name;
		}
		public void setName(String name) {
			this.name = name;
		}
		public double getBalance() {
			return balance;
		}
		public void setBalance(double balance) {
			this.balance = balance;
		}
		
		public Account(long id, String name, double balance) {
			super();
			this.id = id;
			this.name = name;
			this.balance = balance;
		}
		public Account() {
			super();
		}
		
		@Override
		public String toString() {
			return "Account [id=" + id + ", name=" + name + ", balance=" + balance + "]";
		}
}
