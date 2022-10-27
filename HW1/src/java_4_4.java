/*
 * 소스파일: java_4_4.java
 * 이화여대 컴퓨터공학전공 2071019 김한나
 * 간단한 클래스 만들기, scanner 활용
 * p242 4장 4번
 */

class Rectangle {
	private int x, y, width, height;		//x, y, width, height 필드 (사각형을 구성하는 점과 크기 정보)
	
	Rectangle(int x, int y, int width, int height){		//x, y, width, height 값을 매개변수로 받아 필드를 초기화하는 생성자
		this.x=x;
		this.y=y;
		this.width=width;
		this.height=height;
	}
	
	public int square() {		//사각형 넓이 리턴
		return width*height;
	}
	
	public void show() {		//사각형의 좌표와 넓이를 화면에 출력
		System.out.println("(" + x + "," + y + ")에서 크기가 " + width + "x" + height +"인 사각형");
	}
	
	boolean contains(Rectangle r) {		//매개변수로 받은 r이 현 사각형 안에 있으면 true 리턴
		if(x<r.x && x+width>r.x+r.width && y<r.y && y+height>r.y+r.height)
			return true;
		return false;
	}
}

public class java_4_4 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//전공 학번 이름 출력
		System.out.println("이화여대 컴퓨터공학전공 2071019 김한나");
		
		Rectangle r = new Rectangle(2,2,8,7);
		Rectangle s = new Rectangle(5,5,6,6);
		Rectangle t = new Rectangle(1,1,10,10);
		
		r.show();
		System.out.println("s의 면적은 " + s.square());
		if(t.contains(r)) System.out.println("t는 r을 포함합니다.");
		if(t.contains(s)) System.out.println("t는 s를 포함합니다.");		
	}
}
