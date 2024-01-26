package ch05.array04;

import java.util.Scanner;

public class Reserve6 {
	/*
	 * 	5명의 학생의 이름과 점수를 입력받고
   		해당학생의 이름과 학점이 A, B, C, D, F로 출력되도록 하세요
  		A : 90이상, B : 80이상, C : 70이상, D : 60이상, F : 60미만
	 */
	
	  public static void main(String[] args) {
	        Scanner sc = new Scanner(System.in);

	        String[] classmate = new String[5];
	        int[] score = new int[5];

	        // 학생의 이름과 점수
	        for (int i = 0; i < classmate.length; i++) {
	            System.out.print((i + 1) + "번째 학생 이름>> ");
	            classmate[i] = sc.next();

	            System.out.print((i + 1) + "번째 학생 점수>> ");
	            score[i] = sc.nextInt();
	        }

	        // 학점 출력
	        for (int j = 0; j < score.length; j++) {
	            System.out.println(classmate[j] + " 학생의 학점은 " + calculateGrade(score[j]) + "입니다.");
	            
	        	sc.close();
	        }
	    }

	    // 학점을 계산
	    private static char calculateGrade(int score) {
	        if (score >= 90) {
	            return 'A';
	        } else if (score >= 80) {
	            return 'B';
	        } else if (score >= 70) {
	            return 'C';
	        } else if (score >= 60) {
	            return 'D';
	        } else {
	            return 'F';
	        }
	    }
		
			
			
		
		
		
		
		
	
}

	

