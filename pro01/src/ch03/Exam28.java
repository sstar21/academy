package ch03;


/**
 * @date : 2021. 5. 13.
 * @author : sang woo
 * @description : 
 */
import java.util.Scanner;

public class Exam28 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		int[] array = new int[5];
		
		for(int i=0;i<array.length;i++) {
			
			System.out.println("¼öÀÔ·Â:");
			array[i] = sc.nextInt();
		}
		
		int hap = 0;
		for(int i=0;i<array.length;i++) {
			if(array[i] > 20) {
				hap=hap+array[i];
				
			}
		}
		System.out.println("hap:"+hap);
		
		
		sc.close();
	}

}
