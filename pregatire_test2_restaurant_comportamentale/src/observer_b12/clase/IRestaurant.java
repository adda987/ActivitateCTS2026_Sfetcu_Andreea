package observer_b12.clase;

public interface IRestaurant {
    void aboneazaClient(Client client);
    void dezaboneazaClient(Client client);
    void trimiteNotificare(String mesaj);
}
