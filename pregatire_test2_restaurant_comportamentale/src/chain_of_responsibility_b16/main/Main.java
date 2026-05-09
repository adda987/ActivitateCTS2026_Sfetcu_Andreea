package chain_of_responsibility_b16.main;

import chain_of_responsibility_b16.clase.*;

public class Main {
    public static void main(String[] args) {
        NotificatorHandler notificatorSMS=new NotificatorSMS();
        NotificatorHandler notificatorEmail=new NotificatorEmail();
        NotificatorHandler notificatorManager=new NotificatorManager();

        notificatorSMS.setSuccesor(notificatorEmail);
        notificatorEmail.setSuccesor(notificatorManager);

        Client client1=new Client("Andreea","0123456789","andreea@gmail.com");
        Client client2=new Client("Alina",null,"alina@yahoo.com");
        Client client3=new Client("Denis","1234567890",null);
        Client client4=new Client("Maria",null,null);

        notificatorSMS.notifica(client1,"notificare1");
        notificatorSMS.notifica(client2,"notificare2");
        notificatorSMS.notifica(client3,"notificare3");
        notificatorSMS.notifica(client4,"notificare4");

    }
}
