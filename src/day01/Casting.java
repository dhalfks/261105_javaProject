package day01;

public class Casting {

	public static void main(String[] args) {
		// casting : 자료형 변환
		//  a = b;  두 변수의 자료형이 맞지 않다면 오류
		// 자동 자료형 변환 : auto casting
		// byte < short < int < long
		// float < double
		// 명시적 자료형 번환  : 변수 앞에 (타입)변수
		
		byte b = 11;
		int a = b;  // auto casting
		
		int aa = 111;
		byte c = (byte)aa; // 명시적 캐스팅
		
		System.out.println(c);
		
		long l = a;
		
		double d = 3.14159;
		int pi = (int)d;  // 소수점 버림
		
		System.out.println(d);
		System.out.println(pi);
		
		int number = 100;
		double num = number;
		System.out.println(num);  // .0 소수점 생김
		
		// -----------------------
		
		// 문자를 숫자로 : String -> int
		// "123" => 123
		String str = "123";
		System.out.println(str + 10);
		
		// 기본 8 자료형 클래스 타입의 타입이 존재
		// 추가 기능을 제공 (래퍼 클래스 : Wrapper class)
		// int -> Integer / char -> Character
		// float -> Float  / double -> Double / boolean -> Boolean
		// long -> Long / byte -> Byte / short -> Short
		
		int strNumber = Integer.parseInt(str);
		System.out.println(strNumber + 10);
		

	}

}
