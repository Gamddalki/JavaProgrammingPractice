/*
 * 소스파일: ArrayException.java
 * 이화여대 컴퓨터공학전공 2071019 김한나
 * 자바의 예외 처리 예시 - 범위를 벗어난 배열의 접근
 * 예외 : 실행 중 발생한 오류 (컴파일 오류는 컴파일 도중 발견되는 오류)
 * - 예외 처리를 하지 않을 시 응용프로그램은 강제 종료됨
 * - 예외처리 : try-catch-finally문
 * - try : 예외가 발생할 가능성이 있는 실행문
 * - catch : 예외 처리문
 * - finally : 생략가능, 예외 발생 여부와 관계없이 무조건 실행되는 문장
 */

public class ArrayException {
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] intArray = new int[5];
		intArray[0] = 0;
		try {
			for(int i=0; i<5; i++) {
				intArray[i+1] = i+1 + intArray[i];
				System.out.println("intArray[" + i + "]=" + intArray[i]);
			}
		}
		catch(ArrayIndexOutOfBoundsException e) {
			System.out.println("배열의 인덱스가 범위를 벗어났습니다.");			//i가 4일 때 배열의 인덱스가 범위를 벗어나며 예외 발생
		}
	}

}
