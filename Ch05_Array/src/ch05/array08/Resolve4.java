package ch05.array08;

import java.util.Arrays;

/*
 *  정수 배열 5개를 할당하고
   Arrays.sort를 사용하지 말고
   배열을 오름차순으로 정렬하도록 저장하세요.
   그리고 출력하세요.
 *  
 */
public class Resolve4 {
    public static void main(String[] args) {
        int[] numArr = {5,4,3,2,1};
        int[] newArr = new int[numArr.length];

        // 배열 복사
        System.arraycopy(numArr, 0, newArr, 0, numArr.length);
      
        
        // 버블 정렬
        for (int i = 0; i < newArr.length - 1; i++) {
            for (int j = 0; j < newArr.length - 1 - i; j++) {
                if (newArr[j] > newArr[j + 1]) {
                    // 두 값을 교환
                    int temp = newArr[j];
                    newArr[j] = newArr[j + 1];
                    newArr[j + 1] = temp;
                }
            }
        }

        System.out.println(Arrays.toString(newArr));
    }
}


