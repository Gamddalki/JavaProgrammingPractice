/*
 * 소스파일: Mission.java
 * 이화여대 컴퓨터공학전공 2071019 김한나
 * 파일을 읽어 이름을 작성하고 이메일을 입력받아 이어서 작성해 새 파일에 저장하기
 */

package reader;

import java.io.*;
import java.util.*;

public class Mission {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Scanner scanner = new Scanner(System.in);

		try {
			FileInputStream fin = new FileInputStream("C:\\Users\\LG\\Desktop\\JavaProgrammingPractice\\1109\\src\\reader\\ewha.txt");
			InputStreamReader in = new InputStreamReader(fin, "UTF-8");
			FileWriter fout = new FileWriter("C:\\\\Users\\\\LG\\\\Desktop\\\\JavaProgrammingPractice\\\\1109\\\\src\\\\reader\\\\ewha_email.txt");
			int c, t=1;
			
			while(true) {
				for(int i=0; i<3; i++) {
					c=in.read();
					if(c == -1) {
						t=0;
						break;
					}
					fout.write(c);
				}
				if(t==0) break;
				in.read(); in.read();
				
				System.out.println("이메일을 입력하세요.");
				
				while(true) {
					String email = scanner.nextLine();
					if(email.length() == 0)
						break;
					fout.write(" ", 0, 1);
					fout.write(email, 0, email.length());
					fout.write("\r\n", 0, 2);
				}
			}
			fin.close();
			in.close();
			fout.close();
		}
		catch (IOException e) {
			System.out.println("입출력 오류");
		}
		scanner.close();
	}

}
