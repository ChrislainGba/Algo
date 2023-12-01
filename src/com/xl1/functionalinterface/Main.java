package com.xl1.functionalinterface;

public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Calculator soustract = (a,b) -> b-a;
		Calculator addition = Main::add;
		
		var resAdd = addition.calculate(3, 7);
		var resSus = soustract.calculate(4, 6);
		
		System.out.println(resAdd);
		System.out.println(resSus);

	}
	public static int add(int a, int b) {
		return a+b;
	}

}
