package random;

import java.util.Random;

public class Rand {

	public static void main(String[] args) {
		int array[] = new int[10];
		Random rnd = new Random();
		
		for(int i=0; i<array.length; i++) {
			array[i] =  rnd.nextInt(50) +1;
			//array[i] = (int)(Math.random() * 50) +1;
			System.out.println(array[i]);
		}
		
		/*for(int e : array) {
			System.out.println(e);
		}*/
		
		System.out.println("\n");
		for (int i=0; i<array.length; i++) {
			System.out.println(array[9-i] + " ");
		}
		
		int evenArray[] = new int[10];
		
		System.out.println("\n");
		for (int i=0; i<array.length; i++) {
			if(array[i] % 2 == 0)
				evenArray[i] = array[i];
		}
		
		int max = array[0];
		System.out.println("\n");
		for (int i=0; i<array.length; i++) {
			if(array[i] > max)
				max = i;
		}
		
		System.out.println("A max elem: " + array[max]);
		
		int max2 = array[0];
		System.out.println("\n");
		for (int i=0; i<evenArray.length; i++) {
			if(evenArray[i] > max2 && evenArray[i] % 2 == 0)
				max2 = i;
		}
		
		System.out.println("A max elem: " + evenArray[max2]);
		
		
	}

}
