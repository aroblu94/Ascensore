import java.util.Vector;
import java.util.Iterator;
public class Piano {
		//campi
		private Vector <Persona> inattesa; 
		private int numero;
		public Piano(int x){
			numero=x;
			inattesa= new Vector <Persona> ();
		}
		public int quante(){
			return inattesa.size();
		}
		public Persona persona(int i){
			 return inattesa.elementAt( i);
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
		
}