package ch02;


/**
 * @date : 2021. 5. 11.
 * @author : sang woo
 * @description : 
 */
public class Exam15 {

	public static void main(String[] args) {
		for(int i=0; i<=50; i+=5) {
			System.out.print(i + "\t");
		}
		System.out.println();
		
		for(int i =0; i<=50; i++) {
			if(i%2==0) {
				System.out.print(i+ "\t");
			}
		}
		System.out.println();
		
		for(int i=0; i<=100; i++) {
			if(i>20 && i <40) {
				System.out.print(i+"\t");
			}
			
		}
		System.out.println();
		
		int hap =0;
		for(int i=1; i<=10;i++) {
			hap = hap+i;  // hap +=i;
		}
		System.out.print(hap);
		
		System.out.println();
		
		int sum = 0;
		for(int i=1; i<=100;i++) {
			if(i%2==0) {
				sum=sum+i;
			}
		}
		System.out.print("1~100 짝수합:" +sum);
		
		System.out.println();
		// 2단 출력
		
		int dan =2;
		for(int i=1; i<=9; i++) {
			System.out.println(dan+"*"+i+"="+(dan*i));
			
		
		}
		
		
		
		
		
		
		
	}

}
