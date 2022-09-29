package org.tnsindia.packageexample;

import java.util.Scanner;

import org.tnsindia.packagedemo.PackageDemo;

public class PackageClient {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner s = new Scanner(System.in);
		System.out.println("Enter your name : ");
		String name = s.nextLine();
		PackageDemo d = new PackageDemo();
		
		d.str = name;
		d.display();
	}

}
