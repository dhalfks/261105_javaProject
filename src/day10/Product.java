package day10;

public class Product {
	// 제품 클래스 : 판매하는 제품
	// 재고, 수입원, 원가, 가격, 부가가치세 ...
	// 판매제품명, 가격
	private static int count;
	private int no;
	private String name;
	private int price;
	
	// 생성자
	public Product() {}
	public Product(String name, int price) {
		this.no = ++count;
		this.name = name;
		this.price = price;
	}
	
	// 객체 생성 이후 상품을 추가하는 메서드 별도필요... (편리성을 위해)
	public void insertProduct(String name, int price) {
		this.name = name;
		this.price = price;
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
	public int getNo() {
		return no;
	}
	public void setNo(int no) {
		this.no = no;
	}
	@Override
	public String toString() {
		return "Product [no=" + no + ", name=" + name + ", price=" + price + "]";
	}

	
}
