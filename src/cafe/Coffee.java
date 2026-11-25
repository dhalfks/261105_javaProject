package cafe;

public abstract class Coffee {
	// - 메뉴명, 가격, 옵션, 옵션가격, 수량
	protected String name;
	protected int basePrice;
	protected int quantity;
	
	public Coffee() {}
	public Coffee(String name, int price, int cnt) {
		this.name= name;
		this.basePrice = price;
		this.quantity = cnt;
	}
	
	// 자식들의 가격 계산
	public abstract int getPrice();
	
	// 옵션 내용 설명
	public abstract String getDescription(); 
	
}

class Americano extends Coffee{
	
	private int extra_price = 500;
	private boolean extraWater;
	
	public Americano(int cnt, boolean extraWater) {
		super("아메리카노", 2000, cnt);
		this.extraWater = extraWater;
		
	}

	@Override
	public int getPrice() {
		// 추가 옵션 여부에 따라 추가 가격을 더해서 * 수량 
		extra_price = extraWater ? extra_price : 0;
		return (basePrice + extra_price) * quantity;
	}

	@Override
	public String getDescription() {
		// TODO Auto-generated method stub
		return extraWater ? name + "+(물추가)" : name;
	}
	
}

class Latte extends Coffee{
	private int extra_price = 1000;
	private boolean extraMilk;
	
	public Latte(int cnt, boolean extra) {
		super("라떼", 3500, cnt);
		this.extraMilk = extra;
	}

	@Override
	public int getPrice() {
		// TODO Auto-generated method stub
		return (basePrice + (extraMilk ? extra_price : 0)) * quantity;
	}

	@Override
	public String getDescription() {
		// TODO Auto-generated method stub
		return extraMilk ? name+"+(우유추가)" : name;
	}
	
}
class Mocha extends Coffee{
	private int extra_price = 1500;
	private boolean extraChocolate;
	
	public Mocha(int cnt, boolean extra) {
		super("모카", 3500, cnt);
		this.extraChocolate = extra;
	}
	
	@Override
	public int getPrice() {
		// TODO Auto-generated method stub
		return (basePrice + (extraChocolate ? extra_price : 0)) * quantity;
	}
	
	@Override
	public String getDescription() {
		// TODO Auto-generated method stub
		return extraChocolate ? name+"+(초코추가)" : name;
	}
	
}
