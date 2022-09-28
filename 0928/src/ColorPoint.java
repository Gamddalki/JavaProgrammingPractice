/*
 * 소스파일: ColorPoint.java
 * 이화여대 컴퓨터공학전공 2071019 김한나
 * 서브클래스 ColorPoint
 */

class ColorPoint extends Point {
	private String color;								//점의 색
	public ColorPoint(int x, int y, String color) {
		super(x,y);							// Point의 생성자 Point(x,y) 호출 (x=5, y=6 전달)
		this.color = color;
	}
	public void showColorPoint() {			//컬러 점의 좌표 출력
		System.out.print(color);
		showPoint();						//Point 클래스의 showPoint() 호출
	}
}
