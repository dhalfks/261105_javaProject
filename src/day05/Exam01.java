package day05;

import java.util.Scanner;

public class Exam01 {

	public static void main(String[] args) {
		/* -- menu --
		 * 1.과자(2000원) | 2.라면(3000원) | 3.사탕(500원) | 4.젤리(500원) | 5.종료
		 * menu > 1
		 * 과자 1개를 선택했습니다. 2000원
		 * menu > 2
		 * 라면 1개를 선택했습니다. 3000원
		 * menu > 1
		 * 과자 1개를 선택했습니다. 2000원
		 * ....
		 * menu > 5
		 * 과자 2개  4000원 
		 * 라면 1개  3000원
		 * -------------
		 * 총금액 7000원 
		 * 
		 * 종료를 누를때까지 반복
		 * 1~5를 벗어난 메뉴는 다시 입력
		 * 각 배열의 같은 번지는 같은 값
		 * */
		Scanner scan = new Scanner(System.in);
		
		String menu[] = {"과자","라면","사탕","젤리"};
		int price[] = {2000, 3000, 500, 500};
		int count[] = new int[menu.length];
		
		//System.out.println(menu[0]+"("+price[0]+"원)");
		
		int choice = 0; // 메뉴 받기
		
		int sum=0;
		
		do {
			System.out.println("--menu--");
			System.out.println("1.과자(2000원) | 2.라면(3000원) | 3.사탕(500원) | 4.젤리(500원) | 5.종료");
			System.out.println("menu >> ");
			choice = scan.nextInt();
			
			if(choice < 1 || choice > 5) {
				System.out.println("잘못된 메뉴!!");
			}else if(choice == 5) {
				System.out.println("종료");
				break;
			}else {
				System.out.println(menu[choice-1]+" 1개 선택 ("+price[choice-1]+"원)");
				count[choice-1]++;
			}
			
		}while(choice != 5);
		
//		sum = (count1*2000) + (count2*3000) + (count3*500) + (count4*500);
//		
//		System.out.println("총 금액 : ");
//		System.out.println("과자 (2000원) * "+count1+"  = "+(count1*2000));
//		System.out.println("라면 (3000원) * "+count2+"  = "+(count2*3000));
//		System.out.println("사탕 (500원) * "+count3+"  = "+(count3*500));
//		System.out.println("젤리 (500원) * "+count4+"  = "+(count4*500));
//		System.out.println("---------------------------");
//		System.out.println(" 총금액            : "+ sum);
		for(int i=0; i<menu.length; i++) {
			if(count[i] != 0) {
				System.out.println(menu[i]+"("+price[i]+"원) * "+count[i] +
						" = "+(price[i]*count[i]));
				sum += (price[i]*count[i]);				
			}
		}
		System.out.println("-----------------");
		System.out.println("총금액 : "+sum);
			
		
		
		scan.close();
		

	}

}
