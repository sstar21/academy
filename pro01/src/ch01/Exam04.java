package ch01;

/**
 * @date : 2021. 5. 10.
 * @author : sang woo
 * @description : 2) 단항 연산자 : !(일반부정), ~(이진부정), +/-, ++/-- 전위형 증감연산자, (cast 또는 자료형 연산자)
 * 				  3) 산술 연산자 : + , - , * ,/ , %(나머지)
 * 				  4) 시프트 연산자 : <<, >>, >>> 비트이동(이진수)
 * 				  5) 비교 연산자 : <, > ,>=, <=, ==, !=
 * 				  6) 논리 연산자 : &, ^, |(이진), &&, ||(십진수) 
 * 				  8) 대입 연산자 : =
 * 				  9) 후위형 단항 연산자  : 변수 뒤에 붙음 ++/--
 */

public class Exam04 {

	public static void main(String[] args) {
		// byte, short, int, long
		
		byte a=10;
		byte b=a;
		System.out.println(a+"\t" + b);
		
		byte c=20;
		short d=c;
		System.out.println(c+"\t" + d);
		
		short x=50;
		byte y=(byte) x;
		System.out.println(x + "\t" + y);
		
		int su = 1000;
		short value =(short) su;
		System.out.println(su + "\t" + value);
		
		float i = 24.5f;
		float j = i;
		System.out.println(i + "\t" + j);
		
		double ii = 55.5;
		float jj = (float) ii;
		System.out.println(ii + "\t" + jj);
		
		int aa=10;
		int bb=20;
		int cc = aa+bb;
		System.out.println(cc);
		
		float dd=22.2f;
		float kk=aa+dd;
		System.out.println(kk);
		
		int su1 = 22;
		float su2 = 24.5f;
		int su3 = su1+(int)su2;
		System.out.println(su3);
		System.out.println();
	
		int kor =100;
		int eng = 77;
		int mat = 88;
		int tot = kor + eng + mat;
		float avg = (float) tot/3; //220.0f /3
		System.out.println(avg);
				
		int v =10;
		int t =3;
		float zz = v/(float)t;      // 10/3.0
		System.out.println("zzz:"+zz);
		System.out.println();
		
		int s = 10;
		int q = 20;
		int sum = s + q;
		int cha = s - q;
		int mu1 = s * q;
		float div =(float) s / q; // 10.0f/20
		int rest = s%3; // s에서 3을 나눈 나머지값
		System.out.println("합:" + sum);
		System.out.println("차:" + cha);
		System.out.println("곱:" + mu1);
		System.out.println("나눗셈:" + div);
		System.out.println("나머지:" + rest);
		
		
		
		
	}

}
