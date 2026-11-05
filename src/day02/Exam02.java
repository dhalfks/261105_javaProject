package day02;

import java.util.Scanner;

public class Exam02 {

	public static void main(String[] args) {
		// 정수 2개와 연산자 1개를 입력받아 두 정수의 연산 결과를 출력
		// 2 3 + => 2 + 3 = 5
		// 2 3 - => 2 - 3 = -1
		// 입력 가능한 연산자는 + - * / %
		// 연산자 입력 => String(equals) char
		// "+".equals("+");
		// String s = "-";
		// s.equals("-");

		Scanner scan = new Scanner(System.in);
		System.out.println("두 정수를 띄어쓰기하여 입력 >");
		int n1 = scan.nextInt();
		int n2 = scan.nextInt();

		System.out.println(n1);
		System.out.println(n2);

		// 연산자 String
		String op = scan.next(); // "+"

		// char 형태
		char opChar = scan.next().charAt(0); // '+'

		// switch(opChar) {
		// case '+':
		// System.out.println();
		// }

		// if(opChar == '+' || opChar=='-')

		switch (op) {
		case "+":
			System.out.println(n1 + op + n2 + "=" + (n1 + n2));
			break;
		case "-":
			System.out.println(n1 + op + n2 + "=" + (n1 - n2));
			break;
		case "*":
			System.out.println(n1 + op + n2 + "=" + (n1 * n2));
			break;
		case "/":
			if (n2 == 0) {
				System.out.println("0으로 나눌수 없습니다.");
			} else {
				System.out.println(n1 + op + n2 + "=" + (n1 / n2));
			}
			break;
		case "%":
			System.out.println(n1 + op + n2 + "=" + (n1 % n2));
			break;
		default:
			System.out.println("잘못된 연산자");

		}

		int result = 0;
		switch (op) {
		case "+":
			result = n1 + n2;
			break;
		case "-":
			result = n1 - n2;
			break;
		case "*":
			result = n1 * n2;
			break;
		case "/":
			result = n1 / n2;
			break;
		case "%":
			result = n1 % n2;
			break;
		default:
			System.out.println("잘못된 연산자");

		}
		if (op.equals("+") || op.equals("-") || op.equals("*") || op.equals("/") || op.equals("%")) {
			System.out.println(n1 + op + n2 + "=" + result);

		}

		if (op.equals("+")) {
			System.out.println();
		}

		
		scan.close();
	}

}
