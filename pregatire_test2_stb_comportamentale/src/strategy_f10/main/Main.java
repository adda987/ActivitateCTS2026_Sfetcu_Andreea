package strategy_f10.main;

import strategy_f10.clase.Calator;
import strategy_f10.clase.ModalitateDePlata;
import strategy_f10.clase.PlataCardCalatorii;
import strategy_f10.clase.PlataPrinSMS;

public class Main {
    public static void main(String[] args) {
        Calator calator=new Calator("Andreea");
        calator.platesteCalatorie(5);

        calator.setModalitateDePlata(new PlataCardCalatorii());
        calator.platesteCalatorie(2.5);

        calator.setModalitateDePlata(new PlataPrinSMS());
        calator.platesteCalatorie(4);
    }
}
