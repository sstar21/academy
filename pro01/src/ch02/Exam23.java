package ch02;

import java.util.Scanner;

/**
 * @date : 2021. 5. 12.
 * @author : sang woo
 * @description : 
 */
public class Exam23 {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in); //숫자(정수,실수), 문자 (char, String)
		
		
		System.out.println("수입력:");
		int x = sc.nextInt();
		++x;
		
		System.out.println("수입력:");
		byte y=sc.nextByte();
		
		System.out.println("수입력:");
		long z=sc.nextLong();
		
		System.out.println("실수입력:");
		float a=sc.nextFloat();
		
		
		System.out.println("문자열 입력:");
		String str=sc.next();
		
		System.out.println(x);
		System.out.println(y);
		System.out.println(z);
		
		System.out.println(a);
		System.out.println(str);
		
		System.out.println("문자 입력");
		String s=sc.next();
		char ch = s.charAt(0);
		System.out.println(ch);
		
		sc.close();

	}

}
