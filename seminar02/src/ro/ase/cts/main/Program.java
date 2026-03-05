package ro.ase.cts.main;

import ro.ase.cts.clase.Aplicant;
import ro.ase.cts.clase.readere.AngajatiReader;
import ro.ase.cts.clase.readere.AplicantiReader;

import java.io.FileNotFoundException;
import java.util.List;


public class Program {

	public static void main(String[] args) {
		List<Aplicant> listaAplicanti;
		Aplicant.setPrag(85);
		try {
			AplicantiReader angajatReader=new AngajatiReader("angajati.txt");
			listaAplicanti = angajatReader.readAplicanti();
			for(Aplicant aplicant:listaAplicanti) {
				System.out.println(aplicant.toString());
				aplicant.afisareVenit();
				aplicant.afisareStatut();
			}
		} catch (FileNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}

}
