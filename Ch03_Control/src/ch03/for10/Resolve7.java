package ch03.for10;



public class Resolve7 {
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