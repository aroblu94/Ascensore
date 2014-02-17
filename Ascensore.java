import java.util.*;

public class Ascensore {//implements Iterable<Persona> {
	//CAMPI
	private int pesomax;
	private int capienza;
	private int pesoattuale;
	private Vector<Persona> passeggeri;
		
	//COSTRUTTORE
	public Ascensore(int x,int y) {
		pesomax = x;
		capienza = y;
		pesoattuale = 0;
		passeggeri = new Vector<Persona>();
	}

	//METODI
	public boolean sale(Persona a) {
		pesoattuale = pesoattuale + a.getPeso();
		if((pesoattuale <= pesomax) && (passeggeri.size() <= capienza)){
			passeggeri.add(a);
			return true;
			}
		else return false;
	}

	public boolean isPieno() {
		return (pesoattuale >= pesomax || passeggeri.size() >= capienza);
	}

	public void scende(Persona p) {
		pesoattuale = pesoattuale - p.getPeso();
		passeggeri.remove(p);
	}

	/*public Iterator<Persona> iterator() {
		return this.passeggeri.iterator();
	}*/

	public Vector<Persona> getVettore() {
		return this.passeggeri;
	}

	public int getPasseggeri() {
		return passeggeri.size();
	}
}