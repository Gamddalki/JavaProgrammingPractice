
public class FridgeThread extends Thread {
	private String name;
	private int value=2;
	private boolean prevalue;
	private SharedValue sv;
	
	//메인스레드로부터 이름과 공유값 받기
	public FridgeThread(String str, SharedValue sv) {
		this.name=str;
		this.sv=sv;
	}
	
	@Override
	public void run() {
		System.out.println(name + " 전원 ON입니다.");	// 메인 스레드로부터 받은 이름으로 “~ 전원 ON 입니다”
		
		while(true) {
			value=sv.setValue(0);
		
			//value==0
			if(value==0) {
				if(prevalue) { //현재 냉장고 문이 열린 상태이고 value == 0
					System.out.println(name + " 문이 열려 있습니다.");
				} else { //현재 냉장고 문이 닫힌 상태이고 value == 0 “~ 문을 연다”
					System.out.println(name + " 문을 열었습니다.");
					prevalue=true;
				}
				
			//value==1
			} else if(value==1) {
				if(prevalue) { //현재 냉장고 문이 열린 상태이고 value == 1 “~ 음식을 꺼낸다”
					System.out.println(name + "에서 음식을 꺼냅니다.");
				} else { //현재 냉장고 문이 닫힌 상태이고 value == 1
					System.out.println(name + " 문을 열었습니다.");
					prevalue=true;
				}
			
			//value==2
			} else if(value==2) {
				if(prevalue) { //현재 냉장고 문이 열린 상태이고 value == 2 “~ 문을 닫는다”
					System.out.println(name + " 문을 닫습니다.");
					prevalue=false;
				} else { //현재 냉장고 문이 닫힌 상태이고 value == 2
					System.out.println(name + " 문이 닫혀있습니다.");
				}
			}
			try {
				sleep(1000); // 1초 간격으로 
			} catch(InterruptedException e) {
				System.out.println(name + " 스레드는 종료합니다.");	//인터럽트를 받으면 “~ 스레드는 종료합니다.” 출력
				return;
			}
		}
	}
}
