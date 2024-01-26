package ch03.for10;

import java.util.Scanner;

public class  Resolve2 {

    /*
    2. 369게임을 작성합니다.
   1~99까지의 정수를 입력받고
   3,6,9중 하나가 있으면 "박수짝"을 출력하고
   2개가 있으면 "박수짝짝"을 출력하세요
   예를 들어 13은 "박수짝"
   36인 경우는 "박수짝짝"을 출력하면 됩니다.
     */
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

  
        System.out.print("1부터 99까지의 정수를 입력하세요: ");
        int number = sc.nextInt();

        
        String numStr = String.valueOf(number);
        int clapCount = 0;

        for (int i = 0; i < numStr.length(); i++) {
            char digitChar = numStr.charAt(i);
            int digit = Character.getNumericValue(digitChar);

            if (digit != 0 && digit % 3 == 0) {
                clapCount++;
            }
        }

        if (clapCount == 1) {
            System.out.println("박수짝");
        } else if (clapCount == 2) {
            System.out.println("박수짝짝");
        } else {
            System.out.println("박수 없음");
        }

        sc.close();
    }
    
}