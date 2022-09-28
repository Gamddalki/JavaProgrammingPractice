/*
 * 소스파일: AutoBoxingUnboxingEx.java
 * 이화여대 컴퓨터공학전공 2071019 김한나
 * 박싱 언박싱
 * 박싱 : 기본 타입의 값을 Wrapper 객체로 변환
 * 언박싱 : Wrapper 객체에 들어 있는 기본 타입의 값을 빼내는 것
 * - Integer ten = 10; -> Integer ten = Integer.valueOf(10); 로 자동 박싱
 * - int n = ten; -> int n = ten.intValue(); 로 자동 언박싱
 */

public class AutoBoxingUnboxingEx {
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int n = 10;
		Integer intObject = n;								//자동 박싱
		System.out.println("intObject = " + intObject);
		
		int m = intObject + 10;								//자동 언박싱
		System.out.println("m = " + m);

	}

}
