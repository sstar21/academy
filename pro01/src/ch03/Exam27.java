package ch03;


/**
 * @date : 2021. 5. 13.
 * @author : sang woo
 * @description : 
 */
public class Exam27 {

	public static void main(String[] args) {
		int[] array = new int[] {10,20,30,40,50};
		++array[1];
		
		for(int i=0;i<array.length;i++) {
			System.out.println(++array[i]);
		}
			System.out.println();
			
		for(int i=0;i<array.length;i++) {
			if(array[i]>20 && array[i]<40) {
				System.out.println(array[i]);
			}
		}
		System.out.println();
		
		int[] barray = new int[] {1,2,3,4,5};
		int hap = 0;
		
		for(int i=0;i<barray.length;i++) {
			hap = hap+barray[i];
		}
		System.out.println("hap"+hap);
		
		for(int i=0; i<barray.length;i++) {
			if(barray[i]%2==0) {
				System.out.println(barray[i]);
			}
		}
	}

}
