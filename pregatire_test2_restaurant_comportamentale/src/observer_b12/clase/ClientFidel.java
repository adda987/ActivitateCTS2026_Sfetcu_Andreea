package observer_b12.clase;

public class ClientFidel implements Client{
    private String nume;

    public ClientFidel(String nume) {
        this.nume = nume;
    }

    @Override
    public void receptioneazaNotificare(String mesaj) {
        System.out.println("Clientul fidel cu numele: "+this.nume+" a primit notificarea: "+mesaj);
    }
}
