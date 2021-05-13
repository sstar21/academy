package ch01;

/**
 * @date : 2021. 5. 11.
 * @author : sang woo
 * @description : 6) 논리 연산자 : &, ^, |(이진), &&, ||(십진수) 
 */

public class Exam06 {

	public static void main(String[] args) {
		
		byte a = 10;  // 1byte == 8bit, 2byte == 16bit, 4bite ==32bit , 8byte == 64bit
		byte b = 2;
		
		// a =10 은 2진수로 1010 // 0000 1010 == 10 8비트라서 플러스는 0으로 채워짐 
		// 2를 이진수로 //  0000 0010 == 2
		// ----------------------& 양쪽 조건이 참일 때 참이다  참은 1 거짓은 0
        // 0000 0010 & = 2
	    // 0000 1010 | == 10                 or 
		// 0000 1000 ^ == 8                  
		
		System.out.println((a&b));
		System.out.println((a|b));
		System.out.println((a^b));
		System.out.println();
		
		int  x =15;
		boolean y = x>10 && x<20; // 15 > 10 1(참)      (참)1 15 < 20  true가 나온다.
		boolean z = x==10 || x==15; // 15==10 거짓   or   (참)15 == 15
		System.out.println(y);
		System.out.println(z);
		
		
		

	}

}
