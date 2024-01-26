package ch03.for10;



public class Resolve7 {
	/*
	 * 7. do~while문을 이용해서 1부터 10까지 중에 짝수만 출력하세요
   do~while문내에 조건문을 넣어주면 됨
   짝수 조건 if(num % 2 == 0)
	 */
	 public static void main(String[] args) {
	        int number = 1;
	        int sum = 0;

	        do {
	            sum += number;
	            number++;
	        } while (number <= 10);

	        System.out.println("1부터 10까지의 합: " + sum);
	    }
	}