package ch03;

/**
 * @date : 2021. 5. 13.
 * @author : sang woo
 * @description : �迭 : ������ �ڷ��� ���� ��, �� ���� ������ ó��
 * 					    ������ �迭 / byte(1), short(2) , int(4), long(8) - 10, 20 �迭 ó�� int �迭�� ������ 8byte
 * 						�Ǽ��� �迭 / float, double
 * 						������ �迭
 * 						���ڿ� �迭
 */
public class Exam26 {

	public static void main(String[] args) {
		
		byte[] a = new byte [] {1,2,3,4,5,6}; //5byte
		System.out.println("2���� ��:"+a[2]);
		
		++a[3];
		System.out.println("3���� ��:"+a[3]);
		System.out.println();
		
		/*System.out.println(a[0]);
		System.out.println(a[1]);
		System.out.println(a[2]);
		System.out.println(a[3]);
		System.out.println(a[4]);*/
		
		for(int i=0;i<5;i++) {
			System.out.println(a[i]);
		}
		System.out.println();
		
		char [] ch = new char[] {'A','B','C','D','E','F','G'}; //char 14byte
		System.out.println(ch[3]);
		
		for(int i=0;i<ch.length;i++) {
			System.out.println(ch[i]);
		}
		System.out.println("�迭�Ǳ���"+ch.length);
		System.out.println("�迭�Ǳ���"+a.length);
		System.out.println();
		
		String[] str = new String[] {"apple","hi","love","�ȳ��ϼ���"};
		System.out.println(str[1]);
		
		for(int i=0; i<str.length;i++) {
			System.out.println(str[i]);
		}
		
		
		
		
		
		
		
	}

}
