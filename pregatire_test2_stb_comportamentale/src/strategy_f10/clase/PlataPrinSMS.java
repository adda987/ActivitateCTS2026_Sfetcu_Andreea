package strategy_f10.clase;

public class PlataPrinSMS implements ModalitateDePlata{
    @Override
    public void plateste(String numeCalator, double suma) {
        System.out.println("Calatorul cu numele "+numeCalator+" a platit prin SMS" +
                " suma de "+suma);
    }
}
