/*
 * 소스파일: RunnableTimerEx.java
 * 이화여대 컴퓨터공학전공 2071019 김한나
 * 인터페이스 스레드와 클래스 스레드를 이용해 출력하기
 * 
 * - 스레드 작성의 두 가지 방법
 *  	1. java.lang.Thread 클래스 이용
 *  	2. java.lang.Runnnable 인터페이스 이용 - 스레드 객체 생성, th.start()로 스레드 작동 시작
 *  		implements Runnable
 *  		@Override
 *  		public void run()	//여기서 스레드 실행 시작
 *  		- 인터페이스는 run 메소드만 (생성자 메소드 없음), 클래스는 필드와 메소드가 멤버
 *  		- 따라서 인터페이스는 비교적 가볍고, 클래스는 다른 메소드들도 작성하여 사용할 수 있음
 *  - 스레드의 우선순위 : 스케줄링은 철저히 우선순위 기반 (가장 높은 우선순위부터 진행, 동일한 우선순위의 경우 번갈아가면서 진행)
 *  	- 디폴트 5 (최댓값 10, 최솟값 1)
 *  	setPriority(int)	//main에서만 가능함! 왜냐면 스케줄링은 main만 할 수 있는 거라서!
 *  	getPriority()
 *  - 스레드의 종료
 *  	1. 스스로 종료 : run() 메소드 리턴
 *  	2. 타 스레드에서 강제 종료 : interrupt() 메소드 이용 -> 예외를 받고 리턴하여 종료됨	: 일반적으로 가장 많이 사용
 *  	3. flag 종료 : 타 스레드가 flag를 true로 만들면 종료됨 - if문을 이용해 체크 후 리턴해 종료됨
 *  + main 스레드 : JVM이 응용프로그램 실행을 시작할 때 생성됨. main() 메소드를 실행
 *  	- main() 메소드 종료 시 main 스레드 또한 종료
 */

import java.util.*;

class TimerRunnable1 implements Runnable{
	@Override
	public void run() {
		int n=0;
		long id1 = Thread.currentThread().getId();
		String name1 = Thread.currentThread().getName();
		Thread.State s1 = Thread.currentThread().getState();
		System.out.println("[스레드1번] " + id1 + " " + name1 + " " + s1);
		while(true) {
			n++;
			try {
				System.out.println("[스레드1번] " + n);
				Thread.sleep(1000);
			}
			catch(InterruptedException e) {		//있어야만 스케줄링할때 종료 가능
				System.out.println("[스레드1번] 종료");
				return;
			}
		}
	}
}

class TimerRunnable2 implements Runnable{
	@Override
	public void run() {
		int m=0;
		long id2 = Thread.currentThread().getId();
		String name2 = Thread.currentThread().getName();
		Thread.State s2 = Thread.currentThread().getState();
		System.out.println("[스레드2번] " + id2 + " " + name2 + " " + s2);
		while(true) {
			m+=2;
			try {
				System.out.println("[스레드2번] " + m);
				Thread.sleep(1500);
			}
			catch(InterruptedException e) {
				return;
			}
		}
	}
}

class nameThread extends Thread {
	private String str;
	private boolean flag = false;	//스레드의 종료 명령을 표시하는 플래그 (true=종료)
	
	public nameThread(String str) {
		this.str=str;
	}
	
	public void finish() {
		flag = true;
	}
	
	@Override
	public void run() {
		long id3 = Thread.currentThread().getId();
		String name3 = Thread.currentThread().getName();
		Thread.State s3 = Thread.currentThread().getState();
		System.out.println("[스레드3번] " + id3 + " " + name3 + " " + s3);
		while(true) {
			System.out.println("[스레드3번] " + str);
			try {
				sleep(1000);
				if(flag==true) {
					System.out.println("[스레드3번] 종료");
					return;
				}
			} catch(InterruptedException e) {
				return;
			}
		}
	}
}


public class RunnableTimerEx {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scanner = new Scanner(System.in);
		
		System.out.println("이름을 입력하세요 : ");
		String str = scanner.nextLine();
		
		Thread th1 = new Thread(new TimerRunnable1());
		Thread th2 = new Thread(new TimerRunnable2());
		nameThread th3 = new nameThread(str);
		
		th1.setPriority(3);
		th2.setPriority(2);
		th3.setPriority(1);		//setPriority는 main에서만 가능함! 왜냐면 스케줄링은 main만 할 수 있는 거라서! 종료도 메인에서만!~
		
		int p = Thread.currentThread().getPriority();	//디폴트 priority는 5
		int p1 = th1.getPriority();
		int p2 = th2.getPriority();
		int p3 = th3.getPriority();
		
		System.out.println(p + " " + p1 + " " + p2 + " " + p3);
		
		//th1.run();
		//th2.run();
		//th3.run(); 으로 스레드에게 일을 시키면 메소드가 무한루프되며 return하지 않아 첫번째 스레드만 실행됨 (두번째, 세번째 스레드는 이전 스레드의 종료를 계속 기다리는 상태)
		th1.start();
		th2.start();
		th3.start();
		
		th1.interrupt();	//타 스레드에서 강제 종료 - 일반적으로 가장 많이 사용
		th3.finish();	//다운캐스팅 후 finish 함수 이용해 종료
	}

}
