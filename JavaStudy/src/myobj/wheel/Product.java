package myobj.wheel;

public class Product {
	String name;
	int price;
	int count;
	int probability;
	int maxProbability; 
	int minProbability; 
	
	public Product(String name, int price, int count, int probability, int minProbability, int maxProbability) {
		this.name = name;
		this.price = price;
		this.count = count;
		this.probability = probability;
		this.minProbability = minProbability;
		this.maxProbability = maxProbability;
	}
	
	public void modifyProbability(int prePb, int currPb) {
		this.minProbability = prePb;
		this.maxProbability = prePb + currPb;
		this.probability = currPb;
	}
	
	public void setProbability(int probability) {
		this.probability = probability;
	}
	
	public String getName() {
		return this.name;
	}
	
	public int getMaxProbability() {
		return this.maxProbability;
	}
	
	public int getMinProbability() {
		return this.minProbability;
	}
	
	public String getProductInfo() {
		return String.format("[%s] 당첨\n상품 가치: %d\n남은 수량: %d\n", name, price, count);
	}
	
	public int getProbability() {
		return this.probability;
	}
	
	public void minusCount() {
		this.count--;
	}
	
	public int getCount() {
		return this.count;
	}
	
}
