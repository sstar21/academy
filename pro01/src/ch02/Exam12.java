package ch02;

/**
 * @date : 2021. 5. 11.
 * @author : sang woo
 * @description : ��� - ���ǹ� (switch ~ case��)
 */
public class Exam12 {

	public static void main(String[] args) {
		int su = 2;
		
		switch(su) {         // �Ǽ�, ���ǽ� �ȵȴ�.
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
			System.out.println("��Ÿ ���");
		}
		
		System.out.println();
		
		char a='B';
		
		switch(a) {                       // if(a=='W' || a=='w'){
		case 'W': case 'w':
			System.out.println("���");
			break;	
			
		case 'B': case 'b':
			System.out.println("���");
			break;
		
		case 'Y' : case 'y':
			System.out.println("�����");
			break;
		
		case 'R' : case 'r' :
			System.out.println("����");
			break;
		}
		
		
		
	
		
		
	}

}
