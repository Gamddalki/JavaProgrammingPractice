/*
 * 소스파일: BookArray.java
 * 이화여대 컴퓨터공학전공 2071019 김한나
 * 객체 배열 만들기 연습
 * Circle[] c;			//배열 선언
 * c = new Circle;		//배열 생성
 * for(int i=0; i<c.length; i++)
 * 	c[i] = new Circle(i)		//원소 객체 생성
 */

import java.util.Scanner;

public class BookArray {
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Book [] book = new Book[3];			//Book 배열 선언 및 생성
		
		Scanner scanner = new Scanner(System.in);
		for(int i=0; i<book.length; i++) {
			System.out.print("제목: ");
			String title = scanner.nextLine();			//제목 입력받기
			System.out.print("저자: ");
			String author = scanner.nextLine();			//저자 입력받기
			book[i] = new Book(title, author);			//배열 원소 객체 생성
		}
		
		for(int i=0; i<book.length; i++)
			System.out.println("(" + book[i].title + ", " + book[i].author + ")");			//배열 출력
		
		scanner.close();
	}
}
