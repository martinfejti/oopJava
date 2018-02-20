package array;



public class Array {

	public static void main(String[] args) {
		
		int[] array = new int[10];
		
		for(int i=0; i<array.length; i++) {
			array[i] = i+1;
			System.out.println("Az " + i + " elem: " + array[i]);
		}
		
		int max = array[0];
		for(int i=0; i<array.length; i++) {
			if(array[i] > max)
				max=i;
		}
		System.out.println("A tömb legnagyobb eleme: " + array[max]);
	
		int keresett = 5;
		
		for(int i=0; i<array.length; i++) {
			if(array[i] == keresett) {
				System.out.println("Van benne ilyen elem!");
			} else 
				System.out.println("Nem van benne ilyen!");
		}
	}
	

}
