package ch05.array08;

import java.util.Arrays;

/*
 *  정수 배열5개를 할당하고
 *  System.out.println(Arrays.toString(newArr));
 *  로 배열을 출력했을 때 거꾸로 출력되도록
 *  배열의 값을 거꾸로 저장하세요. 
 *  
 */
public class Resolve3 {
	public static void main(String[] args) {
		int[] numArr = {1,3,5,7,9};
		int[] newArr = new int[numArr.length];
		
		for(int i = numArr.length-1, j = 0; i>=0; i++,j++) {
			newArr[j] = numArr[i];
			
		}
		
		System.out.println(Arrays.toString(newArr));
		
	}
}


