package alkalmazas;

public class Alkalmazott {

	private String name;
	private int payment;

	public String getName() {
		return name;
	}

	public void setName(String nameIn) {
		name = nameIn;
	}

	public int getPayment() {
		return payment;
	}

	public void setPayment(int paymentIn) {
		payment = paymentIn;
	}

	public void fizNov(int fizBe) {
		payment += fizBe;
	}
	
	public String szovegVissza() {
		String s;
		s = "Nev: " + name + " \nFizetes: " + payment;
		return s;
		//return "Nev: " + name + " \nFizetes: " + payment;
	}
	
	public boolean fizHatar(int lower, int upper) {
		
		if(payment >= lower && payment  <= upper){
			return true;
		} else {
			return false;
		}	
	}
	
	public double getAdo() {
		return (double)payment * ((double)16/(double)100);
	}
	
	public boolean nagyobbE(Alkalmazott a) {
		if(payment > a.payment){
			return true;
		} else {
			return false;
		}
	}

}
