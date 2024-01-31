package ch08.class09;

import ch08.class08.FruitBuyer;
import ch08.class08.FruitSeller;

/*
 * 1.FruitMain클래스에		
	현재는 buyer.buyApple(seller, 2000); 처럼 프로그래밍되어
	있습니다.
	아래처럼 seller를 중심으로 수정하세요.
	seller.saleApple(buyer, 2000);
 */
public class Resolve1 {
	public class FruitMain {
		public static void main(String[] args) {
			FruitSeller seller = new FruitSeller(20);
			FruitBuyer buyer = new FruitBuyer(10000);
			
			seller.showSaleReult();
			buyer.showBuyResult();
			
			seller.saleApple(buyer, 2000);
			
			seller.showSaleReult();
			buyer.showBuyResult();
		}

	}

}
