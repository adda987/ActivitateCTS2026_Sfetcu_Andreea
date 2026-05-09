package observer_b12.clase;

import java.util.ArrayList;
import java.util.List;

public class Restaurant implements IRestaurant{
    private String denumireRestaurant;
    private List<Client> clienti;

    public Restaurant(String denumireRestaurant) {
        this.denumireRestaurant = denumireRestaurant;
        this.clienti = new ArrayList<>();
    }

    @Override
    public void aboneazaClient(Client client) {
        clienti.add(client);
    }

    @Override
    public void dezaboneazaClient(Client client) {
        clienti.remove(client);
    }

    @Override
    public void trimiteNotificare(String mesaj) {
        for(Client client:clienti){
            client.receptioneazaNotificare(mesaj +" de la restaurantul: "+this.denumireRestaurant);
        }
    }

    public void trimiteNotificareOfertaPret(){
        trimiteNotificare("A aparut o oferta noua!!!!");
    }

    public void trimiteNotificareMeniuNou(){
        trimiteNotificare("A aparut un meniu nou!!!");
    }
}
