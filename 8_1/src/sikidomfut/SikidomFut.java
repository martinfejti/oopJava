package sikidomfut;

import pekidzs.Henger;
import pekidzs.Teglatest;

public class SikidomFut {

	public static void main(String[] args) {
		Henger h1 = new Henger(5, 10);
		
		System.out.println(h1.toString());
		System.out.println("A h1 t�rfogata: " + h1.getVolume());
		
		Teglatest t1 = new Teglatest(5, 10, 5);
		
		System.out.println(t1.toString());
		System.out.println("A t1 t�rfogata: " + t1.getVolume());
	}

}
