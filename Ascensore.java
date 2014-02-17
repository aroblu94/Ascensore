import java.util.*;

public class Ascensore {

	//CAMPI
	private int personeMax;
	private int pesoMax;
	private int pesoAttuale;
	private Vector<Persona> utenti;

	//COSTRUTTORE
	public Ascensore (int maxPersone, int maxPeso) {
		personeMax = maxPersone;
		pesoMax = maxPeso;
		utenti = new Vector<Persona>();
	}

	//METODI
	public boolean sale(Persona p) {
		if (!this.isPieno() && (pesoAttuale + p.peso()) <= pesoMax) {
			utenti.add(p);
			return true;
		}
		else return false;
	}

	public void scende(Persona p) {
		utenti.remove(p);
	}

	//Metodi aggiuntivi...
	public boolean isEmpty() {
		return utenti.isEmpty();
	}

	public boolean isPieno() {
		if(utenti.size() < personeMax)
			return false;
		else
			return true;
	}

}