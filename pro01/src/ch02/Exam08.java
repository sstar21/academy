package ch02;

/**
 * @date : 2021. 5. 11.
 * @author : sang woo
 * @description : ��� - ���ǹ� , �ݺ���
 * 				  ���ǹ� : ���ǿ� �´� ������ ã�Ƽ� ó��
 * 				  �ݺ��� : �ش� �����͸� �ݺ� ó��
 * 
 * 				  ���ǹ� : if��, if~else ��, ���� if ~ else ��
 * 				  ����1) if�� : if(���ǽ�) {
 *								 ���ǽ��� ���� �� �����ϴ� �����; 
 *                              }						
 */
public class Exam08 {

	public static void main(String[] args) {
		
		 int x =-20;
		 
		 if(x > 0) {  //if(20 >0 ��)
			 System.out.println("����Դϴ�.");
		 }
		 
         System.out.println("HAHAHAHA");
         
         int y=10;
         
         if(y > 50 && y <150) {  // 110 > 50 && 110 <150
        	 y+=200; //310
        	 System.out.println(y);
         }
         
         System.out.println(y);
         
         int score1 = 60;
         int score2 = 80;
         int hap = score1 + score2;
         float div =(float) hap/2;
         
         if(div > 50) {
        	 System.out.println("�հ�");
         }

	}

}
