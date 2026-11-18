package day07;

import java.util.Scanner;

public class MultiArray03 {
	
	int a;  // multiArray03 클래스의 멤버변수

	public static void main(String[] args) {
		// 성적표
		/* 전체인원 > 3 (입력) ==> 인원수만큼 배열 생성
		 * 이름  국어  영어  수학  합계  평균  등수 
		 * hong  89  78   88   00   00
		 * kim   85  74   86   00   00
		 * lee   95  48   66   00   00 
		 * 
		 * 이름, 국어, 영어, 수학 점수를 입력받아 합계 평균 등수
		 * */
		// 각각의 필요한 배열을 따로생성 같은 번지의 학생은 같은 값으로 정의		
		Scanner scan = new Scanner(System.in);
		System.out.println("성적산출인원 > ");
		int tester = scan.nextInt(); // 인원수
		int subject = 3; // 과목수
		
		String[] name = new String[tester];
		int[][] scores = new int[tester][subject];
		int[] total = new int[tester];
		double[]avg = new double[tester];
		int[] ranking = new int[tester];
		
		// 이름 입력 / 성적입력
		for(int i=0; i<tester; i++) {
			System.out.println((i+1)+". 번째 학생>");
			name[i] = scan.next();
			System.out.println(name[i]+"학생의 성적(국,영,수) >");
			for(int j=0; j<subject; j++) {
				//scores[i][j] = scan.nextInt();
				scores[i][j] = (int)(Math.random()*70)+30;
				total[i] = total[i] + scores[i][j];
			}
			avg[i] = total[i] / (double)subject;
		}
		
		System.out.println("이름\t국어\t영어\t수학\t합계\t평균\t등수");
		// 출력
		for(int i=0; i<tester; i++) {
			System.out.print(name[i]+"\t");
			// 성적은 2차원
			for(int j=0; j<subject; j++) {
				System.out.print(scores[i][j]+"\t");
			}
			System.out.print(total[i]+"\t");
			System.out.printf("%.2f\t", avg[i]);
			
			// 순위
			int r = 1;
			// i = 순위를 구할 대상
			// j = 비교대상
			for(int j=0; j<tester; j++) {
				if(avg[i] < avg[j]) {
					r++;
				}
			}
			
			ranking[i] = r;
			System.out.print(ranking[i]+"\t");
			System.out.println();
		}
		
		
		
		
		//System.out.printf("%.2f", 56.741235); // 소수 2자리로 표현 방식.
		
		scan.close();
		

	}

}
