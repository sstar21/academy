package ch02;

/**
 * @date : 2021. 5. 11.
 * @author : sang woo
 * @description : ��� - ���ǹ� ( ���� if ~ else ��)
 * 				  if(���ǽ�){
 * 					 ���϶� �����;
 *                 }else if(���ǽ�){
 *                 	 ���϶� �����;
 *                 }else if(���ǽ�){
 *                   ���϶� �����;
 *                 }
 */
public class Exam10 {

	public static void main(String[] args) {
		
		String name = "���";
		int kor = 80;
		int eng = 90;
		int mat = 70;
		
		int tot = kor +eng + mat;
		float avg = (float)tot/3;
		
		System.out.println(name + "\t" +avg); // 80.0
		
		if(avg >=90) {
			System.out.println("��");
		}else if(avg >=80) {
			System.out.println("��");
		}else if(avg >=70) {
			System.out.println("��");
		}else if(avg >=60) {
			System.out.println("��");
		}else if(avg <60) {
			System.out.println("��");
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
