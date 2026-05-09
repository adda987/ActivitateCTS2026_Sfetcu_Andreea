package chain_of_responsibility_b16.clase;

public class NotificatorSMS extends NotificatorHandler{
    @Override
    public void notifica(Client client,String mesaj) {
        if(client.getTelefon()!=null){
            System.out.println("Clientul "+client.getNume()+" ai un SMS cu mesajul: "+mesaj);
        }else{
            super.succesor.notifica(client,mesaj);
        }
    }
}
