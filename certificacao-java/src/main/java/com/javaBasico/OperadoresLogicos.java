package com.javaBasico;

public class OperadoresLogicos {
	public static void main(String[] args) {
		incemento();
	}
	
	static void incemento() {
		int a = 5;
		
		int i = ++a;
		int x = a++;
		
		System.out.println(i);
		System.out.println(x);
	}
}
