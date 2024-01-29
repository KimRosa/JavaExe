package ch06.method01;

import java.util.Scanner;

public class Resolve5 {
	/*
	 *  gugudan(3);
   
   		구구단 메서드를 void 리턴형으로 제작하세요.
  		3을 입력하면 3단이 출력됩니다.
	 */
	
	public static void Gugudan(int num) {
		
		for(int j=1; j<10; j++) {
				System.out.println(num + " x " + j + " = " + num * j);
		
			}	
		}
	

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		System.out.print("단수 입력 >> ");
		int num = sc.nextInt();
	
		
		Gugudan(num);
		
		
		
		
		sc.close();
	}
	
}
