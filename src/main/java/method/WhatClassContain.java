package method;

public class WhatClassContain {

	
	/*
	 * Class contain 5 things
	 * variables
	 * method
	 * constructor
	 * static block
	 * instance block
	 */
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub

		System.out.println("hello main");
		//method calling == class name variableName= new class name();
		WhatClassContain wcc= new WhatClassContain();
		wcc.login(); wcc.messanger();
		wcc.messanger();
		
		//rule of execution
		//top to bottom
		//left to right 
		
		
	}

	public void login() {
		System.out.println("hello login");
	}
	/*
	 * Instance area
	 */
	public static void messanger() {
		System.out.println("hello messanger");
	}
	
	
	
}
