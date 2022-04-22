
package com.monocept.model;

public class InsufficientFundsException extends RuntimeException {

	private static final long serialVersionUID = 1L;
	private String detailMessage;

	public InsufficientFundsException(Account acc) {
		detailMessage = ("Account holder" + acc.getAccountNum() + " named " + acc.getName()
				+ " tried to withdraw money but he has only " + acc.getBalance()
				+ "  So he cant able to withdraw the money as the withdrawing money exceeds the minimum balance.");
		getMessage();

	}

	@Override
	public String getMessage() {
		return detailMessage;
	}

}
