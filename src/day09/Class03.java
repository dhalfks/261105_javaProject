package day09;

public class Class03 {

	public static void main(String[] args) {
		// 클래스 생성 
		// 학생이름, 국어점수, 영어점수, 수학점수 를 객체로 하는 클래스 생성
		// 이름 (국어, 영어, 수학) => 출력메서드
		// 메서드를 호출하면 국어+영어+수학 리턴되는 => 합계메서드
		// 메서드를 호출하면 합계/3 평균이 리턴되는 => 평균메서드
		// 각각 메버변수의 getter/setter 생성
		
		StudentClass s = new StudentClass();
		s.print();
		s.setName("홍길동");
		s.setKor(78);
		s.setEng(98);
		s.setMath(69);
		
		s.print();
		int sum = s.sum();
		System.out.println("합계:"+sum);
		System.out.println("평균:"+s.avg());
		
		StudentClass[] stsudentArr = new StudentClass[10];
		stsudentArr[0] = new StudentClass();
		stsudentArr[0].setName("영이");
		stsudentArr[0].setKor(75);
		stsudentArr[0].setEng(68);
		stsudentArr[0].setMath(62);
		stsudentArr[0].print();

	}

}

class StudentClass{
	// 멤버변수
	private String name;
	private int kor;
	private int eng;
	private int math;
//	private int sum;  // setter가 없어야 하는 변수
//	private double avg; // setter가 없어야 하는 변수
	
	
	
	// 내가 만드는 메서드
	// print
	public void print() {
		System.out.println("--"+name+"--");
		System.out.println("kor:"+kor+" eng:"+eng+" math:"+math);
		System.out.println("합계: "+sum() +" / 평균: "+avg());
	}
	// sum()
	public int sum() {
		return kor + eng + math;
	}
	// avg()
	public double avg() {
		return (double)sum() / 3;
	}
	
	
	
	// getter/setter
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public int getKor() {
		return kor;
	}
	public void setKor(int kor) {
		this.kor = kor;
	}
	public int getEng() {
		return eng;
	}
	public void setEng(int eng) {
		this.eng = eng;
	}
	public int getMath() {
		return math;
	}
	public void setMath(int math) {
		this.math = math;
	}
	
}