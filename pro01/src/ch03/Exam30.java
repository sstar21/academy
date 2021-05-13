package ch03;


/**
 * @date : 2021. 5. 13.
 * @author : sang woo
 * @description : 배열 : 1차원배열 행, 2차원 배열 행,열 / 다차원 배열 : 3차원,4차원
 */
public class Exam30 {

	public static void main(String[] args) {
		
		int[][] array = new int[][] {{1,2,3,4},
									 {5,6,7,8},
									 {9,0,1,2}};

	    System.out.println(array[1][3]); //8 
	    System.out.println("행의수:" + array.length);  //3
	    System.out.println("0행의 열수:" + array[0].length);  
	    System.out.println("1행의 열수"+ array[1].length);
	    System.out.println("2행의 열수"+ array[2].length + "\n");
	    
	    for(int i=0; i<array.length;i++) {
	    	for(int j=0; j<array[i].length;j++) {
	    		System.out.print(array[i][j]);
	    	}
	    	System.out.println();
	    }
	    
	    System.out.println();
	    
	    int hap = 0;
	    for(int i=0; i<array.length;i++) {
	    	for(int j=0; j<array[i].length;j++) {
	    		if(array[i][j]%2==0) {
	    			hap = hap +array[i][j];
	    		}
	    	}
	    }
	    
	 
	}

}
