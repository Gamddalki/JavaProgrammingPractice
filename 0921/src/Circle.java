/*
 * 소스파일: Circle.java
 * 이화여대 컴퓨터공학전공 2071019 김한나
 * 클래스의 객체 생성 및 활용 예제
 * 클래스 : 객체를 편리하게 만들어내기 위한 틀 - 객체의 속성(state)/행동(behavior) 포함
 * (클래스 첫 글자 대문자)
 * 객체 : 클래스로 선언해 찍어낸 실체 - 우리가 원하는 것
 * 필드 : 변수
 * 메소드 : 함수
 * (메소드, 객체 첫 글자 소문자)
 * - 둘 중 하나만 있어도 클래스 / 만약 main 메소드가 있다면 자바프로그램
 */

public class Circle {
	int radius;			//원의 반지름 필드
	String name;		//원의 이름 필드
	
	public Circle() {}	//원의 생성자
	
	public double getArea() {
		return 3.14*radius*radius;			//원의 넓이 계산 메소드
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Circle pizza;
		pizza = new Circle();				//Circle 객체 생성
		pizza.radius = 10;					//피자의 반지름 = 10
		pizza.name = "자바피자";				//피자의 이름 = 자바피자
		double area = pizza.getArea();		//자바피자의 면적 계산
		System.out.println(pizza.name + "의 면적은 " + area);		//자바피자의 면적 출력
		
		Circle donut;
		donut = new Circle();				//Circle 객체 생성
		donut.radius = 2;					//도넛의 반지름 = 2
		donut.name = "자바도넛";				//도넛의 이름 = 자바도넛
		area = donut.getArea();				//자바도넛의 면적 계산
		System.out.println(donut.name + "의 면적은 " + area);		//자바도넛의 면적 출력
	}
}
