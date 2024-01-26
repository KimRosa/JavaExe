package ch05.array04;

import java.util.Arrays;

public class Reserve1 {
	//1. String 배열을 10명의 이름으로 초기화하고 순서대로 출력하세요
	
	  public static void main(String[] args) {
	        String[] names = new String[10];

	        // 이름 초기화
	        names[0] = "홍길동";
	        names[1] = "김로사";
	        names[2] = "김가연";
	        names[3] = "조경희";
	        names[4] = "김유경";
	        names[5] = "강하늘";
	        names[6] = "원빈";
	        names[7] = "한소희";
	        names[8] = "김민지";
	        names[9] = "황철수";

	        // 순서대로 출력
	        for (int i = 0; i < 10; i++) {
	            System.out.println(names[i]);
	        }
	    }
}
