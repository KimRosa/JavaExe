package ch09.extends05;

public class ExtendsMain {
	public static void main(String[] args) {
		Child child = new Child(7,99999L, 72);
		
		child.handsome();
		child.wealth();
		child.play();
		
		System.out.println("잘생김 점수 : "+ child.handsomeScore);
		System.out.println("돈 : " + child.money);
		System.out.println();
	}
	

}
