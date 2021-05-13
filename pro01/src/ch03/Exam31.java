package ch03;


/**
 * @date : 2021. 5. 13.
 * @author : sang woo
 * @description : 2차원 배열 데이터 넣기 /빼기
 */

import java.util.Scanner;
public class Exam31 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		double [][] su  = new double [2][3];
		for(int i=0; i<su.length;i++) {
			for(int j=0;j<su[i].length;j++) {
				System.out.println("수입력:");
				su[i][j]=sc.nextDouble();
				
			}
			
			System.out.println(i + "행열 입력 마침 \n");
		}
		
		for(int i = 0; i<su.length;i++) {
			for(int j=0; j<su[i].length;j++) {
				System.out.print(su[i][j]+ "\t");
			}
			System.out.println();
			
		}
		
		double hap = 0;
		for(int i=0;i<su.length;i++) {
			for(int j=0; j<su[i].length;j++) {
				if(su[i][j]>20) {
					hap = hap +su[i][j];
					
				}
			}
		}
		System.out.println("hap:" + hap);
		
		sc.close();

	}

}
