package ch01;

/**
 * @date : 2021. 5. 10.
 * @author : sang woo
 * @description : 2) ���� ������ : !(�Ϲݺ���), ~(��������), +/-, ++/-- ������ ����������, (cast �Ǵ� �ڷ��� ������)
 * 				  3) ��� ������ : + , - , * ,/ , %(������)
 * 				  4) ����Ʈ ������ : <<, >>, >>> ��Ʈ�̵�(������)
 * 				  5) �� ������ : <, > ,>=, <=, ==, !=
 * 				  6) �� ������ : &, ^, |(����), &&, ||(������) 
 * 				  8) ���� ������ : =
 * 				  9) ������ ���� ������  : ���� �ڿ� ���� ++/--
 */

public class Exam04 {

	public static void main(String[] args) {
		// byte, short, int, long
		
		byte a=10;
		byte b=a;
		System.out.println(a+"\t" + b);
		
		byte c=20;
		short d=c;
		System.out.println(c+"\t" + d);
		
		short x=50;
		byte y=(byte) x;
		System.out.println(x + "\t" + y);
		
		int su = 1000;
		short value =(short) su;
		System.out.println(su + "\t" + value);
		
		float i = 24.5f;
		float j = i;
		System.out.println(i + "\t" + j);
		
		double ii = 55.5;
		float jj = (float) ii;
		System.out.println(ii + "\t" + jj);
		
		int aa=10;
		int bb=20;
		int cc = aa+bb;
		System.out.println(cc);
		
		float dd=22.2f;
		float kk=aa+dd;
		System.out.println(kk);
		
		int su1 = 22;
		float su2 = 24.5f;
		int su3 = su1+(int)su2;
		System.out.println(su3);
		System.out.println();
	
		int kor =100;
		int eng = 77;
		int mat = 88;
		int tot = kor + eng + mat;
		float avg = (float) tot/3; //220.0f /3
		System.out.println(avg);
				
		int v =10;
		int t =3;
		float zz = v/(float)t;      // 10/3.0
		System.out.println("zzz:"+zz);
		System.out.println();
		
		int s = 10;
		int q = 20;
		int sum = s + q;
		int cha = s - q;
		int mu1 = s * q;
		float div =(float) s / q; // 10.0f/20
		int rest = s%3; // s���� 3�� ���� ��������
		System.out.println("��:" + sum);
		System.out.println("��:" + cha);
		System.out.println("��:" + mu1);
		System.out.println("������:" + div);
		System.out.println("������:" + rest);
		
		
		
		
	}

}
