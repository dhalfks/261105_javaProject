package day03;

import java.util.Scanner;

public class Exam01 {

	public static void main(String[] args) {
		// up/down  game
		// 1~50까지 중 랜덤 수 하나를 컴퓨터가 생성 => user는 모름
		// user가 그 랜덤수를 맞추는 게임
		/* 출력예시)
		 * 컴퓨터가 랜덤수를 생성했습니다. (38)
		 * 입력 > 30  => UP
		 * 입력 > 40  => DOWN
		 * 입력 > 38  => 정답!!(3회)  => 종료
		 * 
		 * 랜덤수 > 유저수  UP!!
		 * 랜덤수 < 유저수  DOWN!!
		 * 랜덤수 == 유저수 정답!!
		 * */
		
		// 사용자 입력 (콘솔입력)
		Scanner scan = new Scanner(System.in);
		
		int random = (int)(Math.random()*50) + 1;
		// System.out.println(random);
		System.out.println("컴퓨터가 랜덤수를 생성했습니다.");
		
		// 필요한 변수 선언
		int userNum=0;
		int count = 0;
		
		while(true) {
			System.out.println("입력>");
			userNum = scan.nextInt(); // user 입력
			count++;
			
			if(random > userNum) {
				System.out.println("UP!!");
			} else if(random < userNum) {
				System.out.println("down!!");
			}else {
				System.out.println("정답!!! ("+ count+"회)") ;
				break;
			}
			
		}
		
		scan.close();
		
	}

}
