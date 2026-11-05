package day01;

public class Exam02 {

	public static void main(String[] args) {
		// kor, eng, math 세 점수를 입력하고, 합계와 평균을 출력
		// 각 점수는 0~100 => 점수가 잘못입력되었습니다. 
		// pass : 평균이 60점 이상이면 합격 아니면 불합격  if문이용
		
		// int kor=78, eng=89, math=45;
		
		int kor1 = -78;
		int eng = 89;
		int math = 50;
		
		// 1. 각 점수가 조건에 맞는지 확인
		// 조건에 맞다면 계산하시오.
		if((kor1>=0 && kor1<=100) && (eng>=0 && eng<=100) && (math>=0 && math<=100)) {
			// 계산
			int total = kor1 + eng + math;
			double avg = (double)total / 3;
			
			System.out.println("total : "+ total + " average : "+avg);
			
			if(avg >= 60) {
				System.out.println("합격");
			}else {
				System.out.println("불합격");
			}
			
			// 삼항연산자는 연산자 안에 처리구문을 포함할 수 없다.
			System.out.println(avg >= 60 ? "합격" : "불합격");
			
			String pass = avg >= 60 ? "합격" : "불합격" ; 
			
		}else {
			System.out.println("점수가 잘못 입력되었습니다.");
		}
		
		// 2. 각 점수의 조건이 맞지 않으면 계산하지 마시오.
		if((kor1>100 || kor1<0) || (eng>100 || eng<0) || (math>100 || math<0)) {
			// 계산 불가
			System.out.println("점수가 잘못 입력되었습니다.");
		}else {
			// 계산
			int total = kor1 + eng + math;
			double avg = (double)total / 3;
			
			System.out.println("total : "+ total + " average : "+avg);
			
			if(avg >= 60) {
				System.out.println("합격");
			}else {
				System.out.println("불합격");
			}
			
			// 삼항연산자는 연산자 안에 처리구문을 포함할 수 없다.
			System.out.println(avg >= 60 ? "합격" : "불합격");
			
			String pass = avg >= 60 ? "합격" : "불합격" ; 
		}
		
	}

}
