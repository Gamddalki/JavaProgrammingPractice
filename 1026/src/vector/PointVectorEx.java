/*
 * 소스파일: VectorEx.java
 * 이화여대 컴퓨터공학전공 2071019 김한나
 * point 클래스만 다루는 Vector<Point> 컬렉션 활용
 */

package vector;

import java.util.Vector;

class Point {		//Point 클래스만 삽입이 가능
	private int x,y;
	public Point(int x, int y) {
		this.x=x;
		this.y=y;
	}
	public String toString() {
		return "(" + x + "," + y + ")";
	}
}

public class PointVectorEx {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Vector<Point> v = new Vector<Point>();		//Point 객체를 요소로만 가지는 제네릭 벡터 생성
		
		//3개의 객체 요소 삽입
		v.add(new Point(2,3));
		v.add(new Point(-5,20));
		v.add(new Point(30,-8));
		
		//인덱스가 1인 (-5,20) 삭제
		v.remove(1);
		
		//벡터의 전체 요소 출력
		for(int i=0; i<v.size(); i++) {
			Point p = v.get(i);
			System.out.println(p);
		}

	}

}
