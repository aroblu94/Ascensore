public class Persona{
			//campi
			private  int peso;
			private int destinazione;
			
			//costruttore
			public Persona(int x, int y){
				peso=x;
				destinazione=y;
			}
			//metodi
			public int getDestinazione(){
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
				return " peso: "+peso+" destinazione: "+ destinazione;
			}

}