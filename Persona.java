public class Persona {
	//CAMPI
	private  int peso;
	private int destinazione;
	
	//COSTRUTTORE
	public Persona(int x, int y) {
		peso = x;
		destinazione = y;
	}

	//METODI
	public int getDestinazione() {
		return destinazione;
	}
	
	public int getPeso(){
		return peso;
	}

	public void setPeso(int x){
		peso=x;
	}

	public void setDestinazione(int x){
		destinazione=x;
	}

	public String toString(){
		return "peso: " + peso + "kg - destinazione: piano " + destinazione;
	}

}