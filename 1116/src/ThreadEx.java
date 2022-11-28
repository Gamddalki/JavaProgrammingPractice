/*
 * 소스파일: ThreadEx.java
 * 이화여대 컴퓨터공학전공 2071019 김한나
 * Thread를 상속받아 숫자 , 문자 , 숫자 + 문자 스레드 동시에 run 하기
 * 멀티태스킹 : 하나의 응용프로그램이 여러 개의 작업(태스크)을 동시에 처리함
 * 스레드 : JVM에 의해 스케줄링되어 실행되는 코드 단위 (스레드의 생명주기는 JVM에 의해 관리됨)
 *  - 한 스레드에서 다른 스레드 강종 가능
 *  	- 한 번 종료한 스레드는 다시 시작 불가 -> 다시 스레드 객체를 생성해 th.start()해야 함
 *  - 자바는 멀티스레딩에 의한 멀티태스킹만 가능
 *  	- 멀티스레딩 : 한 스레드가 대기하는 동안 다른 스레드 실행 -> 프로그램 전체적으로 시간 지연을 줄임
 *  + 하나의 JVM은 하나의 응용프로그램만 실행
 *  + 하나의 응용프로그램은 여러 개의 스레드로 구성 가능
 *  + 자바응용프로그램이 시작될 때 JVM이 함께 실행됨
 *  + 자바응용프로그램이 종료하면 JVM도 함께 종료함
 *  
 *  - 스레드 작성의 두 가지 방법
 *  	1. java.lang.Thread 클래스 이용 - 스레드 객체 생성, th.start()로 스레드 작동 시작
 *  		extends Thread
 *  		@Override
 *  		public void run()	//여기서 스레드 실행 시작, run() 종료 시 스레드도 종료
 *  	2. java.lang.Runnnable 인터페이스 이용
 */

import java.util.*;

class numThread extends Thread {
	private int n;
	
	public numThread(int n) {
		this.n=n;
	}
	
	@Override
	public void run() {
		while(true) {
			System.out.println("1번 스레드 : " + n);
			n+=3;
			try {
				sleep(1000);
			} catch(InterruptedException e) {
				return;
			}
		}
	}
}

class strThread extends Thread {
	private String str;
	
	public strThread(String str) {
		this.str=str;
	}
	
	@Override
	public void run() {
		while(true) {
			System.out.println("2번 스레드 : " + str);
			try {
				sleep(2000);
			} catch(InterruptedException e) {
				return;
			}
		}
	}
}

class bothThread extends Thread {
	private int n;
	private String str;
	
	public bothThread(int n, String str) {
		this.n=n;
		this.str=str;
	}
	
	@Override
	public void run() {
		while(true) {
			System.out.println("3번 스레드 : " + n + " " + str);
			try {
				sleep(1500);
			} catch(InterruptedException e) {
				return;
			}
		}
	}
}

public class ThreadEx {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scanner = new Scanner(System.in);
		
		System.out.println("숫자를 입력하세요 : ");
		int i = scanner.nextInt();
		scanner.nextLine();
		System.out.println("문자열을 입력하세요 : ");
		String str1 = scanner.nextLine();
		System.out.println("숫자와 문자열을 순서대로 입력하세요 : ");
		int j = scanner.nextInt();
		scanner.nextLine();
		String str2 = scanner.nextLine();
		
		Thread th1 = new Thread(new numThread(i));
		Thread th2 = new Thread(new strThread(str1));
		Thread th3 = new Thread(new bothThread(j, str2));
		
		th1.start();
		th2.start();
		th3.start();
	}

}
