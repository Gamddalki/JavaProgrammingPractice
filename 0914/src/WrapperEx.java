/*
 * 소스파일: WrapperEx.java
 * 이화여대 컴퓨터공학전공 2071019 김한나
 * Wrapper 클래스 활용
 * Wrapper : 자바의 기본 타입을 클래스화한 것
 * - 기본 타입의 값을 객체로 다룰 수 있게 함
 * - 다양한 메소드 활용 가능
 */

public class WrapperEx {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println(Character.toLowerCase('A'));		//'A'를 소문자로 변환
		char c1 = '4', c2 = 'F';
		if(Character.isDigit(c1))
			System.out.println(c1 + "는 숫자");				//c1이 숫자일 경우 출력
		if(Character.isAlphabetic(c2))
			System.out.println(c2 + "는 영문자");				//c2가 영문자일 경우 출력
		
		System.out.println(Integer.parseInt("-123"));		//문자열 "-123"을 10진수로 변환
		System.out.println(Integer.toHexString(28));		//정수 28을 16진수 문자열로 변환
		System.out.println(Integer.toBinaryString(28));		//정수 28을 2진수 문자열로 변환
		System.out.println(Integer.bitCount(28));			//정수 28에 대한 2진수 1의 개수
		
		Double d = Double.valueOf(3.14);					//기본 타입의 값으로 Wrapper 객체 생성
		System.out.println(d.toString());					//Double을 문자열 "3.14"로 변환
		System.out.println(Double.parseDouble("3.14"));		//문자열을 실수 3.14로 변환
		
		boolean b = (4>3);									//b = true
		System.out.println(Boolean.toString(b));			//true를 문자열 "true"로 변환
		System.out.println(Boolean.parseBoolean("false"));	//문자열을 "false"로 변환

	}
}