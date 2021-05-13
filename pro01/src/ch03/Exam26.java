package ch03;

/**
 * @date : 2021. 5. 13.
 * @author : sang woo
 * @description : 배열 : 동일한 자료형 모임 즉, 열 단위 데이터 처리
 * 					    정수형 배열 / byte(1), short(2) , int(4), long(8) - 10, 20 배열 처리 int 배열로 잡으면 8byte
 * 						실수형 배열 / float, double
 * 						문자형 배열
 * 						문자열 배열
 */
public class Exam26 {

	public static void main(String[] args) {
		
		byte[] a = new byte [] {1,2,3,4,5,6}; //5byte
		System.out.println("2번지 값:"+a[2]);
		
		++a[3];
		System.out.println("3번지 값:"+a[3]);
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
		System.out.println("배열의길이"+ch.length);
		System.out.println("배열의길이"+a.length);
		System.out.println();
		
		String[] str = new String[] {"apple","hi","love","안녕하세요"};
		System.out.println(str[1]);
		
		for(int i=0; i<str.length;i++) {
			System.out.println(str[i]);
		}
		
		
		
		
		
		
		
	}

}
