package ch08.class09.answer01;

public class FruitBuyer {
	private int numOfApple;			// 사과개수
	private int money;
	
	public FruitBuyer(int money) {
		this.money = money;
		this.numOfApple = 0;
	}
	
	public void buyApple(FruitSeller seller, int money) {
		this.numOfApple += seller.saleApple(money);
		this.money -= money;
	}
	
	public void showBuyResult() {
		System.out.println("*** 과일 구매자의 현재 상황 ***");
		System.out.println("현재 잔액 : " + this.money);
		System.out.println("사과 개수 : " + this.numOfApple);
	}

}
// ctrl+ shift +o(5)