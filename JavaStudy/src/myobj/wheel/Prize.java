package myobj.wheel;

public class Prize {
	private String name;
	private int value;
	private int qty;
	private int degree;
	
	public Prize(String name, int value, int qty, int degree) {
		this.name = name;
		this.value = value;
		this.qty = qty;
		this.degree = degree;
	}

	public void minusQty() {
		this.qty--;
	}
	
	public String getName() {
		return name;
	}

	public int getValue() {
		return value;
	}

	public int getQty() {
		return qty;
	}

	public int getDegree() {
		return degree;
	}
	
	public void setDegree(int degree) {
		this.degree = degree;
	}
	
	@Override
	public String toString() {
		return String.format("%d원 상당의 %s", this.value, this.name);
	}
	

}
