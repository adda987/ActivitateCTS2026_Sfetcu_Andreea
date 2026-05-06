package facade_b6.facade;

import facade_b6.clase.Masa;
import facade_b6.clase.Ospatar;

public class RestaurantFacade {
    private Ospatar ospatar;

    public RestaurantFacade(Ospatar ospatar) {
        this.ospatar = ospatar;
    }

    public void verificaMasa(Masa masa){
        if(masa.isEsteLibera()){
            if(ospatar.debarasareMasa(masa)){
                if(ospatar.aPusServeteleNoi(masa)){
                    System.out.println("Masa cu numarul: "+masa.getNrMasa()+" a fost pregatita pentru client");
                    masa.setEsteLibera(false);
                }else{
                    System.out.println("Masa cu numarul: "+masa.getNrMasa()+" nu are servetele noi");
                }
            }else{
                System.out.println("Masa cu numarul: "+masa.getNrMasa()+" nu a fost debarasata");
            }
        }else{
            System.out.println("Masa cu numarul: "+masa.getNrMasa()+" nu este libera");
        }
    }
}
