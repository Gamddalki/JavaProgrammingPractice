
public class My_object {
	public synchronized void foo(int x) {
		try {
			System.out.println(x + " start");
			wait(1);	//sleep과는 달리, lock(synchronized)를 해제하기 때문에 wait만 사용하면 start - end 가 붙어 나오지 않음)
			//Thread.sleep(500);	으로 하면 start - end 가 붙어 나옴
			System.out.println(x + " end");
		}
		catch(InterruptedException e) {
			
		}
	}

}
