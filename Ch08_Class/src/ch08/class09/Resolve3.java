package ch08.class09;

/*
 * 3. 나는 마트에 가서 5000원을 주고 배 가격 2500를 샀다를 
   클래스로 설계해서 프로그래밍 하세요
   
 */

public class Resolve3 {

    public static class Purchase {
        private static int MONEY = 5000;
        private static String FRUIT = "배";
        private static int FRUIT_PRICE = 2500;

        public void buyFruit() {
            System.out.println("나는 마트에 가서 " + MONEY + "원을 주고 " +
                    FRUIT + "를 " + FRUIT_PRICE + "원에 샀다.");
        }
    }
    // 메인 메서드에서는 Purchase 클래스의 인스턴스를 생성하고 과일을 구매하는 메서드를 호출합니다.
    public static void main(String[] args) {
        Purchase purchase = new Purchase();
        purchase.buyFruit();
    }
}
