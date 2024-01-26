package ch03.for10;

import java.util.Scanner;

public class Resolve15 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int sum = 0;
        int input;

        do {
            System.out.print("정수를 입력하세요 (0을 입력하면 종료): ");
            input = sc.nextInt();
            sum += input;
        } while (input != 0);

        System.out.println("입력한 정수의 합: " + sum);

        sc.close();
    }
}