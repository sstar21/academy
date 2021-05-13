package ch02;

/**
 * @date : 2021. 5. 12.
 * @author : sang woo
 * @description : 제어문 - 반복문 (do ~while 문) / 초기값, 조건식, 증감값
 * 				  do{
 * 					문장들;
 * 					}while(조건식);
 */
public class Exam18 {

	public static void main(String[] args) {
		
		int x=1;                           //초기값
		do {
			System.out.println(x);         
			++x;                               //증감값
			
		}while(x<=10);                       //조건식
		System.out.println();
		
		// 1~10 합
		int hap = 0;
		int i=1;
		do {
			hap=hap+i;
			++i;
		}while(i <=10);
		
		System.out.println(hap);
	}

}
