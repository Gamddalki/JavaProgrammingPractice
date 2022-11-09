package project;

import java.io.*;
import java.util.*;

public class Reservation {
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);

		try {
			FileWriter fout = new FileWriter("C:\\\\Users\\\\LG\\\\Desktop\\\\JavaProgrammingPractice\\\\1109\\\\src\\\\project\\\\reservation.txt");
			
			for(int j=0; j<3; j++) {
				System.out.println("입력하세요: ");
				
				for(int i=0; i<4; i++) {
						String input = scanner.nextLine();
						fout.write(input, 0, input.length());
						if(i==3) {
							fout.write("\r\n", 0, 2);
							break;
						}
						fout.write(",", 0, 1);
				}
			}
			
			fout.close();
		}
		catch (IOException e) {
			System.out.println("입출력 오류");
		}
		scanner.close();
	}
	
}
