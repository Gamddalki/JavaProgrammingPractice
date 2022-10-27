/*
 * 소스파일: java_4_2.java
 * 이화여대 컴퓨터공학전공 2071019 김한나
 * 간단한 클래스 만들기, scanner 활용
 * p241 4장 2번
 */

import java.util.Scanner;

class Grade {		//Grade 클래스
	private int math, science, english;
	
	public Grade(int math, int science, int english) {		//x,y,width,height을 매개변수로 받아 필드를 초기화하는 생성자
		this.math=math;
		this.science=science;
		this.english=english;
	}
	
	public int average() {		//성적 평균을 리턴하는 함수
		return(math+science+english)/3;
	}
}

public class java_4_2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scanner = new Scanner(System.in);
		//전공 학번 이름 출력
		System.out.println("이화여대 컴퓨터공학전공 2071019 김한나");
		
		System.out.print("수학, 과학, 영어 순으로 3개의 점수 입력>>");
		int math = scanner.nextInt();
		int science = scanner.nextInt();
		int english = scanner.nextInt();
		
		Grade me = new Grade(math, science, english);
		System.out.println("평균은 " + me.average());
		
		scanner.close();
	}

}
