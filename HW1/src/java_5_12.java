/*
 * 소스파일: java_5_12.java
 * 이화여대 컴퓨터공학전공 2071019 김한나
 * 상속을 이용한 응용 만들기
 * p321 5장 12번
 */

import java.util.Scanner;

abstract class Shape {			//추상클래스 Shape
	   private Shape next;
	   public Shape() { next=null; }
	   public void setNext(Shape obj) { next=obj; }
	   public Shape getNext() { return next; }
	   public abstract void draw();
	}

class Line extends Shape {		//클래스 Line
	@Override
	public void draw() {
		System.out.println("Line");
	}
}
class Rect extends Shape {		//클래스 Rect
	@Override
	public void draw() {
		System.out.println("Rect");
	}
}
class Circle extends Shape {		//클래스 Circle
	@Override
	public void draw() {
		System.out.println("Circle");
	}
}

class GraphicEditor {		//클래스 GraphicEditor
	Shape head, tail, node;
	int count=0;			//전체 노드의 개수
	
	public void add(int shape) {		//삽입
		switch(shape) {
			case 1: 
				node = new Line(); 
				break;
			case 2: 
				node = new Rect();
				break;
			case 3:
				node = new Circle();
				break;
		}
		if(head == null)	//연결된 노드가 없는 경우
			head = tail = node;
		else {				//연결된 노드가 있는 경우 현재의 마지막 노드와 연결 후 마지막 노드를 node로 업데이트
			tail.setNext(node);
			tail = node;
		}
		count++;			//전체 노드개수 +1
	}
	
	public void delete(int index) {			//삭제
		Shape n = head;
		if(index<1 || index>count)			//삭제할 수 없는 경우
			System.out.println("삭제할 수 없습니다.");
		else if(index == 1) {				//헤드 노드 삭제 시
			head = n.getNext();		//두번째 노드로 헤드 노드 변경
		}
		else if(index==count) {				//마지막 노드 삭제 시
			for(int i=0; i<index-1; i++)
				n = n.getNext();				 //삭제하고자 하는 노드의 이전노드로 이동
			n=tail;					 			//이전 노드를 tail로 변경
		}
		else {
			for(int i=0; i<index-1; i++)
				n = n.getNext();				 //삭제하고자 하는 노드의 이전노드로 이동
			n.setNext(n.getNext().getNext());	 //다음다음 노드와 연결 (삭제하고자 한 노드와의 연결이 사라짐)
		}
		count--;			//전체 노드개수 -1
	}
	
	public void showAll() {				//모두 보기
		Shape n = head;
		for(int i=0; i<count; i++) { 
			n.draw();
			n = n.getNext();
		}
	}
	
	public void exit() {			//종료
		System.out.println("beauty을 종료합니다.");
	}
}

public class java_5_12 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scanner = new Scanner(System.in);
		GraphicEditor ge = new GraphicEditor();
		boolean run = true;
		//전공 학번 이름 출력
		System.out.println("이화여대 컴퓨터공학전공 2071019 김한나");
		
		System.out.println("그래픽 에디터 beauty을 실행합니다.");
		while(run) {
			System.out.print("삽입(1), 삭제(2), 모두 보기(3), 종료(4)>>");
			int input = scanner.nextInt();
			
			switch(input) {
			case 1:		//삽입
				System.out.print("Line(1), Rect(2), Circle(3)>>");
				int shape = scanner.nextInt();
				ge.add(shape);
				break;
			case 2:		//삭제
				System.out.print("삭제할 도형의 위치>>");
				int x = scanner.nextInt();
				ge.delete(x);
				break;
			case 3:		//모두 보기
				ge.showAll();
				break;
				
			case 4:		//종료
				ge.exit();
				run=false;
				break;
			}
		}
		scanner.close();
	}
}
