package com.monocept.model;

public class CellOccupiedException extends Exception {
	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;

	public CellOccupiedException(String errorMessage) {
		super(errorMessage);
	}
}
