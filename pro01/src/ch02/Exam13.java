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
			System.out.println("Â¦¼ö:"+su);
			break;
		
		case 1 :
			su*=10;
			System.out.println("È¦¼ö:"+su);
		}

		// if(su%2==0){
		//}else{
		//}
		
	}

}
