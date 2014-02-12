public class Piano {
	
	//CAMPI
	private Vector<Persona> personeInAttesa;
	private int numero;

	//COSTRUTTORE
	public Piano (int n) {
		numero = n;
		personeInAttesa = new Vector<Persone>;
	}

	//METODI
	public int quante() {
		return personeInAttesa.size();
	}

	public Persona persona(int i) {
		return personeInAttesa.get(i);
	}

	public boolean sale(int i, Ascensore a) {
		a.sale(this.persona(i));
		if (a.sale() == true)
			personeInAttesa.remove(i);
	}

	//Metodi aggiuntivi...
	public int getNumero() {
		return this.numero;
	}
}