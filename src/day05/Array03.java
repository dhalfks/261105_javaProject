package day05;

import java.util.Arrays;
import java.util.Scanner;

public class Array03 {

	public static void main(String[] args) {
		// 배열생성 
		// 5명의 점수를 입력받기 (0~100)
		// 합계와 평균을 출력
		// 입력값의 범위가 벗어나면 다시 입력받기
		Scanner scan = new Scanner(System.in);
		
		int arr[] = new int[5];
		int sum=0;
		
		System.out.println("학생 성적 5명을 입력 > (0~100)");
		
		for(int i=0; i<arr.length; i++) {
			int score = scan.nextInt();
			// if는 조건을 한번만 확인
			while(score < 0 || score > 100) {
				System.out.println("점수의 범위가 벗어났습니다.");
				System.out.println("다시입력 >");
				score = scan.nextInt();
			}
			System.out.println("점수입력완료!!");
			arr[i] = score;
			sum += score;
		}
		System.out.println(Arrays.toString(arr));
		System.out.println("합계 : "+sum);
		System.out.println("평균 : "+sum / (double)arr.length);
		scan.close();

	}

}
