package ch02;

/**
 * @date : 2021. 5. 12.
 * @author : sang woo
 * @description : while문, do while문의 차이점
 */
public class Exam19 {

	public static void main(String[] args) {
		
		int x= 10;
		
		while(x >50) { // 10 >50
			System.out.println("while문"+ x);
			++x;
		}

		do {
			System.out.println("do while문"+x); //10
			++x;
		}while(x>50);     // 11>50
		
	}

}
