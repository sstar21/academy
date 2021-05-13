package ch02;

/**
 * @date : 2021. 5. 12.
 * @author : sang woo
 * @description : 
 */
public class Exam22 {

	public static void main(String[] args) {
		
		int x=0; // int x =1;
		
		while(x<10) {
			++x; // 2 3 4 5
			
			if(x==5) {//break;
				continue;
			}
			
			System.out.println(x); // 1 2 3 4
			//++x; // 2 3 4 5
		}
		System.out.println();
		
		int y = 0;
		
		do {
			++y; //5
			
			if(y==5) { // 5==5
				//break;
				continue;
			}
			
			System.out.println(y); // 1 2 3 4 
			//++y;
			
		}while(y<10); //5 <10

			
		
	}
	

}
