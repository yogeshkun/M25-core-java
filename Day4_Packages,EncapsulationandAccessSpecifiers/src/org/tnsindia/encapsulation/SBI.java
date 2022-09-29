package org.tnsindia.encapsulation;

//Encapsulation
public class SBI {
	private int pin_no;

	
	//Source -> generate getter and setters 
	// pin_no is private so to handle it in another class
	public int getPin_no() {
		return pin_no;
		
	}

	public void setPin_no(int pin_no) {
		this.pin_no = pin_no;
	}
	
}
