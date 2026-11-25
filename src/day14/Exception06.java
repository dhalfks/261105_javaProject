package day14;

import java.util.Arrays;

public class Exception06 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Exception06 e06 = new Exception06();
		try {
			
			int arr[] = e06.createArray(5, 100, 1);
			System.out.println(Arrays.toString(arr));		
			
		} catch (Exception e) {
			// TODO: handle exception
			System.out.println(e.getMessage());
			e.printStackTrace();
		}
		System.out.println("종료");

	}
	
	/* 배열의 길이(size)를 입력받아 해당 길이의 배열을 생성 
	 * 랜덤으로(start~count) 값을 채워 리턴하는 메서드
	 * 
	 * - size가 0보다 작거나 같다면 예외 발생 (RuntimeException)
	 * (math.random() * count) + start
	 * - count가 0보다 작거나 같다면 예외발생
	 * 
	 * 매개변수 : size, count, start
	 * 리턴타입 : 배열
	 * */
	
	public int[] createArray(int size, int count, int start) throws RuntimeException {
		if(size <= 0) {
			throw new RuntimeException("배열의 길이가 0 이하입니다.");
		}
		if(count <= 0) {
			throw new RuntimeException("random의 범위가 0보다 작습니다.");
		}
		int arr[] = new int[size];
		for(int i=0; i<arr.length; i++) {
			arr[i] = (int)(Math.random()*count)+start;
		}
		return arr;
		
	}

}
