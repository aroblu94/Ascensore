import java.util.*;

public class Ascensore implements Iterable<Persona>{
		private int pesomax;
		private int capienza;
		private int pesoattuale;
		private Vector <Persona> passeggeri;
		
		//costruttore
		public Ascensore(int x,int y){
			pesomax=x;
			capienza=y;
			pesoattuale=0;
			passeggeri=new Vector <Persona> ();
		}
		//metodi
		public boolean sale(Persona a){
			pesoattuale=pesoattuale+a.getPeso();
			if((pesoattuale<=pesomax)&&(passeggeri.size()<=capienza)){
				passeggeri.add(a);
				return true;
				}
			else return false;
		}
		public boolean isPieno(){
		return (pesoattuale>=pesomax||passeggeri.size()>=capienza);
		}
		public void Scende(Persona p){
			pesoattuale=pesoattuale-p.getPeso();
			passeggeri.remove(p);
		}
		public Iterator<Persona> iterator(){
			return this.passeggeri.iterator();
		}
}