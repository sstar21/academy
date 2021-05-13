package ch03;

/**
 * @date : 2021. 5. 13.
 * @author : sang woo
 * @description : 1차원 배열
 */

import java.util.Scanner;
public class Exam29 {

	public static void main(String[] args) {
		
		// 7,80,55,6,66 -> 큰수 80 작은수 6
		Scanner sc = new Scanner(System.in);
		
		int[] array = new int[5];
		
		for(int i=0;i<array.length;i++) {
			System.out.println("수 입력:");
			array[i] = sc.nextInt();
			
				
		}
		
		int max = array[0]; // 초기값
		for(int i = 0; i<array.length;i++) {           // 7,80,55,6,66 -> 큰수 80 작은수 6
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

		int su = 10; // 10이라는값 초기화 선언과 동시에 초기화
		int value = 0;
		value = 20;
		
		int r;  // 4 byte 
		r=55;
		
		// 배열선언 방법
		
		int [] a = new int [] {1,2,3,4}; //초기화 해주는거
		int [] b = new int[5]; //20 byte 바이트를 확보해야해서 5같이 숫자가 필요 ->나중에 입력 받는것
		
		int [] c;
		c = new int [10];
		
		int x[] = new int[] {1,2,3,4,5};
		int y[] = {1,2,3,4,5};
		
		
		
		
		
		
		
		
		
		
		
		
		
	}

}
