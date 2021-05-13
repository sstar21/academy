package ch02;


/**
 * @date : 2021. 5. 12.
 * @author : sang woo
 * @description : 제어문 - 반복문 (다중 for 문)
 *                형식) for(1)초기값;2)조건식;7)증감){
 *                      for(3)초기값;4)조건식;6)증갑){
 *                            5)처리할 문장들;
 *                      }
 *                } // 1-2-3-4-5-6 4-5-6.. 7-2-3-4-5-6 4-5-6.. 2-7
 */
public class Exam16 {

	public static void main(String[] args) {
		
		for(int i=1;i<=3;i++) {                  // 11 12 131415
			for(int j=1;j<=5;j++) {
				System.out.println(i+"\t"+j);
			}
				
		}
         System.out.println();
         
         for(char i='A'; i<='Z';i++) {             //AB~Z
        	 for(char j=i;j<='Z';j++) {            //B~Z
        		 System.out.print(j);
        	 }
        	 System.out.println();
         }
         System.out.println();
         
         // 2~9단
         for(int i=2;i<=9;i++) {
        	 for(int j=1;j<=9;j++) {
        		 System.out.println(i + "*" + j + "=" +(i*j));
        	 }
        	 System.out.println();
         }
        	 for(int i = 1; i<10; i++) {
     			for(int j = 2; j < 10; j++) {
     				System.out.print(j + "*" + i + "=" + (i*j) + "\t");
     			}
     			System.out.println();
     		}

         }
		
	}


