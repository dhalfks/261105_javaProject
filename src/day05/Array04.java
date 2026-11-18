package day05;

public class Array04 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int arr[] = {45,87,59,68,71,98,95,68,92,84,89};
		int sum = 0;
		// 합계와 평균을 출력
		for(int i=0; i<arr.length;i++) {
			sum += arr[i];
		}
		
		System.out.println("합계 : "+sum);
		System.out.println("평균 : " + sum / arr.length);
		
		// 가장 큰값, 가장 작은값  
		int max = arr[0]; // 45
		int min = arr[0];
		for(int i=0; i<arr.length; i++) {
			if(max < arr[i]) {
				max = arr[i]; // 87
			}
			if(min > arr[i]) {
				min = arr[i];
			}
		}
		System.out.println("최대값: "+max);
		System.out.println("최소값: "+min);
		
		//Math.max(a, b);  Math.min(a,b)
		System.out.println("---Math class 활용---");
		
		max = arr[0];
		min = arr[0];
		for(int i=0; i<arr.length; i++) {
			max = Math.max(max, arr[i]);
			min = Math.min(min, arr[i]);
		}
		System.out.println("최대값: "+max);
		System.out.println("최소값: "+min);

	}

}
