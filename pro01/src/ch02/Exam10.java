package ch02;

/**
 * @date : 2021. 5. 11.
 * @author : sang woo
 * @description : 제어문 - 조건문 ( 다중 if ~ else 문)
 * 				  if(조건식){
 * 					 참일때 문장들;
 *                 }else if(조건식){
 *                 	 참일때 문장들;
 *                 }else if(조건식){
 *                   참일때 문장들;
 *                 }
 */
public class Exam10 {

	public static void main(String[] args) {
		
		String name = "펭수";
		int kor = 80;
		int eng = 90;
		int mat = 70;
		
		int tot = kor +eng + mat;
		float avg = (float)tot/3;
		
		System.out.println(name + "\t" +avg); // 80.0
		
		if(avg >=90) {
			System.out.println("수");
		}else if(avg >=80) {
			System.out.println("우");
		}else if(avg >=70) {
			System.out.println("미");
		}else if(avg >=60) {
			System.out.println("양");
		}else if(avg <60) {
			System.out.println("가");
		}
		
		System.out.println();
		
		int num =52;
		int value =24;
		
		if(num==value) {
			System.out.println("num==value");
		}else if(num >value) {
			System.out.println("num > value");
		}else if(num < value) {
			System.out.println("num < value");
		}
		
		
		
		
		
		
		
		
	}

}
