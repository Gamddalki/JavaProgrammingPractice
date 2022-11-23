/* 소스파일: BufferIOEx.java
 * 이화여대 컴퓨터공학전공 2071019 김한나
 * 버퍼 스트림을 이용한 출력
 * 버퍼 스트림 : 버퍼를 가진 스트림 - 입출력 데이터를 일시적으로 저장하는 버퍼를 이용해 입출력 효율 개선
 * - 목적 : 입출력 시 운영체제의 API 호출 횟수를 줄여 입출력 성능 개선
 * 		- 출력 시 여러번 출력되는 데이터를 버퍼에 모아 한 번에 출력
 * 		- 입력 시 입력 데이터를 버퍼에 모아 한 번에 프로그램에게 전달
 * - 종류 : 바이트 버퍼 스트림 - 바이트 단위의 바이너리 데이터를 처리하는 버퍼 스트림
 * 				- BufferedInputStream/BufferedOutputStream
 * 		: 문자 버퍼 스트림 - 유니토드의 문자 데이터만 처리하는 버퍼 스트림
 * 				- BufferedReader/BufferedWriter
 */

package reader;

import java.io.*;
import java.util.*;

public class BufferIOEx {
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		FileReader fin = null;
		int c;
		try {
			fin = new FileReader("");
			BufferedOutputStream out = new BufferedOutputStream(System.out, 5);		//System.out 표준 스트림에 출력, 출력 스트림의 버퍼 크기 5 - 8개의 문자 출력 시 3개는 보이지 않고 버퍼에 남아있음
			while((c = fin.read()) != -1) {		//파일 전체를 읽어 화면에 출력
				out.write(c);	//버퍼가 꽉 찰 때 문자가 화면에 출력
			}
			new Scanner(System.in).nextLine();	//엔터키 기다림
			out.flush();	//엔터 입력 시 out.flush()실행 - 버퍼에 남은 3개의 문자 강제 출력
			fin.close();	//스트림 닫음
			out.close();
		} catch (IOException e) {
			e.printStackTrace();
		}
	}

}
