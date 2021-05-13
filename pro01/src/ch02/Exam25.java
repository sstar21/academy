package ch02;

/**
 * @date : 2021. 5. 12.
 * @author : sang woo
 * @description : 기본 초기화
 * 					int a = 0;
					float b = 0.0f;
					double c = 0.0;
					char d = 0;
					String e = null;
					String f ="";
 */

import java.util.Scanner;

public class Exam25 {

	public static void main(String[] args) {
		Scanner sc =new Scanner(System.in);
		//성적표 입력 받기
		
		System.out.println("국어 점수:");
		int kor = sc.nextInt();
		
		System.out.println("영어 점수:");
		int eng = sc.nextInt();
		
		System.out.println("수학 점수:");
		int mat = sc.nextInt();
		
		int tot = kor + eng + mat;
		float avg = (float) tot/3;
		
		String hakjum = "";
		if(avg >90) {
			hakjum = "수";
		}else if(avg >=80) {
			hakjum = "우";
		}else if(avg >=70) {
			hakjum = "미";
		}else if(avg <70) {
			hakjum = "재수강";
		}
		
		System.out.println("총점:"+tot);
		System.out.println("평균:"+avg);
		System.out.println("학점:"+hakjum);
		
		System.out.println("------------");
		
		char loop = 0;
		
		do {
			System.out.println("단입력:");
			int dan=sc.nextInt();
			
			for(int i=1; i<=9; i++) {
				System.out.println(dan + "*" + i + "=" +(dan *i));
			}
			
			System.out.println("또할래 Y또는 y를 눌러");
			String str=sc.next();
			loop=str.charAt(0);
			
			
		}while(loop=='Y'|| loop =='y');
		
		
		
		
		sc.close();
	}

}
