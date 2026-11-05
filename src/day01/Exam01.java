package day01;

public class Exam01 {

	public static void main(String[] args) {
		// % 나눈나머지를 나타내는 연산자 / 삼항연산자
		// number 의 수가 짝수인지 홀수인지 출력
		
		int number = 10;
		System.out.println(number % 2);
		System.out.println(number % 2 == 0 ? "짝수" : number % 2 == 1 ? "홀수" : "이상한수"); 
		

	}

}
