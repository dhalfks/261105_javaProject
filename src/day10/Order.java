package day10;

public class Order {
	// 주문 클래스 : 손님이 주문
	// 날짜, 세금, 배달비, 포장용기 ...
	// 상품명, 개수, 가격(판매금액), 금액(개수*가격)
	private String name;
	private int price;
	private int count;
	private int total;
	
	public Order() {}
	public Order(Product p, int count) {
		this.name = p.getName();
		this.price = p.getPrice();
		this.count = count;
		this.total = price * count;
	}
	
	// 주문추가
	public void insertOrder(Product p, int count) {
		this.name = p.getName();
		this.price = p.getPrice();
		this.count = count;
		this.total = price * count;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public int getPrice() {
		return price;
	}
	public void setPrice(int price) {
		this.price = price;
	}
	public int getCount() {
		return count;
	}
	public void setCount(int count) {
		this.count = count;
	}
	public int getTotal() {
		return total;
	}
	public void setTotal(int total) {
		this.total = total;
	}
	@Override
	public String toString() {
		return "[" + name + " : " + price + "   " + count + " = " + total + "]";
	}
	
}
