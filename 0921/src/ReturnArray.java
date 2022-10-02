/*
 * 소스파일: ReturnArray.java
 * 이화여대 컴퓨터공학전공 2071019 김한나
 * 배열 리턴하기
 * 메소드의 배열 리턴 : 배열의 레퍼런스를 리턴하는 것
 * - 메소드의 리턴 타입 = 리턴 받는 배열 타입
 * - 리턴 타입에 배열의 크기를 지정하지 않음
 */

public class ReturnArray {
	
	static int[] makeArray() {				//int형 배열을 리턴하는 메소드
		int temp[] = new int[4];			//배열 생성
		for(int i=0; i<temp.length; i++)
			temp[i]=i;						//배열 초기화
		return temp;			//배열 리턴
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int intArray[];						//배열 레퍼런스 변수 선언
		intArray = makeArray();				//메소드로부터 배열을 리턴받음
		for(int i=0; i<intArray.length; i++)
			System.out.print(intArray[i] + " ");		//배열의 모든 원소 출력
	}
}
