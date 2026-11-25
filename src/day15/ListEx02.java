package day15;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Scanner;

public class ListEx02 {

	public static void main(String[] args) {
		/* 숫자를 입력받아 리스트로 출력
		 * 출력 => 전체 합계 출력
		 * 입력 형식 String => String[] => list<Integer>
		 * 47,85,96,45,69,85,63,26,15 enter
		 * */
		
		Scanner scan = new Scanner(System.in);
		System.out.println("점수를 입력(,로 구분) >");
		String number = scan.next(); // 공백X  => nextLine() 공백O
		
		String[] num = number.split(",");
		System.out.println("문자배열");
		System.out.println(Arrays.toString(num));
		
//		Integer[] arr = new Integer[num.length];
//		for(int i=0; i<num.length; i++) {
//			arr[i] = Integer.parseInt(num[i]);
//		}
//		System.out.println("숫자배열");
//		System.out.println(Arrays.toString(arr));
		
		int sum = 0;
		
		//IntegetList  != int[]  형이 안맞아서 안들어감.
		List<Integer> list = new ArrayList<>();
		// add() 
		
		for(String n : num) {
			int score = Integer.parseInt(n);
			list.add(score);
			sum += score;
		}
		System.out.println("숫자리스트");
		System.out.println(list);
		System.out.println(sum);
		
		
		scan.close();

	}

}
