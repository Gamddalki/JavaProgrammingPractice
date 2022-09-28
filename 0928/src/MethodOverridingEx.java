/*
 * 소스파일: MethodOverridingEx.java
 * 이화여대 컴퓨터공학전공 2071019 김한나
 * 메소드 오버라이딩으로 다형성 실현
 * 오버라이딩 : 슈퍼클래스의 메소드를 서브클래스에서 재정의(메소드명, 매개변수 타입 및 개수, 리턴 타입 등 모두 동일하게 작성)
 * - 하나의 인터페이스(같은 이름)에 서로 다른 내용을 구현 -> 다형성 실현 (실행중에 실현됨 /vs. 오버로딩은 컴파일 중 다형성 실현(정적바인딩/super()도 정적바인딩임))
 * - 동적바인딩 발생 (오버라이딩 된 메소드가 무조건 실행됨)
 */

public class MethodOverridingEx {
	static void paint(Shape p) {
		p.draw();				//p가 가리키는 객체 내 오버라이딩 된 draw()를 호출하는 메소드
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Line line = new Line();
		paint(line);			//서브클래스 레퍼런스로 오버라이딩 된 메소드 호출 (동적바인딩)
		paint(new Shape());
		paint(new Line());		//동적바인딩
		paint(new Rect());		//동적바인딩
		paint(new Circle());	//동적바인딩
	}

}
