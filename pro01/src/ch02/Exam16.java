package ch02;


/**
 * @date : 2021. 5. 12.
 * @author : sang woo
 * @description : ��� - �ݺ��� (���� for ��)
 *                ����) for(1)�ʱⰪ;2)���ǽ�;7)����){
 *                      for(3)�ʱⰪ;4)���ǽ�;6)����){
 *                            5)ó���� �����;
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
         
         // 2~9��
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


