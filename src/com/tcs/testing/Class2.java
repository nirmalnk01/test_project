package com.tcs.testing;

public class Class2 extends Test_Class{

	@Override
	public void name() {
		super.name();
	}
	
	@Override
	public void age() {
		super.age();
	}
	
	@Override
	void number() {
		super.number();
	}
	public static void main(String[] args) {
		Class2 n = new Class2();
		n.name();
		n.age();
		n.number();
	}
	
}
