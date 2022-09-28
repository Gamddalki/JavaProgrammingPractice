/*
 * 소스파일: Shape.java
 * 이화여대 컴퓨터공학전공 2071019 김한나
 * 슈퍼클래스 Shape과 서브클래스 Line, Rect, Circle
 */

class Shape {
	public Shape next;
	public Shape() {
		next = null;
	}
	public void draw() {
		System.out.println("Shape");
	}
}

class Line extends Shape {
	public void draw() {				//메소드 오버라이딩
		System.out.println("Line");
	}
}

class Rect extends Shape{
	public void draw() {				//메소드 오버라이딩
		System.out.println("Rect");
	}
}

class Circle extends Shape {
	public void draw() {				//메소드 오버라이딩
		System.out.println("Circle");
	}
}