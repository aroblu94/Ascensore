public class Ascensore {

	//CAMPI
	private int personeMax;
	private double pesoMax;
	private Vector<Persona> utenti;

	//COSTRUTTORE
	public Ascensore (int maxPersone, double maxPeso) {
		personeMax = maxPersone;
		pesoMax = maxPeso;
		utenti = new Vector<Persona>;
	}

	//METODI
	public boolean sale(Persona p) {
		if (capienzaAttuale < personeMax || (pesoAttuale + p.peso()) <= pesoMax) {
			utenti.add(Persona p);
			return true;
		}
		else return false;
	}

	public void scende(Persona p) {
		utenti.remove(p);
	}

	//Metodi aggiuntivi...

}