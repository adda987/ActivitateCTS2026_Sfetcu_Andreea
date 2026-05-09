package chain_of_responsibility_b16.clase;

public class NotificatorEmail extends NotificatorHandler{

    @Override
    public void notifica(Client client,String mesaj) {
        if(client.getEmail()!=null){
            System.out.println("Clientul "+client.getNume()+" ai un email cu mesajul: "+mesaj);
        }else{
            super.succesor.notifica(client,mesaj);
        }
    }
}
