package o;
/*
 * 소스파일: java_5_14.java
 * 이화여대 컴퓨터공학전공 2071019 김한나
 * 인터페이스에 대한 이해와 클래스 구현
 * p322 5장 14번
 */

interface Shape {
   final double PI = 3.14;
   void draw();
   double getArea();
   default public void redraw() {
      System.out.print("--- 다시 그립니다. ");
      draw();
   }
}

class Circle implements Shape {		//클래스 circle
   private int radius;
   public Circle(int radius) {		//radius 값을 매개변수로 받아 필드를 초기화하는 생성자
      this.radius = radius;
   }
   @Override
   public void draw() {
      System.out.println("반지름이 " + radius + "인 원입니다.");
   }
   @Override
   public double getArea() {
      return PI*radius*radius;
   }
}

class Oval implements Shape {		//클래스 oval
   private int a, b;
   public Oval(int a, int b) {		//a,b 값을 매개변수로 받아 필드를 초기화하는 생성자
      this.a  = a;
      this.b = b;
   }
   @Override
   public void draw() {
      System.out.println(a + "x" + b + "에 내접하는 타원입니다.");
   }
   @Override
   public double getArea() {
      return PI*a*b;
   }
}

class Rect implements Shape {		//클래스 rect
   private int a, b;
   public Rect(int a, int b) {		//a,b 값을 매개변수로 받아 필드를 초기화하는 생성자
      this.a  = a;
      this.b = b;
   }
   @Override
   public void draw() {
      System.out.println(a + "x" + b + "크기의 사각형 입니다.");
   }
   @Override
   public double getArea() {
      return a*b;
   }
}

public class java_5_14 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//전공 학번 이름 출력
		System.out.println("이화여대 컴퓨터공학전공 2071019 김한나");
		
		Shape [] list = new Shape[3];
	    list[0] = new Circle(10);
	    list[1] = new Oval(20, 30);
	    list[2] = new Rect(10, 40);
	    for(int i=0; i<list.length; i++) list[i].redraw();
	    for(int i=0; i<list.length; i++) System.out.println("면적은 "+ list[i].getArea());
	}

}
