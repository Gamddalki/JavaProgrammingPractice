/*
 * 소스파일: DataTypeEx.java
 * 이화여대 컴퓨터공학전공 2071019 김한나
 * 자바 데이터 타입 예제
 * 1. 정수 : int(4), byte(1), short(2), long(8)
 * 2. 실수 : double(8), float(4)
 * 3. 문자 : char(2) - 유니코드사용
 * 4. boolean : boolean(1) - 참거짓
 * 5. 문자열 : 클래스 String
 */

import java.lang.*;			//String 클래스 포함

public class DataTypeEx {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int intNum;
		double doubleNum;
		char charNum;
		boolean booleanNum;		//변수 선언
		String stringNum;		//클래스는 대문자로 선언, 이름 붙여 선언하여 object 만듦 -OOP(Object Oriented Programming)
		
		intNum=10_000;
		doubleNum=78.9;
		charNum='요';
		stringNum="기타리스트";
		booleanNum= 1>0;		//C와 달리 1,0을 참,거짓의 의미로 사용할 수 없음
		
		System.out.println("intNum = " + intNum);
		System.out.println("doubleNum = " + doubleNum);
		System.out.println("charNum = " + charNum);
		System.out.println("stringNum = " + stringNum);
		System.out.println("booleanNum = " + booleanNum);		//출력
		
		byte byteNum;
		short shortNum;
		long longNum;
		
		byteNum=127;
		shortNum=30000;
		longNum=77L;			//L 붙이지 않으면 4바이트로 인식함
		
		System.out.println("byteNum = " + byteNum);
		System.out.println("shortNum = " + shortNum);
		System.out.println("longNum = " + longNum);	
		
		final double PI = 3.141592;			//상수 선언
		
		System.out.println("PI = " + PI);
	}
}
