package com.basicandmethodcalling;

	class Class10{
		boolean a=true;
		void check() {
			if(a==true) {
				a=false;
				System.out.println("The Boolean Value is" +a);
			}
		}
	}
	public class DataType_Boolean {
	public static void main(String[] args) {
		Class10 obj=new Class10();
		obj.check();
		
	}
	

}
