package com.simplilearn.exception.handling.bank;

public class InvalidTxException extends Exception{
	
	String message;
	
	InvalidTxException(String message) {
		this.message = message;
	}

	@Override
	public String toString() {
		return "Invalid Tx Exception [message=" + message + "]";
	}	

}
