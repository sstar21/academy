package ch03;


/**
 * @date : 2021. 5. 13.
 * @author : sang woo
 * @description : 
 */
public class Exam32 {

	public static void main(String[] args) {
		int x =10;
		int y =x;
		
		System.out.println(x);
		System.out.println(y);
	//	byte a=8;
		
	//	char ch ='A'; // A --65 a --97
		
		int[] array = new int[] {1,2,3}; // °¢°¢ 4byte ÃÑ 12byte
		//int xx = array[1];
		
		int[] barray = array;

		for(int i=0;i<array.length;i++) {
			//System.out.print(array[i]);
			
			System.out.print(array[i] + "\t");
			System.out.println();
		}
		
		for(int i=0;i<barray.length;i++) {
			System.out.print(barray[i] + "\t");
			
		}
	
		array[0] =999;
	
		for(int i=0;i<array.length;i++) {
		//	System.out.print(array[i]);
			
			System.out.print(array[i] + "\t");
			System.out.println();
		}
		
		for(int i=0;i<barray.length;i++) {
			System.out.print(barray[i] + "\t");
			
		}
	}
	

}
