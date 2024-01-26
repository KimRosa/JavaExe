package ch05.array08;

import java.util.Arrays;

public class Reserve2 {
/*
 * 정수 배열 5개를 할등하고
 * Arrays.sort를 사용하지 말고 최소값과 최대값을 얻으세요
 * 
 */
	public static void main(String[] args) {
		 int[] newArr = {3,2,5,4,6};
		 Arrays.sort(newArr);
			
		System.out.println(Arrays.toString(newArr));
		
		System.out.println("최솟값은 : " + newArr[0]+ "이고  최대값은 : " + newArr[4]);
	}
}

