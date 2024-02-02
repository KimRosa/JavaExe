package ch09.interface12;

public class Scv implements StarUnit{

	@Override // @Override은, 기능은 없지만 "이건 부모로부터 받아온 메서드야!" 라는 걸 알려줌
	public void walk() {
		System.out.println("스르륵==");
	}

	@Override
	public void attack() {
		System.out.println("징징==");
	}

	@Override
	public void die() {
		System.out.println("펑==");
	}


}
