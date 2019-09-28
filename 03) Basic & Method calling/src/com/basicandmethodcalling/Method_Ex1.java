package com.basicandmethodcalling;

	class Class12 {
		int x = 10, y = 20;
		float z;

		void add() {
			z = x + y;
			display(z);
		}

	void sub() {
		z = x - y;
		display(z);
	}

	void mul() {
		z = x * y;
		display(z);
	}

	void div() {
		z = x / y;
		display(z);
	}
	private void display(float ans) {
		//TODO auto generated method stub
		System.out.println(ans);
	}
}
public class Method_Ex1 {
	public static void main(String[] args) {
		Class12 obj=new Class12();
		obj.add();
		obj.sub();
		obj.mul();
		obj.div();
		
	}
}
