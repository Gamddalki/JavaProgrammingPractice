/*
 * 소스파일: ScannerEx.java
 * 이화여대 컴퓨터공학전공 2071019 김한나
 * scanner를 이용한 키 입력 연습
 */

import java.util.Scanner;		//import문이 필요함

public class ScannerEx {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		System.out.println("이름, 도시, 나이, 키, 재학 여부를 빈칸으로 분리하여 입력하세요.");
		Scanner scanner = new Scanner(System.in);			//scanner 객체 생성
		
		String name = scanner.next();		//문자열 읽기
		System.out.print("이름은 " + name + ", ");
		
		String city = scanner.next();
		System.out.print("도시는 " + city + ", ");
		
		int age = scanner.nextInt();		//정수 읽기
		System.out.print("나이는 " + age + ", ");
		
		double height = scanner.nextDouble();		//실수 읽기
		System.out.print("키는 " + height + ", ");
		
		boolean school = scanner.nextBoolean();			//논리값 읽기
		System.out.println("재학 여부는 " + school + "입니다.");
		
		scanner.close(); 			//scanner 닫기
	}
}
