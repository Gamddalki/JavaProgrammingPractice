/*
 * 소스파일: Hello.java
 * 이화여대 컴퓨터공학전공 2071019 김한나
 * 자바 프로그램의 기본 구조
 */

public class Hello {
	
	public static int sum(int n, int m) {
		return n+m;
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int i=20;
		int s;
		char a;
		
		s=sum(i,10);		//sum() 메소드 호출
		a='?';
		System.out.println(a);			//문자 '?' 출력
		System.out.println("Hello");	//문자열 "Hello" 출력
		System.out.println(s);			//정수 s값(=20+10) 출력
	}
}
