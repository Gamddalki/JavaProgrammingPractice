/*
 * 소스파일: ObjectPropertyEx.java
 * 이화여대 컴퓨터공학전공 2071019 김한나
 * Object 클래스로 객체 속성 알아내기
 * Object 클래스 : 모든 클래스의 수퍼클래스, 모든 클래스에 강제 상속, 모든 클래스가 가지는 객체 속성을 나타내는 메소드 보유
 */

class Point {
	private int x,y;
	public Point(int x, int y) {
		this.x=x;
		this.y=y;
	}
	public boolean equals(Object obj) {
		Point p = (Point) obj;
		if(x==p.x && y==p.y) return true;
		else return false;
	}
}

public class ObjectPropertyEx {
	public static void print(Object obj) {
		System.out.println(obj.getClass().getName());	//클래스 이름 출력
		System.out.println(obj.hashCode());				//해시코드 값 출력
		System.out.println(obj.toString());				//객체를 문자열로 만들어 출력
														//getClass().getName()@Integer.toHexString(HashCode())
														//객체+문자열이면 객체.toString()+문자열로 / 자신만의 toString으로 오버라이딩 가능
		System.out.println(obj);						//객체 출력
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Point a = new Point(2,3);
		Point b = new Point(2,3);
		Point c = new Point(3,4);
		
		print(a);
		
		if(a==b) System.out.println("a==b");					//둘의 레퍼런스를 비교 (false)
		if(a.equals(b)) System.out.println("a equals to b");	//객체의 내용이 같은지 비교 (true)
		if(a.equals(c)) System.out.println("a equals to c");	//(false)
	}

}
