/*
 * 소스파일: ArrayLength.java
 * 이화여대 컴퓨터공학전공 2071019 김한나
 * 배열 원소의 평균 구하기
 * 배열 : 같은 타입의 데이터들을 인덱스(0부터 시작)에 따라 순차적으로 저장
 * - 배열 선언 : int intArray[]; (타입, 변수명, 선언)
 * - 배열 생성 : intArray = new int [5]; (변수명, 생성, 타입, 원소개수)
 * - 초기화하며 생성 : int intArray[] = {0,1,2,3,4};
 * - 하나의 배열을 다수의 레퍼런스가 참조 가능
 * - 배열은 자바에서 객체로 관리됨 -> 객체 내 length 필드는 배열의 크기를 나타냄
 */

import java.util.Scanner;

public class ArrayLength {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int intArray[] = new int[5];		//배열의 선언과 생성
		int sum = 0;
		
		Scanner scanner = new Scanner(System.in);
		System.out.print(intArray.length + "개의 정수를 입력하세요 >>");
		for(int i=0; i<intArray.length; i++)						//for문은 배열과 묶음으로 생각하자, 보통은 while문 사용함
			intArray[i] = scanner.nextInt();
		
		for(int i=0; i<intArray.length; i++)
			sum += intArray[i];										//배열에 저장된 정수 값 더하기
		
		System.out.println("평균은 " + (double)sum/intArray.length);	//double 형으로 강제 타입 변환
		scanner.close();
	}
}
