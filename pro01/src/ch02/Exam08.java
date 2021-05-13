package ch02;

/**
 * @date : 2021. 5. 11.
 * @author : sang woo
 * @description : 제어문 - 조건문 , 반복문
 * 				  조건문 : 조건에 맞는 데이터 찾아서 처리
 * 				  반복문 : 해당 데이터를 반복 처리
 * 
 * 				  조건문 : if문, if~else 문, 다중 if ~ else 문
 * 				  형식1) if문 : if(조건식) {
 *								 조건식이 참일 때 실행하는 문장들; 
 *                              }						
 */
public class Exam08 {

	public static void main(String[] args) {
		
		 int x =-20;
		 
		 if(x > 0) {  //if(20 >0 참)
			 System.out.println("양수입니다.");
		 }
		 
         System.out.println("HAHAHAHA");
         
         int y=10;
         
         if(y > 50 && y <150) {  // 110 > 50 && 110 <150
        	 y+=200; //310
        	 System.out.println(y);
         }
         
         System.out.println(y);
         
         int score1 = 60;
         int score2 = 80;
         int hap = score1 + score2;
         float div =(float) hap/2;
         
         if(div > 50) {
        	 System.out.println("합격");
         }

	}

}
