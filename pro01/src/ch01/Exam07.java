package ch01;

/**
 * @date : 2021. 5. 11.
 * @author : sang woo
 * @description : 7) ���׿����� : ���ǽ� ? ��:����
 * 			      8) ���� ������ : =, *=, /= , &=, ^=, !=, +=, != ....
 * 				  9) ������ ���������� : ++/--
 * 				  10) ����(�ĸ� ������) : ,
 */

public class Exam07 {

	public static void main(String[] args) {
		int a = 20;
		int b = 30;
		int c = a!=b ? a:b;  // ���̸� a�� �����̸� b�� �Ѿ
		String str = a==b ? "apple" : "banana"; // ���ڿ��̶� �����ִ°��� String �� �޴´�.
		
		System.out.println("c:" + c);
		System.out.println("str:" + str);
		
		int jumsu =50;
		String result = jumsu > 50 ? "�հ�" : "���հ�"; // (su%2==0) ? "¦��" : "Ȧ��" // (su > 0) ? "���" : "����"  // (age >=20 && age < 30)
		System.out.println(result); // ���׿������� ������ : ���� �Ѵ� ������.
		
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
