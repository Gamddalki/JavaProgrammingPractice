/*
 * 소스파일: PhoneBook.java
 * 이화여대 컴퓨터공학전공 2071019 김한나
 * 2개의 클래스 만들기, 객체 배열 다루기
 * p245 4장 8번
 */

import java.util.Scanner;

class Phone {						//Phone 클래스
	private String name, tel;		//이름, 전화번호 필드
	
	Phone(String name, String tel){		//name, tel값을 매개변수로 받아 필드를 초기화하는 생성자
		this.name=name;
		this.tel=tel;
	}
	
	public String getName() {		//이름 리턴
		return name;
	}
	public String getTel() {		//전화번호 리턴
		return tel;
	}
}

public class PhoneBook {		//예시와 같이 작동하는 PhoneBook 클래스

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scanner = new Scanner(System.in);
		//전공 학번 이름 출력
		System.out.println("이화여대 컴퓨터공학전공 2071019 김한나");
		
		System.out.print("인원수>>");
		int num = scanner.nextInt();
		Phone[] phone = new Phone[num];		//저장한 사람의 수를 입력받아 Phone 객체 배열 생성
		for(int i=0; i<num; i++) {
			System.out.print("이름과 전화번호(이름과 번호는 빈 칸없이 입력)>>");
			String name = scanner.next();
			String tel = scanner.next();
			phone[i] = new Phone(name, tel);		//배열에 객체 요소 저장(한 사람의 정보는 하나의 Phone 객체에 저장)
		}
		System.out.println("저장되었습니다...");
		
		while(true) {
			System.out.print("검색할 이름>>");
			String name = scanner.next();
			if(name.equals("그만"))
				break;					//"그만"을 입력하면 프로그램 종료
			for(int i=0; i<num; i++) {
				if(name.equals(phone[i].getName())) {
					System.out.println(phone[i].getName() + "의 번호는 " + phone[i].getTel() + " 입니다.");
					break;			//번호가 있을 경우 번호 출력
				}
				if(i+1==num)
					System.out.println(name + " 이 없습니다.");		//없을 경우 없습니다 출력
			}
			
		}
		scanner.close();
	}
}
