package day02;

import java.util.Scanner;

public class Exam01 {

	public static void main(String[] args) {
		// 국어, 영어, 수학 점수를 입력받아 합계, 평균, pass 출력
		// 입력받은 점수는 0~100 범위 안에 있어야 함.
		// return;  해당 메서드를 빠져나오는 키워드
		
		Scanner scan = new Scanner(System.in);
		
		System.out.println("국어 > ");
		int kor = scan.nextInt();
		
		// 비교 
		// 0~100 범위가 맞지 않으면 빠져나가라
		if(kor > 100 || kor < 0) {
			System.out.println("국어점수가 잘못되었습니다.");
			return;
		}else {
			// 영어점수 입력받기
		}
		// 여기까지 왔다는건 국어점수가 범위안에 들어있다는 뜻.
		System.out.println("영어 > ");
		int eng = scan.nextInt();
		if(eng > 100 || eng < 0) {
			System.out.println("영어 점수가 잘못되었습니다.");
			return;
		}
		
		System.out.println("수학 > ");
		int math = scan.nextInt();
		if(math > 100 || math < 0) {
			System.out.println("수학점수가 잘못되었습니다.");
			return;
		}
		// 모든 점수가 범위안에 입력되었을 때 위치.
		// 계산
		int total = kor + eng + math;
		double avg = (double)total / 3;
		
		System.out.println("total : "+ total + " average : "+avg);
		
		if(avg >= 60) {
			System.out.println("합격");
		}else {
			System.out.println("불합격");
		}
		
		
		scan.close();

	}

}
