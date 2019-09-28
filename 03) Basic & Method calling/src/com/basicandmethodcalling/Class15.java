package com.basicandmethodcalling;

class Rectangle {
	int length;
	int breath;
	void rectangle(int l, int b) {
		length=l;
		breath=b;
		}
	public int getArea() {
		return length*breath;
	}
}
class Class15{
	public static void main(String[] args) {
		Rectangle r=new Rectangle();
		r.rectangle(6, 7);
		System.out.println(r.getArea());
	}
}

