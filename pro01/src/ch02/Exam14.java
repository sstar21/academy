package ch02;


/**
 * @date : 2021. 5. 11.
 * @author : sang woo
 * @description : ��� -�ݺ��� for��, ���� for �� /��ġ�ݺ�
 *                           while��, do~while �� /�����ݺ�
 *                           
 *                           for�� : for(1)�ʱⰪ;(2)���ǰ�;(4)����){
 *                                      (3)ó�� �����;
 *                                    } // 1-2-3-4, 2-3-4 , 2-3-4, 2-3-4...
 */

public class Exam14 {

	public static void main(String[] args) {
		
		for(int i=1; i<=10; i++) {
			System.out.println("How are you?");
		}
		
		System.out.println("apple \n");
		
		for(int j=1;j<=10;++j) {
			System.out.println(j); 
		}
		
		System.out.println("banana \n");
		
		for(int k=10; k>=1;k--) {
			System.out.println("hi");
		}
		System.out.println("Melon \n");
		
		for(int x =10; x>=1; x--) {
			System.out.println(x);
			
		}
		
		
	}

}
