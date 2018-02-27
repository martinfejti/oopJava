package masodfoku;

import java.util.Scanner;

public class Masodfoku {
	public static void main(String[] args) {
		
		/*
		 int a = 5;
		 
		int b = 20;
		int c = 2;
		*/
		int egyutt[] = new int[3];
		
		double discriminant = 0;
		
		double x1, x2 = 0;
		
		Scanner sc = new Scanner(System.in);
		int a = 0;
		int b = 0;
		int c = 0;
		
		System.out.println("Kerem az elso egyutthatot: ");
		egyutt[0] = sc.nextInt();
		
		System.out.println("Kerem az masodik egyutthatot: ");
		egyutt[1] = sc.nextInt();
		
		System.out.println("Kerem az harmadik egyutthatot: ");
		egyutt[2] = sc.nextInt();
		
		a = egyutt[0];
		b = egyutt[1];
		c = egyutt[2];
		
		sc.close();
		
		// ksgidgd
		
		/* uodtutf
		 * uortzouhr
		 */
		
		discriminant = Math.sqrt((b * b) - 4 * a * c); 
		System.out.println(discriminant);
		
		if(Double.isNaN(discriminant)) {
			System.out.println("Nincs valós megoldás!");
		} else {
			x1 = (b * (-1) + discriminant) / 2 * a;
			x2 = (b * (-1) - discriminant) / 2 * a;
			System.out.println("A megoldások:\n x1: " + x1 + "\n x2: " + x2);
		}
		
	}
}
