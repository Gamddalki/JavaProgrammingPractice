/*
 * 소스파일: Main.java
 * 이화여대 컴퓨터공학전공 2071019 김한나
 * 스레드 wait 실습
 *
 * 동기화 객체 : 두 개 이상의 스레드 동기화에 사용되는 객체
 * 동기화 메소드 : Object의 메소드임 (모든 객체가 동기화 객체가 될 수 있음 - Thread 객체 또한 포함)
 * - wait() : 타 스레드가 notify()를 불러줄 때까지 대기
 * 			: 갖고 있던 고유 lock을 해제하고 스레드를 잠들게 함 ( -> 따라서 호출하는 스레드가 반드시 고유 lock을 가지고 있어야 함 = synchronized 블록 내에서만 사용되어야 함)
 * - notify() : 대기중인 스레드 중 임의로 하나를 골라 깨워 RUNNABLE 상태로 만들어줌 (오직 하나의 스레드만 깨움)
 * - notifyAll() : 대기중인 모든 스레드를 깨워 RUNNABLE 상태로 만들어줌
 * -> synchronized 블록 내에서만 사용되어야 함
 */


public class Main {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		My_object a = new My_object();
		My_object b = new My_object();
		Worker w[] = new Worker[200];
		for(int i=0; i<200; i++)	//스레드 200개 생성됨
			w[i] = new Worker(a, i);
		for(int i=0; i<200; i++)
			w[i].start();			//200개의 스레드가 My_object에서 foo() 호출, 즉 My_object 공유
		for(int i=0; i<200; i++)
			w[i].join();
	}

}
