/*
 * 소스파일: ScoreAverage.java
 * 이화여대 컴퓨터공학전공 2071019 김한나
 * 2차원 배열로 4년 평점 구하기
 * 2차원 배열 (정방형)
 * - 배열 선언 : int intArray[][]; (타입, 변수명, 선언)
 * - 배열 생성 : intArray = new int [2][5]; (변수명, 생성, 타입, 원소개수)
 * - 초기화하며 생성 : int intArray[][] = {{0,1},{2,3},{4,5}};
 * - intArray.length : 행의 개수
 * - intArray[n].length : n번째 열의 개수
 * 비정방형 배열 생성
 * - int intArray[][] = new int[3][];
 * - intArray[0] = new int[3];
 * - intArray[1] = new int[4];
 * - intArray[2] = new int[2];
*/

public class ScoreAverage {
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		double score[][] = {{3.9, 4.1}, {4.2, 4.3}, {4.2, 4.0}, {3.9, 4.1}};		//2차원 배열 초기화 및 생성
		double sum = 0;
		for(int year=0; year<score.length; year++)					//각 학년 마다
			for(int term=0; term<score[year].length; term++)		//각 학기 마다
				sum += score[year][term];							//평점 합
		
		int n = score.length;				//행의 개수 : 4
		int m = score[0].length;			//열의 개수 : 2
		System.out.println("4년 전체 평점 평균은 " + sum/(n*m));			//4년 평점 계산 및 출력
	}
}
