/*
 * 소스파일: FileReaderEx.java
 * 이화여대 컴퓨터공학전공 2071019 김한나
 * FileReader로 텍스트파일 읽기
 * 스트림 입출력: 버퍼를 가지고 이루어지는 입출력
 * - 자바의 입출력 스트림
 * 		: 입력 스트림 - 입력 장치로부터 자바 프로그램으로 데이터를 전달
 * 		: 출력 스트림 - 출력 장치로 데이터 출력
 * 	: 특징 - 스트림의 양 끝에 입출력 장치와 자바 프로그램 연결 !! (스트림은 연결될 수 있음)
 * 		 - 스트림은 단방향 (입출력을 동시에 할 수는 x)
 * 		 - 선입선출 (FIFO)
 * 	: 종류
 * 		: 바이트 스트림 - 단순 바이트로 처리 (기본 단위 : 바이트)
 * 			- InputStream/OutputStream(바이트 스트림을 다루는 모든 클래스의 슈퍼클래스), FileInputStream/FileOutputStream(파일로부터 바이트 단위로 읽거나 저장, 입출력 용도), DataInputStream/DataOutputStream(자바의 기본 데이터 값(변수)을 바이너리 값 그대로 입출력 - 문자열도 바이너리 형태로)
 * 		: 문자 스트림 - 문자만 입출력, 바이너리 데이터(이미지, 동영상 등) 처리 불가 (기본 단위 : 문자 1개 = 유니코드(2바이트))
 * 			- Reader/Writer, InputStreamReader/OutputStreamReader, FileReader/FileWriter (텍스트 파일에서 문자 데이터 입출력)
 */

package reader;

import java.io.*;

public class FileReaderEx {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		try {
			FileInputStream fin = new FileInputStream("C:\\Users\\LG\\Desktop\\JavaProgrammingPractice\\1109\\src\\reader\\sample.txt");	//파일을 열어 입력 바이트 스트림 객체 in과 연결
			InputStreamReader in = new InputStreamReader(fin, "UTF-8");		//문자 집합 지정을 잘못 할 경우 출력 결과가 깨짐
			int c;
			
			while((c=in.read()) != -1) {		//한 문자씩 파일 끝까지 읽기 (파일의 끝을 만나면 -1 리턴함)
				System.out.print((char)c);}		//바이트를 문자로 변환하여 화면에 출력
			in.close();
			fin.close();		//스트림을 닫음 = 파일도 닫힘 = 스트림과 파일의 연결을 끊음 = 더 이상 스트림으로부터 읽을 수 없음
		}
		catch (IOException e) {
			System.out.println("입출력 오류");
		}
	}

}