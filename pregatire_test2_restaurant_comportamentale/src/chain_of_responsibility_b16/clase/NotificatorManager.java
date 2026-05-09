package chain_of_responsibility_b16.clase;

public class NotificatorManager extends NotificatorHandler{
    @Override
    public void notifica(Client client, String mesaj) {
        System.out.println("Restaurantul nu detine date de contact pentru clientul "+client.getNume());
    }
}
