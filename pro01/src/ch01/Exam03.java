package ch01;

/**
 * @date : 2021. 5. 10.
 * @author : sang woo
 * @description : 2) ���� ������ : !(�Ϲݺ���), ~(��������), +/-, ++/-- ������ ����������, (cast �Ǵ� �ڷ��� ������)
 * 				  3) ��� ������ : + , - , * ,/ , %(������)
 * 				  8) ���� ������ : =
 * 				  9) ������ ���� ������  : ���� �ڿ� ���� ++/--
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
