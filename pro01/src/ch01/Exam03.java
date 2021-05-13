package ch01;

/**
 * @date : 2021. 5. 10.
 * @author : sang woo
 * @description : 2) 단항 연산자 : !(일반부정), ~(이진부정), +/-, ++/-- 전위형 증감연산자, (cast 또는 자료형 연산자)
 * 				  3) 산술 연산자 : + , - , * ,/ , %(나머지)
 * 				  8) 대입 연산자 : =
 * 				  9) 후위형 단항 연산자  : 변수 뒤에 붙음 ++/--
 */

public class Exam03 {

	public static void main(String[] args) {
		
		int x = 10;
		++x;
		++x;
		x++;
		System.out.println("x:" + x );
		
		--x;
		x--;
		System.out.println("x:" + x );
		
		int y = 20;
		int z = y++;
		System.out.println("y:" +y);
		System.out.println("z:" +z);
		
		int a = 10;
		int b = 20;
		int c = a++ + ++b; // ++a + ++b , a++ + b++
		
		System.out.println("c:" + c);
		
	}

}
