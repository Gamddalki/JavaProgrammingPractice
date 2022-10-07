/*
 * 소스파일: ArrayParameterEx.java
 * 이화여대 컴퓨터공학전공 2071019 김한나
 * 인자로 배열이 전달되는 예시
 * 메소드 : 반드시 클래스 내에 있어야 함 (캡슐화 원칙)
 * 인자 전달 방식
 * 1. 값이 복사되어 전달 : 기본 타입의 값 전달 (실인자값 변경 x)
 * 2. 레퍼런스가 전달 : 객체, 배열의 전달 (실인자값 변경 ㅇ)
 */

public class ArrayParameterEx {
	
	static void replaceSpace(char a[]) {
		for(int i=0; i<a.length; i++)
			if(a[i]==' ')				//" "는 String, ' '는 character
				a[i]=',';
	}
	
	static void printCharArray(char a[]) {
		for(int i=0; i<a.length; i++)
			System.out.print(a[i]);
		System.out.println();
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		char c[] = {'T', 'h', 'i', 's', ' ', 'i', 's', ' ', 'a', ' ', 'p', 'e', 'n', '.'};
		printCharArray(c);
		replaceSpace(c);
		printCharArray(c);
	}
}
