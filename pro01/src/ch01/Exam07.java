package ch01;

/**
 * @date : 2021. 5. 11.
 * @author : sang woo
 * @description : 7) 삼항연산자 : 조건식 ? 참:거짓
 * 			      8) 대입 연산자 : =, *=, /= , &=, ^=, !=, +=, != ....
 * 				  9) 후의형 증감연산자 : ++/--
 * 				  10) 순차(컴마 연산자) : ,
 */

public class Exam07 {

	public static void main(String[] args) {
		int a = 20;
		int b = 30;
		int c = a!=b ? a:b;  // 참이면 a값 거짓이면 b가 넘어감
		String str = a==b ? "apple" : "banana"; // 문자열이라 던져주는값이 String 을 받는다.
		
		System.out.println("c:" + c);
		System.out.println("str:" + str);
		
		int jumsu =50;
		String result = jumsu > 50 ? "합격" : "불합격"; // (su%2==0) ? "짝수" : "홀수" // (su > 0) ? "양수" : "음수"  // (age >=20 && age < 30)
		System.out.println(result); // 삼항연산자의 문제점 : 값이 둘다 뽑힌다.
		
		int i =100;
		System.out.print(i+=2); // 102
		System.out.println(i-=2); // 100
		System.out.println(i*=2); // 200
		System.out.println(i/=2); //100
		System.out.println(i);
		
		int x=10, y=20, z=30;
		System.out.println(x + "\t" + y + "\t" + z);
		
		
		
		
		
		
		

	}

}
