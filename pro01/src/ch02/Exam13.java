package ch02;

/**
 * @date : 2021. 5. 11.
 * @author : sang woo
 * @description : 
 */

public class Exam13 {

	public static void main(String[] args) {
		
		int su = 5;
		
		switch(su%2) {
		case 0 :
			su+=10;
			System.out.println("¦��:"+su);
			break;
		
		case 1 :
			su*=10;
			System.out.println("Ȧ��:"+su);
		}

		// if(su%2==0){
		//}else{
		//}
		
	}

}
