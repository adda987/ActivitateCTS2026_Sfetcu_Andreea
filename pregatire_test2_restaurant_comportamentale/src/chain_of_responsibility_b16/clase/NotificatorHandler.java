package chain_of_responsibility_b16.clase;


public abstract class NotificatorHandler {
    protected NotificatorHandler succesor;

    public void setSuccesor(NotificatorHandler succesor) {
        this.succesor = succesor;
    }
    public abstract void notifica(Client client,String mesaj);
}
