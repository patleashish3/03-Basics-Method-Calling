package com.basicandmethodcalling;

class MainClass1 {
	int a = 10;
	float f = (float) 2.1;
	String str = "Ashish Patle";

	public void display() {
		System.out.println("The integer value is" + a);
		System.out.println("The float value is" + f);
		System.out.println("The String value is" + str);

	}

}
public class Class_Example_1  {
	public static void main(String[] args) {
		MainClass1 obj=new MainClass1();
		obj.display();
	}


}
