/*
 * 소스파일: Point.java
 * 이화여대 컴퓨터공학전공 2071019 김한나
 * 슈퍼클래스 Point
 */

class Point {
	private int x,y;		//한 점을 구성하는 x,y 좌표
	public Point() {					//기본생성자
		this.x = this.y = 0;
	}
	public Point(int x, int y) {		//생성자(x,y)
		this.x = x;
		this.y = y;						//서브클래스에서 super(x,y)로 선택
	}
	public void showPoint() {
		System.out.println("(" + x + "," + y + ")");		//점의 좌표 출력
	}
}
