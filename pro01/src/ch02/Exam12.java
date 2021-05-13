package ch02;

/**
 * @date : 2021. 5. 11.
 * @author : sang woo
 * @description : 제어문 - 조건문 (switch ~ case문)
 */
public class Exam12 {

	public static void main(String[] args) {
		int su = 2;
		
		switch(su) {         // 실수, 조건식 안된다.
		case 1:
			System.out.println("1");
			break;
		case 2:
			System.out.println("2");
			break;
		case 3:
			System.out.println("3");
			break;
		case 4:
			System.out.println("4");
			break;
		case 5:
			System.out.println("5");
			break;
		default:
			System.out.println("기타 등등");
		}
		
		System.out.println();
		
		char a='B';
		
		switch(a) {                       // if(a=='W' || a=='w'){
		case 'W': case 'w':
			System.out.println("흰색");
			break;	
			
		case 'B': case 'b':
			System.out.println("블루");
			break;
		
		case 'Y' : case 'y':
			System.out.println("노란색");
			break;
		
		case 'R' : case 'r' :
			System.out.println("빨강");
			break;
		}
		
		
		
	
		
		
	}

}
