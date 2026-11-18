package day05;

public class Exam02 {

	public static void main(String[] args) {
		// 주민등록 번호를 참고하여 생년월일과 성별, 나이를 출력
		//String regNum = "990101-1234567"; // 1900년생 => 1(남), 2(여)
		String regNum = "010101-4234567"; // 2000년생 => 3(남), 4(여)
		
		// 출력결과
		/* 생년월일 : 990101
		 * 성별 : 남
		 * 나이 : 28
		 * */
		int today = 2026;
		// 연도, -다음의 수
		String birth = regNum.substring(0, regNum.indexOf("-"));
		System.out.println("생년월일 : "+birth);
		
		String year = birth.substring(0,2);
		String rNum = regNum.substring(7,8); // equals 
		char r = regNum.charAt(7); // ==
		
		// 성별  1,3 = 남  / 2, 4 = 여
		// String gender = (r == '1' || r == '3') ? "남" : "여"; // char
		String gender = (rNum.equals("1") || rNum.equals("3") ? "남":"여");
		
		System.out.println("성별 : "+gender);
		
		// 19+99  String  / 99+1900  int 
		
		//year = "19"+year;
		int year2 = Integer.parseInt(year);
		
//		if(r == 1 || r == 2) {
//			year2 = year2 + 1900;
//		}else {
//			year2 = year2 + 2000;
//		}
		
		year2 = (rNum.equals("1")|| rNum.equals("2")) ?
				year2 + 1900 : year2 + 2000;
		
		System.out.println("나이 : " + (today - year2));

	}

}
