import java.util.*;

public class Colonna extends Ascensore {
	
	//CAMPI
	private Ascensore ascensore;
	private Vector<Piano> piani;

	//COSTRUTTORE
	public Colonna(Ascensore a) {
		this.ascensore = a;
		piani = new Vector<Piano>();
	}


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