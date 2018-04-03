package alkalmazott;

import java.util.Scanner;

public class AlkalmazottFut {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		Alkalmazott[] alkArray;
		
		System.out.println("Kérem az alkalmazottak számát: ");
		int numberofEmp = sc.nextInt();
		
		alkArray = new Alkalmazott[numberofEmp];
		
		for (int i=0; i<alkArray.length; i++){
			
			System.out.println("Kérem az " + (i+1) + ". alkalamzott nevét: ");
			String name = sc.next();
			
			System.out.println("Kérem az " + (i+1) + ". alkalamzott korát: ");
			int age = sc.nextInt();
			
			System.out.println("Kérem az " + (i+1) + ". alkalamzott fizetését: ");
			int payment = sc.nextInt();
			
			alkArray[i] = new Alkalmazott(name, age, payment);
		}
		
		sc.close();
		
		for(Alkalmazott a : alkArray){
			System.out.println(a.toString());
		}
		
		Alkalmazott.setNyugdijKorhatar(30);
		
		for(Alkalmazott a : alkArray){
			System.out.println(a.toString());
		}
		
		for(Alkalmazott a : alkArray){
			if(a.getEvekNyugdijig() < 5)
				System.out.println(a.toString());
		}
		
		int sum = 0;
		double ageAverage = 0.0;
		
		for(int i=0; i<alkArray.length; i++) {
			sum = sum + alkArray[i].getEvekNyugdijig();
		}
		
		ageAverage = (double)sum/(double)numberofEmp;
		
		for(Alkalmazott a: alkArray) {
			if(a.getEvekNyugdijig() > ageAverage){
				System.out.println(a.toString());
			}
		}
		
		Alkalmazott[] sortedArray = new Alkalmazott[alkArray.length];
		Alkalmazott temp;
		for(int j=0; j<alkArray.length -1; j++){
			for(int i=0; i<alkArray.length -1; i++){
				if(alkArray[i].getEvekNyugdijig() > alkArray[i+1].getEvekNyugdijig()){
					temp = alkArray[i];
					alkArray[i] = alkArray[i + 1];
					alkArray[i+1] = temp;
					sortedArray = alkArray;
				}
			}
		}
	}

}
