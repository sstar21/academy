package ch02;

/**
 * @date : 2021. 5. 12.
 * @author : sang woo
 * @description : ��� - �ݺ��� (do ~while ��) / �ʱⰪ, ���ǽ�, ������
 * 				  do{
 * 					�����;
 * 					}while(���ǽ�);
 */
public class Exam18 {

	public static void main(String[] args) {
		
		int x=1;                           //�ʱⰪ
		do {
			System.out.println(x);         
			++x;                               //������
			
		}while(x<=10);                       //���ǽ�
		System.out.println();
		
		// 1~10 ��
		int hap = 0;
		int i=1;
		do {
			hap=hap+i;
			++i;
		}while(i <=10);
		
		System.out.println(hap);
	}

}
