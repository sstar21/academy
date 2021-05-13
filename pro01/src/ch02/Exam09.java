package ch02;

/**
 * @date : 2021. 5. 11.
 * @author : sang woo
 * @description : 제어문 - 조건문  : 형식 2) if~else 문
 * 				  if(조건식){
 * 					참일때 실행하는 문장들;
 * 				 }else{
 * 					 거짓일 때 실항하는 문장들;
 *               }
 */
public class Exam09 {

	public static void main(String[] args) {
		
		int a  = 9;
		
		if(a > 0) {
			System.out.println("양수입니다.");
		}else {
			System.out.println("음수입니다.");
		}

		
		String str = a>0 ? "양수입니다.":"음수입니다.";
		System.out.println(str);
		System.out.println();
		
		if(a%2==0) {    //  짝수
			a+=100;
			a*=200;
			System.out.println(a);
		}else {         //  홀수
			a-=10;
			a*=5;
			System.out.println(a);
		}
	}
}
