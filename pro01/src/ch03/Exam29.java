package ch03;

/**
 * @date : 2021. 5. 13.
 * @author : sang woo
 * @description : 1���� �迭
 */

import java.util.Scanner;
public class Exam29 {

	public static void main(String[] args) {
		
		// 7,80,55,6,66 -> ū�� 80 ������ 6
		Scanner sc = new Scanner(System.in);
		
		int[] array = new int[5];
		
		for(int i=0;i<array.length;i++) {
			System.out.println("�� �Է�:");
			array[i] = sc.nextInt();
			
				
		}
		
		int max = array[0]; // �ʱⰪ
		for(int i = 0; i<array.length;i++) {           // 7,80,55,6,66 -> ū�� 80 ������ 6
			if(max<array[i]) {    // max < array[i]    //   0 < 7     7 < 80   80 < 55  80 < 6 80 <66 
				max=array[i];     // max = array[i]    //   7         80   
			}
		}
        System.out.println(max);                                            		
		
        
        int min = array[0];
        for(int i=0;i<array.length;i++) {
        	if(min > array[i]) {
        		min = array[i];
        	}
        	System.out.println("min:"+min);
        }
		
		
		
		sc.close();

		int su = 10; // 10�̶�°� �ʱ�ȭ ����� ���ÿ� �ʱ�ȭ
		int value = 0;
		value = 20;
		
		int r;  // 4 byte 
		r=55;
		
		// �迭���� ���
		
		int [] a = new int [] {1,2,3,4}; //�ʱ�ȭ ���ִ°�
		int [] b = new int[5]; //20 byte ����Ʈ�� Ȯ���ؾ��ؼ� 5���� ���ڰ� �ʿ� ->���߿� �Է� �޴°�
		
		int [] c;
		c = new int [10];
		
		int x[] = new int[] {1,2,3,4,5};
		int y[] = {1,2,3,4,5};
		
		
		
		
		
		
		
		
		
		
		
		
		
	}

}
