/* 소스파일: SynchronizedEx.java
 * 이화여대 컴퓨터공학전공 2071019 김한나
 * synchronized를 사용해 공유집계판 사례 코딩
 * 
 * 스레드 동기화 : 스레드의 공유 데이터에 대한 배타적 독점 접근 보장 - 멀티스레드의 공유 데이터 동시 접근 문제 해결
 * - 다수의 스레드가 공유 데이터에 동시에 접근하는 경우, 예기치 못한 결과 발생 가능
 * - 따라서 공유 데이터에 접근하는 모든 스레드를 한 줄 세우기 함 -> 한 스레드가 공유 데이터에 대한 작업을 끝낼 때까지 다른 스레드 접근 막아줌
 * synchronized : 독점 실행해야 하는 부분(동기화 코드)을 표시하는 키워드
 * - 먼저 실행한 스레드가 모니터(독점 권한) 소유 -> 모니터를 내놓을 때까지 타 스레드는 대기
 */

class SharedBoard{
	private int sum=0;	//집계판의 합
	
	synchronized public void add() {
		int n = sum;
		Thread.yield();		//현재 실행중인 스레드 양보
		n+=10;				//10 증가
		sum = n;			//집계합에 합
		System.out.println(Thread.currentThread().getName() + " : " + sum);
	}
	
	public int getSum() {
		return sum;
	}
}

class StudentThread extends Thread {
	private SharedBoard board;		//집계판의 주소
	
	public StudentThread(String name, SharedBoard board) {
		super(name);
		this.board = board;
	}
	@Override
	public void run() {
		for(int i=0; i<10; i++)
			board.add();
	}
}

public class SynchronizedEx {
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		SharedBoard board = new SharedBoard();
		Thread th1 = new StudentThread("kitae", board);
		Thread th2 = new StudentThread("hyosoo", board);
		th1.start();
		th2.start();
	}

}
