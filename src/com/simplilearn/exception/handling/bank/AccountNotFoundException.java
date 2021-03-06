package com.simplilearn.exception.handling.bank;

public class AccountNotFoundException extends RuntimeException{
	
	String message;
	
	AccountNotFoundException(String message) {
		this.message = message;
	}

	@Override
	public String toString() {
		return "Account NotFound Exception [message=" + message + "]";
	}	

}
