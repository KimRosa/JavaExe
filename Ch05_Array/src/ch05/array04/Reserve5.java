package ch05.array04;

import java.util.Scanner;

public class Reserve5 {
	/*
	 *  int배열을 10개 생성하세요.
 사용자로부터 10개의 값을 입력받고
 순서대로 출력하고  총합을 구하세요
	 */
	
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int[] arr = new int[10];
		
		System.out.println("배열 값 10개를 입력하세요 >> ");
		for (int k = 0; k < 10; k++) {
            arr[k] = sc.nextInt();
        }

        int add = 0;
        for (int k = 0; k < 10; k++) {
            System.out.println(arr[k]);
            add += arr[k];
        }

        System.out.println("총합: " + add);
        
    	sc.close();
   
		}
	
	}
	

