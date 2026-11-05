package day03;

public class While01 {

	public static void main(String[] args) {
		// while
		/* while(조건식) { 실행문; }
		 * 조건식이 참이면 실행문 실행
		 * 반복할 조건의 증감식이 항상 실행문에 포함
		 * for : 반복횟수가 정해져 있을 경우
		 * while : 반복횟수가 정해져있지 않을 경우
		 * */
		
		for(int i=1; i<=10; i++) {
			System.out.println(i);
		}
		
		int i=1;
		while(true) {
			System.out.println(i);
			i++;
			// 조건을 이용한 break;
			if(i==5) {
				break;
			}
		}
		
		// while을 이용하여 1~10까지 출력
		i=0;
		while(i<=10) {
			System.out.println(i);
			i++;
		}
		
		// 짝수만 출력
		i=0;
		while(i<=10) {
			if(i % 2 == 0) {
				System.out.println(i);
			}
			i++;
		}
		
		//break; 문을 사용
		// i = 11
		i=0;
		int sum = 0;
		while(true) {
			if(i%2==0) {
				System.out.println(i);
				sum += i;
			}
			if(i==10) {
				break;
			}
			i++;
		}
		System.out.println(sum);
		

	}

}
