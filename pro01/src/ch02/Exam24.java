package ch02;

import java.util.Scanner;
/**
 * @date : 2021. 5. 12.
 * @author : sang woo
 * @description : 
 */

public class Exam24 {

	public static void main(String[] args) {
		
		Scanner sc =new Scanner(System.in);
		
		System.out.println("임의 수 입력");
		int su=sc.nextInt();
		
		if(su > 10) {
			System.out.println(su);
		}
		
		for(int i=0;i<su;i++) {
			System.out.println("하하하");
		}
		
		sc.close();
	}

}
