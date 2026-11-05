package day03;

import java.util.Scanner;

public class For03 {

	public static void main(String[] args) {
		// 구구단 2단 출력
		/* 2*1=2
		 * 2*2=4
		 * 2*3=6
		 * ...
		 * 2*9=18
		 * */
		
		Scanner scan = new Scanner(System.in);
		
//		int dan = 9;
//		
//		for(int i=1; i<=9; i++) {
//			System.out.println(dan+"*"+i+"="+(dan*i));
//		}
		
		// 단을 콘솔에 입력받아 출력
		// Scanner scan = new Scanner(System.in);
		
//		System.out.println("단을 입력하세요>");
//		int dan = scan.nextInt();
//		
//		for(int i=1; i<=9; i++) {
//			System.out.println(dan+"*"+i+"="+(dan*i));
//		}
		
		int i=1;
		for(; ;) {
			
			if(i<=5) {
				System.out.println(i);
				i++;
			}
			if(i==5) {
				break;
			}
		}
		

		//scan.close();
	}

}
