package ch02;

/**
 * @date : 2021. 5. 12.
 * @author : sang woo
 * @description : ��� - ���ǹ�, �ݺ���
 * 								 break , continue - �ݺ������� �߰��� ���߰� ���� �� �ַ� ���
 */
public class Exam20 {

	public static void main(String[] args) {
		
		for(int i=1;i<=100;i++) {
			if(i==5) {
				break;
			}
			
			System.out.println(i); //49������ ���� ���� 
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
