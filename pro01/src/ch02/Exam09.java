package ch02;

/**
 * @date : 2021. 5. 11.
 * @author : sang woo
 * @description : ��� - ���ǹ�  : ���� 2) if~else ��
 * 				  if(���ǽ�){
 * 					���϶� �����ϴ� �����;
 * 				 }else{
 * 					 ������ �� �����ϴ� �����;
 *               }
 */
public class Exam09 {

	public static void main(String[] args) {
		
		int a  = 9;
		
		if(a > 0) {
			System.out.println("����Դϴ�.");
		}else {
			System.out.println("�����Դϴ�.");
		}

		
		String str = a>0 ? "����Դϴ�.":"�����Դϴ�.";
		System.out.println(str);
		System.out.println();
		
		if(a%2==0) {    //  ¦��
			a+=100;
			a*=200;
			System.out.println(a);
		}else {         //  Ȧ��
			a-=10;
			a*=5;
			System.out.println(a);
		}
	}
}
