package ch02;

/**
 * @date : 2021. 5. 12.
 * @author : sang woo
 * @description : 
 */
public class Exam21 {

	public static void main(String[] args) {
		for(int i = 0; i < 3 ; i ++) {            // 0, 1, 2
			for(int j=0;j<5;j++) {                // 0 1 2 3 4 
				if(j==3) {          //00 01 02 
					//break;
					continue;
				}
				
				System.out.println(i+"\t"+j);  //00 01 02         10 11 12        20 21 22 
											   // 00 01 02 04      10 11 02 14    20 21 22 24
 			}
		}

	}

}
