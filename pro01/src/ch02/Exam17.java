package ch02;

/**
 * @date : 2021. 5. 12.
 * @author : sang woo
 * @description : 제어문 -반복문 while, do~while문 / 초기값, 조건값, 증감
 *                while(조건식){
 *                }
 */
public class Exam17 {

	public static void main(String[] args) {
		
		int x = 1; //시작
		
		while(x <=10) {  //조건식
			System.out.println(x);
			++x;           //증감값
		}
		
		System.out.println();

		// 1~10 합
		int sum=0;
		int i=1;
		
		while(i<=10) {
			sum=sum+i;
			++i;
		}
		System.out.println(sum);
		
		// 1~100까지 짝수합
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
