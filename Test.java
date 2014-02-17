import java.lang.*;

public class Test {

	private static boolean debug = true;

	public static void main(String[] args) {
		Ascensore a = new Ascensore(600,6);
		Colonna c = new Colonna(a);
		Piano p1 = new Piano(1);
		Piano p2 = new Piano(2);
		Piano p3 = new Piano(3);
		Piano p4 = new Piano(4);

		if(debug) 
			System.out.println(p1 + "\n" + p2 + "\n" + p3 + "\n" + p4 + "\n");

		//aggiungo i piani alla colonna
		c.addPiano(p1);
		c.addPiano(p2);
		c.addPiano(p3);
		c.addPiano(p4);

		if(debug) 
			System.out.println(c + "\n");

		//creo le persone
		Persona test1 = new Persona(60, 2);
		Persona test2 = new Persona(58, 2);
		Persona test3 = new Persona(100, 4);
		Persona test4 = new Persona(75, 1);
		Persona test5 = new Persona(52, 3);
		Persona test6 = new Persona(86, 4);
		Persona test7 = new Persona(62, 1);
		Persona test8 = new Persona(70, 3);
		Persona test9 = new Persona(80, 3);
		Persona test10 = new Persona(64, 4);

		if(debug) 
			System.out.println(test1 + "\n" + test2 + "\n" + test3 + "\n" + test4 + "\n"+test5 + "\n"+test6 + "\n"+test7 + "\n"+test8 + "\n" + test9 + "\n"+test10 + "\n");

		//aggiungo le persone ai piani
		p1.addPersona(test3);
		p1.addPersona(test1);
		p3.addPersona(test2);
		p2.addPersona(test6);
		p3.addPersona(test4);
		p4.addPersona(test5);
		p2.addPersona(test7);
		p1.addPersona(test8);
		p4.addPersona(test9);
		p2.addPersona(test10);

		if(debug) 
			System.out.println(p1 + "\n"+p2 + "\n"+p3 + "\n"+p4 + "\n");

		//ora tocca alle persone hehe
		if(debug)
			System.out.println("Piano attuale : " + c.nrPiano());

		c.movimentaPersone();

		System.out.println(c);
		System.out.println("Numero passeggeri : " + a.getPasseggeri() + "\n");

		c.muoviAscensore(2);
		if(debug)
			System.out.println("Piano attuale : " + c.nrPiano());

		c.movimentaPersone();

		System.out.println(c);
		System.out.println("Numero passeggeri : " + a.getPasseggeri() + "\n");

		c.muoviAscensore(3);
		if(debug)
			System.out.println("Piano attuale : " + c.nrPiano());

		c.movimentaPersone();

		System.out.println(c);
		System.out.println("Numero passeggeri : " + a.getPasseggeri() + "\n");

		c.muoviAscensore(4);
		if(debug)
			System.out.println("Piano attuale : " + c.nrPiano());

		c.movimentaPersone();

		System.out.println(c);
		System.out.println("Numero passeggeri : " + a.getPasseggeri() + "\n");

		c.muoviAscensore(3);
		if(debug)
			System.out.println("Piano attuale : " + c.nrPiano());

		c.movimentaPersone();

		System.out.println(c);
		System.out.println("Numero passeggeri : " + a.getPasseggeri() + "\n");

		c.muoviAscensore(2);
		if(debug)
			System.out.println("Piano attuale : " + c.nrPiano());

		c.movimentaPersone();

		System.out.println(c);
		System.out.println("Numero passeggeri : " + a.getPasseggeri() + "\n");

		c.muoviAscensore(1);
		if(debug)
			System.out.println("Piano attuale : " + c.nrPiano());

		c.movimentaPersone();

		System.out.println(c);
		System.out.println("Numero passeggeri : " + a.getPasseggeri() + "\n");
	}
}