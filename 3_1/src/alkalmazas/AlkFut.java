package alkalmazas;

public class AlkFut {

	public static void main(String[] args) {
		
		Alkalmazott[] alkok = new Alkalmazott[5];
		
		alkok[0] = new Alkalmazott();
		alkok[0].setName("Tomi1");
		alkok[0].setPayment(10);
		
		alkok[1] = new Alkalmazott();
		alkok[1].setName("Tomi2");
		alkok[1].setPayment(20);
		
		alkok[2] = new Alkalmazott();
		alkok[2].setName("Tomi3");
		alkok[2].setPayment(30);
		
		alkok[3] = new Alkalmazott();
		alkok[3].setName("Tomi4");
		alkok[3].setPayment(40);
		
		alkok[4] = new Alkalmazott();
		alkok[4].setName("Tomi5");
		alkok[4].setPayment(50);
		
		for(Alkalmazott a : alkok){
			System.out.println(a.szovegVissza());
		}
		
		int max = alkok[0].getPayment();
		for(int i = 0; i < alkok.length; i++){
			if(alkok[i].getPayment() > max);
				max = alkok[i].getPayment();
		}
		
		System.out.println("A legnagyobb fizetesu alkalmazott: " + max);
		
		int db = 0;
		for(int i=0; i<alkok.length; i++){
			if(alkok[i].fizHatar(20, 50))
				db++;
		}
		System.out.println(db + " darab alkalmazott fizetese esik az intervallumba.");
		
		Alkalmazott alkalmazott1 = new Alkalmazott();
		
		alkalmazott1.setName("Tomi");
		alkalmazott1.setPayment(8);

		System.out.println(alkalmazott1.szovegVissza());

		alkalmazott1.fizNov(15);

		System.out.println(alkalmazott1.szovegVissza());

		boolean isTrue = alkalmazott1.fizHatar(10, 20);
		if (isTrue)
			System.out.println("A megaditt hatarok koze esik a fizetes.");
		else
			System.out.println("Nem esik a megadott hatarok koze a fizetes.");
		
		System.out.println("Az ado erteke: " +alkalmazott1.getAdo());
		
		Alkalmazott alkalmazott2 = new Alkalmazott();

		alkalmazott2.setName("Tomi2");
		alkalmazott2.setPayment(80);
		
		if(alkalmazott1.nagyobbE(alkalmazott2)) {
			System.out.println("az alk1 fizetese nagyobb.");
		}
		else {
			System.out.println("Az alk2 fizetese a nagyobb.");
		}
	}

}
