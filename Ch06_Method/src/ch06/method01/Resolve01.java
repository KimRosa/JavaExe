package ch06.method01;

import java.util.Scanner;

public class Resolve01 {
    /*
     * 1. 2개의 정수를 입력받고 큰 값을 반환하는 메서드와
     * 작은 값을 반환하는 메서드를 작성하고 사용하세요
     */

    // 주어진 두 정수 중에서 큰 값을 반환하는 메서드
    public static int findMax(int num0, int num1) {
        return Math.max(num0, num1);
    }

    // 주어진 두 정수 중에서 작은 값을 반환하는 메서드
    public static int findMin(int num0, int num1) {
        return Math.min(num0, num1);
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("1번째 정수 입력 >> ");
        int num0 = sc.nextInt();
        System.out.print("2번째 정수 입력 >> ");
        int num1 = sc.nextInt();

        // 큰 값과 작은 값을 찾아서 변수에 저장
        int max = findMax(num0, num1);
        int min = findMin(num0, num1);

        // 결과 출력
        System.out.println("더 큰 값: " + max);
        System.out.println("더 작은 값: " + min);

        sc.close();
    }
}
