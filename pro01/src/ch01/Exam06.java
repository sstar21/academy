package ch01;

/**
 * @date : 2021. 5. 11.
 * @author : sang woo
 * @description : 6) �� ������ : &, ^, |(����), &&, ||(������) 
 */

public class Exam06 {

	public static void main(String[] args) {
		
		byte a = 10;  // 1byte == 8bit, 2byte == 16bit, 4bite ==32bit , 8byte == 64bit
		byte b = 2;
		
		// a =10 �� 2������ 1010 // 0000 1010 == 10 8��Ʈ�� �÷����� 0���� ä���� 
		// 2�� �������� //  0000 0010 == 2
		// ----------------------& ���� ������ ���� �� ���̴�  ���� 1 ������ 0
        // 0000 0010 & = 2
	    // 0000 1010 | == 10                 or 
		// 0000 1000 ^ == 8                  
		
		System.out.println((a&b));
		System.out.println((a|b));
		System.out.println((a^b));
		System.out.println();
		
		int  x =15;
		boolean y = x>10 && x<20; // 15 > 10 1(��)      (��)1 15 < 20  true�� ���´�.
		boolean z = x==10 || x==15; // 15==10 ����   or   (��)15 == 15
		System.out.println(y);
		System.out.println(z);
		
		
		

	}

}
