package ch03.continue11;

public class Resolve1 {
	public static void main(String[] args) {
		int plus = 0;
		for(int i = 1; i<=100; i++) {
			if(i%3==0) {
				plus+=i;
				
			}
			System.out.println(plus);
		}
	}

}
