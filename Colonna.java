import java.util.Vector;
public class Colonna{
		private Ascensore ascensore;
		private Piano pianocorrente;
		private Vector <Piano> lista;
		
		public Colonna(Ascensore a){
			ascensore=a;
			lista=new Vector <Piano> ();
			pianocorrente=null;
		}
		public void addPiano(Piano p){
			lista.add(p);
			if(pianocorrente==null)
				pianocorrente=p;
		}
		public void muoviAscensore(int prossimoPiano){
			for(Piano p:lista)
				if(p.getNumero()==prossimoPiano)
				pianocorrente=p;
		}
		public Piano piano(){
			return pianocorrente;
		}
		public int nrPiano(){
			return pianocorrente.getNumero();
		}
		
}