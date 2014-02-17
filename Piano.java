import java.util.*;

public class Piano {
	//CAMPI
	private Vector <Persona> inattesa; 
	private int numero;

	//COSTRUTTORE
	public Piano(int x){
		numero=x;
		inattesa= new Vector<Persona>();
	}

	//METODI
	public int quante(){
		return inattesa.size();
	}

	public Persona persona(int i){
		 return inattesa.elementAt( i);
	}

	public void addPersona(Persona p) {
		inattesa.add(p);
	}

	public int getNumero(){
		return numero;
	}

	public boolean sale(int i, Ascensore a){
		if(a.isPieno()==false){
			a.sale(inattesa.elementAt(i));
			inattesa.remove(i);
			return true;
		}
		else return false;
	}
		
	public Vector<Persona> getVettore() {
		return this.inattesa;
	}

	public String toStringVector() {
		String s = "";
		for(Persona p : inattesa)
			s = s + (p + "\n");
		return s;
	}

	public String toString() {
		return ("PIANO " + numero + "\n" + this.toStringVector());
	}
}