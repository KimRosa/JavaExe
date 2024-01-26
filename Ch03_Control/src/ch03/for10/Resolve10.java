package ch03.for10;

public class Resolve10 {
    /*
     * for문을 이용해서 1부터 10까지 합을 출력하세요
     */

     public static void main(String[] args) {
        int sum = 0;

        for (int number = 1; number <= 10; number++) {
            sum += number;
        }

        System.out.println("1부터 10까지의 합: " + sum);
    }
}