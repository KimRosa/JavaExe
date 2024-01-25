package ch02.transtype;

public class TransDataType {
	public static void main(String[] args) {
		int total = 297;	// 총점
		int stNum = 4;		// 학생수
		
		double avg = 0.;
		
		System.out.println("총점은 " + total + "입니다.");
		System.out.println("평균은 " + total/stNum + "입니다.");
	 	
		avg = total/stNum;
		System.out.println("평균은 " + avg + "입니다.");
		
		
		/* 실수와 정수 연산의 결과는? 
		 * 실수의 표현범위 > 정수 이기 때문에
		 * 결과값은 실수 자료형으로 나온다. 
		 */
		
		// (double)total : 컴파일러에 의해 정수 total은 double로 변환
		avg = (double)total/stNum;
		System.out.println("평균은 " + avg + "입니다.");
		
		// 소수점 없애고 싶다면?
		int nAvg = (int)avg;
		System.out.println("평균은 " + nAvg + "입니다.");
		
		//char의 쓰임. 유니코드!
		char ch = 'A';
		System.out.println(ch);
		System.out.println((int)ch);
		
		System.out.println((int)'a');
		System.out.println((char)66);
		
}

}