package ch02;

/**
 * @date : 2021. 5. 12.
 * @author : sang woo
 * @description : 제어문 - 조건문, 반복문
 * 								 break , continue - 반복문에서 중간에 멈추고 싶을 때 주로 사용
 */
public class Exam20 {

	public static void main(String[] args) {
		
		for(int i=1;i<=100;i++) {
			if(i==5) {
				break;
			}
			
			System.out.println(i); //49번까지 돈거 가정 
		}
		System.out.println();
		
		for(int i =1;i<=10;i++) {
			if(i==5) {
				continue;
			}
			System.out.println(i);  // 4 6
			
		}
	}

}
