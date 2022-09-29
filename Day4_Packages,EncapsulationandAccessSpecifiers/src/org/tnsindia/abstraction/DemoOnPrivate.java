package org.tnsindia.abstraction;

class A {
	private float salary;

	public float getSalary() {
		return salary;
	}

	public void setSalary(float salary) {
		this.salary = salary;
	}
	
}

public class DemoOnPrivate {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		A a = new A();
		a.setSalary(2000);
		System.out.println("Salary is "+a.getSalary());
	}

}
