package ch02;

/**
 * @date : 2021. 5. 12.
 * @author : sang woo
 * @description : ��� -�ݺ��� while, do~while�� / �ʱⰪ, ���ǰ�, ����
 *                while(���ǽ�){
 *                }
 */
public class Exam17 {

	public static void main(String[] args) {
		
		int x = 1; //����
		
		while(x <=10) {  //���ǽ�
			System.out.println(x);
			++x;           //������
		}
		
		System.out.println();

		// 1~10 ��
		int sum=0;
		int i=1;
		
		while(i<=10) {
			sum=sum+i;
			++i;
		}
		System.out.println(sum);
		
		// 1~100���� ¦����
		int hap = 0;
		int j =1;
		while(j<=100) {
			if(j%2==0) {
				hap=hap+j;
			}
			++j;
		}
		System.out.println(hap);
		
		
		int dan = 2;
		int k = 1;
		while(k<=9) {
			System.out.println(dan +"*"+k+"="+(dan*k));
			k++;
		}
		
		
	}

}
