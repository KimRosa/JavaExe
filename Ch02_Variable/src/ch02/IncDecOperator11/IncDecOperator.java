package ch02.IncDecOperator11;

public class IncDecOperator {
	public static void main(String[] args) {
		int num = 0;
		num++;
		System.out.println(num);
		
		++num;
		System.out.println(num);
		
		// num의 값을 대입한 후 num이 1 증가 
		int result = num++;
		System.out.println("result=" + result);
		System.out.println("num= " + num);
		
		// num을 1 증가한 후 result에 대입
		int result = ++num;
		System.out.println("result=" + result);
		System.out.println("num= " + num);
		
		System.out.println("num= " + num--);
		System.out.println("num= " + --num);
		
		
	}
}
