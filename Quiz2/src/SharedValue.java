
public class SharedValue {
	int i=-1, j=0;
	int [][] val = {{2,1,1}, {0,0,0}, {1,1,1}, {0,2,1}, {2,1,1}, {1,0,1}, {0,1,2}, {2,2,2} }; //초기값 포함 전체 변경값 배열
	
	synchronized public int setValue(int num) {
		Thread.yield();
		
		if(num==-1) { //메인이 호출했으면
			i++;
			if(i==8) {
				return 0;
			}
			if(i!=0) {
				System.out.println("\n(냉장고:" + val[i][0] + ", 세탁기:" + val[i][1] + ", 전등:" + val[i][2] + ")");
			}
			return 1;
		} else if(num==0 || num==1 || num==2) { //냉장고, 세탁기, 전등이 호출했으면 각 스레드에 해당 값 리턴
			j=num;
			return val[i][j];
		}
		
		return 1;
	}
}
