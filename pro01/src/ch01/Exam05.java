package ch01;

/**
 * @date : 2021. 5. 11.
 * @author : sang woo
 * @description : 5) 비교 연산자 : <, > ,>=, <=, ==, !=
 */

public class Exam05 {

	public static void main(String[] args) {
		int a =10;
		int b =20;
		
		boolean c = a>b;  // 10 > 20
		boolean d = a<b;  // 10 < 20
		boolean e = a>=b;
		boolean f = a<=b;
		System.out.println("c:" + c);
		System.out.println("d:" + d);
		System.out.println("e:" + e);
		System.out.println("f:" + f);
		
		int x =100;
		int y =200;
		boolean z = x==y;     // 100==200
		boolean zz = x!=y;
		System.out.println("z:" + z);
		System.out.println("zz:" + zz);
		
		
		
		
		

	}

}
