package ch01;

/* @�ۼ��� : 2021.05.10
 * @�ۼ��� : �ѻ��
 * @�� �� : ������
 *             1) �ֿ켱 ������ : . [] () 
 *             2) ���� ������ : !(�Ϲݺ���), ~(��������), +/-, ++/--, (cast �Ǵ� �ڷ��� ������)
 *             3) ��� ������
 *             4) ����Ʈ ������
 *             5) �� ������
 *             6) �� ������
 *             7) ���� ������
 *             8) ���� ������
 *             9) ������ ������
 *             10) ����(�ĸ�) ������
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
