package ch02;

/**
 * @date : 2021. 5. 12.
 * @author : sang woo
 * @description : �⺻ �ʱ�ȭ
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
		//����ǥ �Է� �ޱ�
		
		System.out.println("���� ����:");
		int kor = sc.nextInt();
		
		System.out.println("���� ����:");
		int eng = sc.nextInt();
		
		System.out.println("���� ����:");
		int mat = sc.nextInt();
		
		int tot = kor + eng + mat;
		float avg = (float) tot/3;
		
		String hakjum = "";
		if(avg >90) {
			hakjum = "��";
		}else if(avg >=80) {
			hakjum = "��";
		}else if(avg >=70) {
			hakjum = "��";
		}else if(avg <70) {
			hakjum = "�����";
		}
		
		System.out.println("����:"+tot);
		System.out.println("���:"+avg);
		System.out.println("����:"+hakjum);
		
		System.out.println("------------");
		
		char loop = 0;
		
		do {
			System.out.println("���Է�:");
			int dan=sc.nextInt();
			
			for(int i=1; i<=9; i++) {
				System.out.println(dan + "*" + i + "=" +(dan *i));
			}
			
			System.out.println("���ҷ� Y�Ǵ� y�� ����");
			String str=sc.next();
			loop=str.charAt(0);
			
			
		}while(loop=='Y'|| loop =='y');
		
		
		
		
		sc.close();
	}

}
