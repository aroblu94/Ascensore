import java.util.*;

public class Colonna {
	//CAMPI
	private Ascensore ascensore;
	private Piano pianocorrente;
	private Vector<Piano> lista;
		
	//COSTRUTTORE
	public Colonna(Ascensore a) {
		ascensore = a;
		lista = new Vector<Piano> ();
		pianocorrente = null;
	}

	//METODI
	public void addPiano(Piano p) {
		lista.add(p);
		if(pianocorrente == null)
			pianocorrente = p;
	}

	public void muoviAscensore(int prossimoPiano) {
		for(Piano p: lista)
			if(p.getNumero() == prossimoPiano)
			pianocorrente = p;
	}

	public Piano piano() {
		return pianocorrente;
	}

	public int nrPiano() {
		return pianocorrente.getNumero();
	}

	public void movimentaPersone() {
		for(int j = 0; j < ascensore.getVettore().size(); j++) {
			if(ascensore.getVettore().elementAt(j).getDestinazione() == nrPiano()) {
				ascensore.scende(ascensore.getVettore().elementAt(j));
				j--;
			}
		}
		for(int i = 0; i < pianocorrente.quante(); i++) {
			if (pianocorrente.sale(i, ascensore))
				i--;
		}
	}

	public String toString() {
		String s = "COLONNA : \n";
		for(Piano p : lista)
			s = s + p;
		return s;
	}
		
}