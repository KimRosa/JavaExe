package ch08.class03;


/*
 *  static 메서드는 객체를 만들지 않아도 바로 사용가능하다.
 * 
 */

/*
 *  static 메서드는 객체를 만들지 않아도 메모리에 자동으로 올라간다. 
 *  
 *  [ 용도 ]
 *  - 범용적인 기능의 함수를 만들 때
 *  - 어느곳에서나 쉽게 사용하고 싶은 함수를 만들 때
 *  - 객체에 따라 변수의 값의 적용을 다르게 받지 않아도 될 때
 */
public class ArithEx {
	public static void main(String[] args) {
		int a=10, b=5;
		int result = 0;
		
		result = Arith.add(a, b);
		System.out.println(result);
		
		result = Arith.sub(a, b);
		System.out.println(result);
		
		result = Arith.mul(a, b);
		System.out.println(result);
		
		result = Arith.div(a, b);
		System.out.println(result);
	}

}
