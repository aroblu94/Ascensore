public class Colonna extends Ascensore {
	
	//CAMPI


	//COSTRUTTORE


	//METODI
	public void muoviAscensore(int prossimoPiano) {
		
	}

	public Piano piano() {
		return this.pianoCorrente;
	}

	public int nrPiano() {
		return pianoCorrente.numero();
	}

	public void movimentaPersone() {
		for (Persona x : utenti) {
			if(x.destinazione() == pianoCorrente.numero())
				super.remove(x);
		}
	}

	//Metodi aggiuntivi...
}