
public class LaundThread extends Thread {
	private String name;
	private int cnt=0;
	private int value=1;
	private boolean prevalue;
	private SharedValue sv;
	
	//메인스레드로부터 이름과 공유값 받기
	public LaundThread(String str, SharedValue sv) {
		this.name=str;
		this.sv=sv;
	}
	
	@Override
	public void run() {
		System.out.println(name + " 전원 ON입니다.");	//메인 스레드로부터 받은 이름으로 “~ 전원 ON 입니다” 화면 출력
		
		while(true) {
			value=sv.setValue(1);
			
			//value == 0
			if(value==0) {
				if(prevalue) {
					if(cnt==5) { //5초 작동하면 “~ 작동이 완료되었습니다”
						System.out.println(name + " 작동이 완료되었습니다.");
						cnt=0; prevalue=false;
					} else { //현재 세탁기가 작동 중인 상태이고 value == 0
						System.out.println(name + " 계속 작동중입니다.");
						cnt++;
					}
				} else { //현재 세탁기가 작동 종료된 중인 상태이고 value == 0 “~ 작동을 시작합니다”
					System.out.println(name + " 작동을 시작합니다.");
					prevalue=true; cnt++;
				}
				
			//value == 1
			} else if(value==1) {
				if(prevalue) { //현재 세탁기가 작동 중인 상태이고 value == 1 “~ 작동을 종료합니다”
					System.out.println(name + " 작동을 종료합니다.");
					cnt=0; prevalue=false;
				} else { //현재 세탁기가 작동 종료된 중인 상태이고 value == 1
					System.out.println(name + " 작동중이 아닙니다.");
				}
			
			//value == 2
			} else if(value==2) {
				if(prevalue) {
					if(cnt==5) { //5초 작동하면 “~ 작동이 완료되었습니다”
						System.out.println(name + " 작동이 완료되었습니다.");
						cnt=0; prevalue=false;
					} else { //현재 세탁기가 작동 중인 상태이고 value === 2 “~ 계속 작동중입니다.”
						System.out.println(name + " 계속 작동중입니다.");
						cnt++;
					}
				} else { //현재 세탁기가 작동 종료된 중인 상태이고 value == 2
					System.out.println(name + " 작동을 시작합니다.");
					prevalue=true; cnt++;
				}
			}
			try {
				sleep(1000);	//1초 간격으로
			} catch(InterruptedException e) {
				System.out.println(name + " 스레드는 종료합니다.");
				return;
			}
		}
	}
}
