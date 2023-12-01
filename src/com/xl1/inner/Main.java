package com.xl1.inner;

import com.xl1.inner.A.B;

class A{
	static class B extends A{
		public void f1(int j) {
			System.out.println("valeur entiere :"+(j+1));
		}
	}
	public void f1(int i) {
		System.out.println("valeur entiere :"+(i+2));
	}
}
public class Main {
	public static void main(String[] args) {
		B b = new A.B();
		b.f1(1);
		A a = new A.B();
		a.f1(1);
		
		int i =1;
		System.out.println("valeur de i :"+(++i));
		String s1 = "valeur" ;
		String s2 = new String("valeur");
		System.out.println(s1 == s2);
		System.out.println(System.identityHashCode(s2));
		System.out.println(System.identityHashCode(s1));
	}
}
