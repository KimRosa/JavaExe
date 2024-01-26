package ch03.for10;

import java.util.Scanner;

public class Resolve14 {

    /*
     * 입력받은 숫자의 구구단을 출력하세요
   예를 들어 3을 입력하면 
   3 x 1 = 3
   3 x 2 = 6
   ...
   3 x 9 = 27
     */

     public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

     
        System.out.print("정수를 입력하세요: ");
        int number = sc.nextInt();

     
        for (int i = 1; i <= 9; i++) {
            System.out.println(number + " x " + i + " = " + (number * i));
        }

        sc.close();
    }
    
}