package ch02;

import java.util.Scanner;

/**
 * @date : 2021. 5. 12.
 * @author : sang woo
 * @description : 
 */
public class Exam23 {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in); //����(����,�Ǽ�), ���� (char, String)
		
		
		System.out.println("���Է�:");
		int x = sc.nextInt();
		++x;
		
		System.out.println("���Է�:");
		byte y=sc.nextByte();
		
		System.out.println("���Է�:");
		long z=sc.nextLong();
		
		System.out.println("�Ǽ��Է�:");
		float a=sc.nextFloat();
		
		
		System.out.println("���ڿ� �Է�:");
		String str=sc.next();
		
		System.out.println(x);
		System.out.println(y);
		System.out.println(z);
		
		System.out.println(a);
		System.out.println(str);
		
		System.out.println("���� �Է�");
		String s=sc.next();
		char ch = s.charAt(0);
		System.out.println(ch);
		
		sc.close();

	}

}
