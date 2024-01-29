package ch05.array08;

import java.util.Arrays;

// 이차원 배열
public class Resolve1 {
	/*
	 * 정수 배열 5개를 할등하고
	 * Arrays.sort를 활용해서 최소값과 최대값을 얻으세요
	 * 
	 */
	public static void main(String[] args) {
		 int[] newArr = {1,3,5,7,9};
		
			
		System.out.println(Arrays.toString(newArr));
		Arrays.sort(newArr);
		 
		System.out.println("최솟값은 : " + newArr[0]+ "이고  최대값은 : " + newArr[newArr.length -1]);
	}
	
	 
	
}

