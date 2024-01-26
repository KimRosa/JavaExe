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
        
        int n10 = number/10;
        int n1 = number%10;
        int clapCount = 0;
        
        if(n10==3 || n10==6 || n10==9) {
        	clapCount++;
        }
        if(n1==3 || n1==6 || n1==9) {
        	clapCount++;
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