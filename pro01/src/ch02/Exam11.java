package ch02;

/**
 * @date : 2021. 5. 11.
 * @author : sang woo
 * @description : A(A+, A0, A-) / A+ 100~97 A0 96~94 A-93~90, B(B+, B0, B-).......
 */
public class Exam11 {

	public static void main(String[] args) {
		int score = 84;
		String gread="";
		
		if(score >=90) { //A
			if(score >=97) {
				gread="A+";
			}else if(score>=94 && score <=96) {
				gread="A0";
			}else if(score <=93) {
				gread="A-";
			}
			
			
		}else if(score >=80) { //B
			if(score >=87) {
				gread="B+";
			}else if(score >=84 && score <=86) {
				gread="B0";
			}else if(score <=83) {
				gread="B-";
			}
				
		}else if(score >=70) { //C
			if(score >=77) {
				gread="C+";
			}else if(score >=74 && score <=76) {
				gread="C0";
			}else if(score <=73) {
				gread="C-";
			}
		}else if(score < 70) { //재수강
			gread="재수강";
		}
		
		System.out.println("학점:" + gread);
	}

}
