
public class LightThread extends Thread {
	private String name;
	private int cnt=0;
	private int value=1;
	private boolean prevalue=false;
	private SharedValue sv;
	
	//메인스레드로부터 이름과 공유값 받기
	public LightThread(String str, SharedValue sv) {
		this.name=str;
		this.sv=sv;
	}
	
	@Override
	public void run() {
		System.out.println(name + " 전원 ON입니다.");	//메인 스레드로부터 받은 이름으로 “~ 전원 ON 입니다”
		
		while(true) {
			value=sv.setValue(2);
			
			//value == 0
			if(value==0) {
				if(prevalue) { //현재 전등이 켠 상태이고 value == 0
					if(cnt==5) { //5초 작동하면 “~ 20초 경과하여 전등을 끕니다”
						System.out.println(name + " 점등 5초 경과하여 전등을 끕니다.");
						cnt=0; prevalue=false;
					} else {
						System.out.println(name + "이 계속 켜져 있습니다.");
						cnt++;
					}
				} else { //현재 전등이 끈 상태이고 value == 0 “~ 전등을 켰습니다.”
					System.out.println(name + "을 켰습니다.");
					prevalue=true; cnt++;
				}
				
			//value == 1
			} else if(value==1) {
				if(prevalue) { //현재 전등이 켜져 있는 상태이고 value == 1 “~ 전등을 끕니다.” 
					System.out.println(name + "을 끕니다.");
					cnt=0; prevalue=false;
				} else { //현재 전등이 끈 상태이고 value == 1
					System.out.println(name + "이 꺼져 있습니다.");
				}
				
			//value == 2
			} else if(value==2) {
				if(prevalue) { //현재 전등이 켜져 있는 상태이고 value == 2 “~ 전등이 계속 켜져 있습니다.”
					if(cnt==5) { //5초 작동하면 “~ 20초 경과하여 전등을 끕니다”
						System.out.println(name + " 점등 5초 경과하여 전등을 끕니다.");
						cnt=0; prevalue=false;
					} else {
						System.out.println(name + "이 계속 켜져 있습니다.");
						cnt++;
					}
				} else { //현재 전등이 끈 상태이고 value == 2
					System.out.println(name + "을 켰습니다.");
					prevalue=true; cnt++;
				}
			}
			try {
				sleep(1000);	//1초 간격으로
			} catch(InterruptedException e) {
				System.out.println(name + " 스레드는 종료합니다.");	//인터럽트를 받으면 “~ 스레드는 종료합니다.” 출력
				return;
			}
		}
	}
}
