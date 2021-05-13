package ch01;

/* @작성일 : 2021.05.10
 * @작성자 : 한상우
 * @설 명 : 연산자
 *             1) 최우선 연산자 : . [] () 
 *             2) 단항 연산자 : !(일반부정), ~(이진부정), +/-, ++/--, (cast 또는 자료형 연산자)
 *             3) 산술 연산자
 *             4) 시프트 연산자
 *             5) 비교 연산자
 *             6) 논리 연산자
 *             7) 삼항 연산자
 *             8) 대입 연산자
 *             9) 후위형 연산자
 *             10) 순차(컴마) 연산자
 * */

public class Exam02 {

	public static void main(String[] args) {
		boolean a = false;
		boolean b = !a;
		System.out.println(a);
		System.out.println(b);
		
		int c =~10; // 0000 1010
					// 1111 0101
		System.out.println(c);
		System.out.println();
		
		int x = 100;
		int y = -200;
		System.out.println(x+"\t" + y);
		System.out.println(-x);
		System.out.println(-y);
		

	}

}
