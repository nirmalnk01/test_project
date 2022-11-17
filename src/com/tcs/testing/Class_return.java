package com.tcs.testing;

public class Class_return {
	
public void first_Num() {
int a = 10;
System.out.println(a);

}

public int second_Num() {
int b = 200;
return b;
}


public static void main(String[] args) {
Class_return n = new Class_return();
n.first_Num();

int second_Num = n.second_Num();
System.out.println(second_Num*2);
	
}

	
	

}
