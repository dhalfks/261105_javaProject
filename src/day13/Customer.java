package day13;

public class Customer {
	
	// 멤버변수 : 고객ID, 고객명, 등급, 포인트(적립), 적립비율
	/*- 등급체계
		 * Silver / Gold / VIP
		 * - Silver : 제품 구매시 할인 0% / 구매 금액의 1% 적립
		 * - Gold : 제품 구매시 할인 5% / 구매 금액의 3% 적립
		 * - VIP : 제품 구매시 할인 10% / 구매 금액의 5% 적립
		 * - VIP : 전담 상담사 멤버변수 추가 (agentNum, agentName)
	 * */
	protected String customerId;
	protected String customerName;
	protected String customerGread; // 등급
	protected int point; // 포인트
	protected double ratio; // 적립비율
	
	public Customer() {}
	public Customer(String customerId, String name) {
		this.customerId = customerId;
		this.customerName = name;
		this.customerGread = "Silver";
		this.ratio = 0.01;
	}
	
	// 포인트 적립 메서드 => 구매금액 리턴
	/* 매개변수 : 가격  / 리턴타입 : int
	 * */
	public int calcPrice(int price) {
		this.point += (int)(price*ratio);
		return price;
	}
	
	// 출력
	// 홍길동 님은 Gold 고개이며, 현재 포인트는 5000점 입니다.
	public void printInfo() {
		System.out.print(customerName+"님은 "+customerGread+"고객이며, ");
		System.out.println("현재 포인트는 "+point+"점 입니다.");
	}
	
	
	@Override
	public String toString() {
		return "Customer [customerId=" + customerId + ", customerName=" + customerName + ", customerGread="
				+ customerGread + ", point=" + point + ", ratio=" + ratio + "]";
	}
	
}
