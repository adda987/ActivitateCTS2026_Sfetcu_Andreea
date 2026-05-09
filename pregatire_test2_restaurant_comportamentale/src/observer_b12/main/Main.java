package observer_b12.main;

import observer_b12.clase.Client;
import observer_b12.clase.ClientFidel;
import observer_b12.clase.IRestaurant;
import observer_b12.clase.Restaurant;

public class Main {
    public static void main(String[] args) {
        Client client1=new ClientFidel("Andreea");
        Client client2=new ClientFidel("Alina");
        Client client3=new ClientFidel("Denis");

        IRestaurant restaurant=new Restaurant("Infinity");
        restaurant.aboneazaClient(client1);
        restaurant.aboneazaClient(client2);
        restaurant.aboneazaClient(client3);

        ((Restaurant)restaurant).trimiteNotificareOfertaPret();
        restaurant.dezaboneazaClient(client3);
        restaurant.dezaboneazaClient(client2);
        System.out.println("====================");
        ((Restaurant)restaurant).trimiteNotificareMeniuNou();
    }
}
