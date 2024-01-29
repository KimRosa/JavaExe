package ch06.method01;

import java.util.Scanner;

public class Resolve3 {
	/*
	 * 3. int result = total(10, 100);
  		위처럼 사용하면 result에는 10부터 100까지의 누적합이 저장되어야 합니다
  		total메서드를 작성하고 사용해보세요.

	 */
	
	public static void Total(int num0, int num1) {
		int result = 0;
		
		for(int i=num0; i<num1+1; i++) {
			result += i;
		}
		
		
		System.out.println("결과값은 " + result);
		
	}
	
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		System.out.print("1번째 정수 입력 >> ");
		int num0 = sc.nextInt();
		System.out.print("2번째 정수 입력 >> ");
		int num1 = sc.nextInt();
		
		Total(num0, num1);
		
		
		
		
		sc.close();
	}
	
}
