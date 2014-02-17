import java.util.*;

public class Persona {
	
	//CAMPI
	private int peso;
	private int destinazione;

	//COSTRUTTORE
	public Persona(int p, int d) {
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

	public String toString() {
		return ("Peso: " + peso + "kg - Destinazione: piano " + destinazione);
	}

}
