package day13;

public class VIPCustomer extends Customer {
	// - saleRatio, agentNum, agentName
	private double saleRatio;
	private String agentNum;
	private String agentName;
	
	public VIPCustomer(String id, String name, String agentNum, String agentName) {
		super(id, name); // customer 기본 생성자 셋팅
		customerGread = "VIP";
		ratio = 0.05;
		this.saleRatio = 0.1;
		this.agentNum = agentNum;
		this.agentName = agentName;
	}

	@Override
	public int calcPrice(int price) {
		// TODO Auto-generated method stub
		super.calcPrice(price);
		return price - (int)(price * saleRatio); 
	}

	@Override
	public void printInfo() {
		// 부모 클래스에서 작성한 출력 내용
		// 전담 상담사는 짱아이고, 번호는 1111입니다. <- VIP만 추가
		super.printInfo();
		System.out.println("전담 상담사는 "+agentName+"이고, 번호는 " + agentNum+"입니다.");
	}

	public double getSaleRatio() {
		return saleRatio;
	}

	public void setSaleRatio(double saleRatio) {
		this.saleRatio = saleRatio;
	}

	public String getAgentNum() {
		return agentNum;
	}

	public void setAgentNum(String agentNum) {
		this.agentNum = agentNum;
	}

	public String getAgentName() {
		return agentName;
	}

	public void setAgentName(String agentName) {
		this.agentName = agentName;
	}

	@Override
	public String toString() {
		return "VIPCustomer [saleRatio=" + saleRatio + ", agentNum=" + agentNum + ", agentName=" + agentName
				+ ", customerId=" + customerId + ", customerName=" + customerName + ", customerGread=" + customerGread
				+ ", point=" + point + ", ratio=" + ratio + "]";
	}

	
	
}
