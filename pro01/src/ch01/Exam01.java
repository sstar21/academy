package ch01;

/* @ 작성일 : 2021.5.10
 * @ 작성자  : 한상우
 * @ 설 명 : 자료형 ( 숫자, 문자 )
 * */

public class Exam01 {

	public static void main(String[] args) {
		System.out.println("자바 시작 입니다.");
		
		System.out.println("정수형 자료형");
		// 10 데이터 자료형 : byte, short, int, long
		byte su = 10;
		System.out.println(su);
		
		// 129 데이터를 처리한다. 정수(자료형), 변수 
		short a = 129;
		System.out.println(a);
		
		// 50000 정수형 (int), 변수
		int b = 50000;
		System.out.println(b);
		
		// 789
		long c = 789L;  
		System.out.println("c:"+c);
		System.out.println();
		
		System.out.println("실수형 자료형입니다.");
		float d = 3.1f;
		double f = 5.1234567;
		System.out.println("d:"+ d);
		System.out.println("f:"+ f);
		System.out.println();
		
		System.out.println("문자형 자료형 입니다.");
		char x = 'A';
		char y = '김';
		System.out.println(x);
		System.out.println("y:" + y);
		System.out.println();
		
		System.out.println("문자열 자료형 입니다.");
		String z = "안녕하세요.";
		String s  = "how are you";
		System.out.println("z:" + z);
		System.out.println("s:" + s);
		System.out.println("s:" + s + "\n");
		System.out.println();
		
		System.out.println("논리형 자료형");
		boolean i = true;
		boolean j = false;
		System.out.println(i);
		System.out.println(j);
		
		
		
		
				
	}
}
