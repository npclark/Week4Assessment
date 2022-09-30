/**
 * @author Noah Clark - npclark
 * CIS175 Spring 2022
 * Feb 10, 2022
 */
package model;

public class squaredNumber {
	
	private double numInput;
	private double numSquare;

	public squaredNumber() {
		super();
		// TODO Auto-generated constructor stub
	}
	public squaredNumber(double numInput) {
		super();
		this.numInput = numInput;
		math(numInput);
	}
	
	public void math(double numInput) {
		setNumSquare(numInput * numInput);
	}
	
	/**
	 * @return the numInput
	 */
	public double getNumInput() {
		return numInput;
	}
	/**
	 * @return the numSquare
	 */
	public double getNumSquare() {
		return numSquare;
	}
	/**
	 * @param numInput the numInput to set
	 */
	public void setNumInput(double numInput) {
		this.numInput = numInput;
		math(numInput);
	}
	/**
	 * @param numSquare the numSquare to set
	 */
	public void setNumSquare(double numSquare) {
		this.numSquare = numSquare;
	}
	@Override
	public String toString() {
		return "squaredNumber [numInput=" + numInput + ", numSquare=" + numSquare + "]";
	}
	
	
}
