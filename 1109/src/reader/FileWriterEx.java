/*
 * 소스파일: FileWriterEx.java
 * 이화여대 컴퓨터공학전공 2071019 김한나
 * 키보드 입력을 파일로 저장하기
 */

package reader;

import java.io.*;
import java.util.*;

public class FileWriterEx {
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scanner = new Scanner(System.in);
		FileWriter fout = null;
		int c;
		
		try {
			fout = new FileWriter("C:\\\\Users\\\\LG\\\\Desktop\\\\JavaProgrammingPractice\\\\1109\\\\src\\\\reader\\\\sample.txt");	//실행 결과 sample.txt 파일 생성
			while(true) {
				String line = scanner.nextLine();
				if(line.length() == 0)
					break;
				fout.write(line, 0, line.length());		//블록 단위 쓰기
				fout.write("\r\n", 0, 2);		//한 줄을 띄우기 위해 \r\n을 파일에 저장
			}
			fout.close();
		}
		catch (IOException e) {
			System.out.println("입출력 오류");
		}
		scanner.close();
	}

}
