package ch03.for10;

public class ForEx2 {
	public static void main(String[] args) {
		// 구구단 전체출력
		
		for(int i=2; i<10; i++) {
			for (int j=1; j<10; j++)
				System.out.printf("%d*%d = %d\n", i, j, i*j);
			System.out.println();
		}
	}
}
