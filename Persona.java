public class Persona {
	
	//CAMPI
	private double peso;
	private int destinazione;

	//COSTRUTTORE
	public Persona(double p, int d) {
		peso = p;
		destinazione = d;
	}

	//METODI
	public int peso() {
		return this.peso;
	}

	public int destinazione() {
		return this.destinazione;
	}

}