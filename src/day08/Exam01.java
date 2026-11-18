package day08;

import java.util.Arrays;

public class Exam01 {
	// 메서드 오버로딩 조건
	// 매개변수의 개수 다름, 
	// 매개변수의 순서가 다름
	
	// 1. 랜덤수를 리턴하는 메서드 (1~45)
	// 매개변수 : 없음  / 리턴타입 : 랜덤수 => 정수 => int
	public int makeRandom() {
		return (int)(Math.random()*45)+1;
	}
	
	// 범위를 입력받아 해당 범위의 랜덤수를 리턴하는 메서드
	// 1~45 / 1~6 / 1~52 / 
	public int makeRandom(int count, int start) {
		return (int)(Math.random()*count)+start;
	}
	
	 // 범위로 랜덤수 생성
	public int makeRandom2(int begin, int end) { 
		// 1~45  => 45개  / 10~45 => 36  end - begin + 1
		return (int)(Math.random()*end - begin + 1)+begin;
	}
	
	// 2. 중복확인메서드 : 배열에 정수가 있는지 확인
	//  - 매개변수 (배열 int[] arr, 정수 int num) 
	//  - 리턴타입 : boolean
	public boolean isContains(int[] arr, int num) {
		for(int i=0; i<arr.length; i++) {
			if(arr[i] == num) {
				return true;
			}
		}
		return false;
	}
	
	// 3. 배열을 매개변수로 받아 랜덤수(1번메서드 호출)를 중복X(2번메서드호출) 채워주는 메서드
	// 매개변수 : 배열 => int[] arr
	// 리턴타입 : 없음 => void
	public void randomArray(int[] arr) {
		if(arr == null || arr.length <=0) {
			System.out.println("잘못된 배열!!");
			return;
		}
		int i = 0;
		while(i < arr.length) {
			int random = makeRandom2(1, 10);			
			if(!isContains(arr, random)) {
				arr[i] = random;
				i++;
			}
		}
	}
	
	
	// 4. 배열을 출력하는 메서드
	// - 사용자 번호   1 2 3 4 5 6
	// - 당첨 번호    1 2 3 4 5 6 [7] 
	// 매개변수 : 배열 int[] arr  / 출력 => void
	public void printArray(int[]arr) {
		if(arr == null || arr.length <= 0) {
			System.out.println("출력할 자료가 없습니다.");
			return;
		}
		for(int i=0; i<6; i++) {
			System.out.print(arr[i]+" ");
		}
		if(arr.length == 7) {
			System.out.print("["+ arr[arr.length-1]+"]");
		}
		System.out.println();
	}
	
	// 5. 당첨 확인하는 메서드 (바로 출력 됨.)
	// - 사용자번호, 당첨번호 받아서 등수를 리턴하는 메서드
	/* - 6개 일치 = 1등 (순서 상관없음, 보너스 제외)
	 * - 5개 일치 + 보너스 번호 = 2등 
	 * - 5개 일치 = 3등
	 * - 4개 일치 = 4등
	 * - 3개 일치 = 5등
	 * - 나머지는 꽝
	 * */
	public int ranking(int[] user, int[] lotto) {
		if(user == null || lotto ==null || 
				user.length <=0 || lotto.length<=0) {
			//System.out.println("배열오류!!");
			return -999999;
		}
		// user / lotto 배열 위치가 바뀌어서 들어올 때
		if(user.length >= lotto.length) {
			return -999999;
		}
		int count=0; // 일치 개수 카운트 (보너스는 제외)
		for(int i=0; i<user.length; i++) {
			if(isContains(user, lotto[i])) {
				count++;
			}
		}
		
		// 순위 확인
		switch(count) {
		case 6: return 1;
		case 5: return isContains(user, lotto[lotto.length-1]) ? 2: 3;
//			if(isContains(user, lotto[lotto.length-1])) {
//				return 2;
//			}else {
//				return 3;
//			}
		case 4: return 4;
		case 3: return 5;
		default : return 0;
			
		}
	
	}
	
	

	public static void main(String[] args) {
		// 로또 만들기
		/* - 사용자 번호 (6자리)
		 * - 당첨 번호 (7자리)
		 * */
		int user[] = new int[6];
		int lotto[] = new int[7];
		//Sanner scan = new Scanner(System.in);
		
		Exam01 e = new Exam01();
		e.randomArray(user);
		e.randomArray(lotto);
//		System.out.println(Arrays.toString(user));
//		System.out.println(Arrays.toString(lotto));
		System.out.println("--유저번호--");
		e.printArray(user);
		System.out.println("--당첨번호--");
		e.printArray(lotto);
		
		int ranking = e.ranking(user, lotto);
		if(ranking == -999999) {
			System.out.println("배열오류!!");
		}else if(ranking == 0) {
			System.out.println("꽝!!");
		}else {
			System.out.println(ranking+"등 당점!!!");
		}
		

	}

}
