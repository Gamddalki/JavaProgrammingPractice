import java.util.*;

class sharedCars{
	private int sum=0;	//재고량
	
	synchronized public void left(int i) {
		int n = sum;
		Thread.yield();		//현재 실행중인 스레드 양보
		if(i==1)
			n++;
		else if(i==0 && n>0)
			n--;
		sum = n;			//집계합에 합
	}
	
	public int getSum() {
		return sum;
	}
}

class facThread extends Thread {
	private int prod;
	private sharedCars sc;
	
	public facThread(int prod, sharedCars sc) {
		this.prod=prod;
		this.sc=sc;
	}
	
	@Override
	public void run() {
		int made=0; //생산량
		while(true) {
			sc.left(1);
			made++;
			try {
				System.out.println("[공장] 생산 대수 " + made + "대, 남은 대수 " + sc.getSum() + "대"); //공장이면 생산
				sleep(1000);
				if(made==prod) {
					System.out.println("공장 운행 종료");
					return;
				}
			} catch(InterruptedException e) {
				return;
			}
		}
	}
}

class branThread extends Thread {
	private int sell;
	private sharedCars sc;
	private int i;
	
	public branThread(int sell, sharedCars sc, int i) {
		this.sell=sell;
		this.sc=sc;
		this.i=i;
	}
	
	@Override
	public void run() {
		int sold=0; //판매량
		while(true) {
			if(sc.getSum()>0) {
				sc.left(0);
				sold++;
				System.out.println("[영업점"+i+"] 판매 대수 " + sold + "대, 남은 대수 " + sc.getSum() + "대"); //영업점이고 수량이 있으면 판매
			}
			else System.out.println("[영업점"+i+"] 재고가 부족합니다.");
			try {
				sleep(500);
				if(sold==sell) {
					System.out.println("영업점"+i+" 영업 종료");
					return;
				}
			} catch(InterruptedException e) {
				return;
			}
		}
	}
}

public class CarEx {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scanner = new Scanner(System.in);
		sharedCars sc = new sharedCars();
		
		System.out.println("생산 수량을 입력하세요 : ");
		int prod = scanner.nextInt();
		scanner.nextLine();
		System.out.println("소비 수량을 입력하세요 : ");
		int sell = scanner.nextInt();
		scanner.nextLine();
		
		Thread fac = new Thread(new facThread(prod, sc));
		Thread bran1 = new Thread(new branThread(sell, sc, 1));
		Thread bran2 = new Thread(new branThread(sell, sc, 2));
		
		fac.setPriority(3);
		bran1.setPriority(2);
		bran2.setPriority(2);
		
		fac.start();
		bran1.start();
		bran2.start();

	}
}
