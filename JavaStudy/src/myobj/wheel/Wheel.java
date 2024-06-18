package myobj.wheel;

public class Wheel {
	
	Product[] products;
	int productsCnt = 0;
	int productsProbability = 0;
	boolean probabilityCheck;
	
	public Wheel(int cnt) {
		products = new Product[cnt];
	}
	
	public void productAdd(String name, int price, int count, int probability) {
		if(productsProbability + probability > 100) {
			System.out.println("상품들의 확률의 합은 100% 이상일 수 없습니다.");
			probabilityCheck = false;
		}else {
			products[productsCnt++] = new Product(name, price, count, probability, productsProbability, productsProbability + probability);
			productsProbability += probability;
			probabilityCheck = true;
		}
	}
	
	public void changeProbability(String name, int probability) {
		boolean isChangeName = false;
		
		for(int i = 0; i < products.length; i++) {
			isChangeName = products[i].getName().equals(name);
			if(isChangeName) {
				for (int j = i; j < products.length; j++) {
					int preMax = products[j - 1].getMaxProbability();
					
					if(preMax + probability > 100) {
						System.out.println("상품들의 확률의 합은 100% 이상일 수 없습니다.");
						probabilityCheck = false;
						return;
					}
					
					products[j].modifyProbability(preMax, probability);
					if(j + 1 < products.length) {
						probability = products[j + 1].getProbability();
					}
					
				}
			}
		}
		
	}
	
	public void ProductPrize() {
		int num = (int)(Math.random() * 100 + 1);
		
		for(Product product : products) {
			if(product.getMaxProbability() >= num && product.getMinProbability() < num) {
				if(product.getCount() > 0) {
					product.minusCount();
					System.out.println(product.getProductInfo());
					return;
				}else {
					System.out.printf("%s는 모두 소진된 상품입니다.\n", product.getName());
					ProductPrize();
					return;
				}
			}
		}
		System.out.println("꽝");
		
	}
	
	public boolean isProductCnt() {
		for(Product product : products) {
			if(product.getCount() > 0) {
				return true;
			}
		}
		return false;
	}
	
	public boolean isProbabilityCheck() {
		return this.probabilityCheck;
	}
	
	
}
