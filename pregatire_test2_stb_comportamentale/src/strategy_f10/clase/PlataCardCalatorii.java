package strategy_f10.clase;

public class PlataCardCalatorii implements ModalitateDePlata{
    @Override
    public void plateste(String numeCalator, double suma) {
        System.out.println("Calatorul cu numele "+numeCalator+" a platit cu cardul de calatorii" +
                " suma de "+suma);
    }
}
