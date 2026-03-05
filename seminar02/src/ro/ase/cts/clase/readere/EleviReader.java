package ro.ase.cts.clase.readere;

import ro.ase.cts.clase.Aplicant;
import ro.ase.cts.clase.Elev;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class EleviReader extends AplicantiReader{

    public EleviReader(String numeFisier){super(numeFisier);}

    public List<Aplicant> readAplicanti() throws FileNotFoundException {
        Scanner input = new Scanner(new File(super.numeFisier));
        input.useDelimiter(",|\n");
        List<Aplicant> elevi = new ArrayList<Aplicant>();

        while (input.hasNext()) {
           Elev e=new Elev();
           super.citesteAplicant(input,e);
            int clasa = input.nextInt();
            e.setClasa(clasa);
            String tutore = input.next();
            e.setTutore(tutore);
            elevi.add(e);
        }

        input.close();
        return elevi;
    }
}
